/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.service;

import com.pfe.facade.PanneService;
import com.pfe.model.Panne;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Youness
 */
@Transactional
@Service("panneService")
public class PanneServiceImpl implements PanneService{

    @Autowired
     private SessionFactory sessionFactory;
    
    @Override
    public void save(Panne panne) {
         sessionFactory.getCurrentSession().save(panne);
    }

    @Override
    public Panne findById(int id) {
        return (Panne) sessionFactory.getCurrentSession().get(Panne.class, id);
    }

    @Override
    public List<Panne> findAll() {
        return   sessionFactory.getCurrentSession().createQuery("From Vignette").list();
    }

    @Override
    public void update(Panne panne) {
        sessionFactory.getCurrentSession().saveOrUpdate(panne);
    }

    @Override
    public List<Integer> generateIdMarque() {
        return  sessionFactory.getCurrentSession().createQuery("select max(idPanne) from Panne").list();
    }

    @Override
    public void delete(Panne panne) {
       sessionFactory.getCurrentSession().delete(panne);
    }

    @Override
    public void deleteByVehicule(int idVehicule) {
       sessionFactory.getCurrentSession().createQuery("delete from Panne a where a.vehicule.idVehicule="+idVehicule).executeUpdate();
    }
    
}
