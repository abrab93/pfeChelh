/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.service;

import com.pfe.facade.VisitetechniqueService;
import com.pfe.model.Visitetechnique;
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
@Service("visitetechniqueService")
public class VisitetechniqueServiceImpl implements VisitetechniqueService{

    
    @Autowired
     private SessionFactory sessionFactory;
    
    @Override
    public void save(Visitetechnique visitetechnique) {
        sessionFactory.getCurrentSession().save(visitetechnique);
    }

    @Override
    public Visitetechnique findById(int id) {
       return (Visitetechnique) sessionFactory.getCurrentSession().get(Visitetechnique.class, id);
    }

    @Override
    public List<Visitetechnique> findAll() {
        return   sessionFactory.getCurrentSession().createQuery("From Visitetechnique").list(); 
    }

    @Override
    public void update(Visitetechnique visitetechnique) {
         sessionFactory.getCurrentSession().saveOrUpdate(visitetechnique);
    }

    @Override
    public List<Integer> generateIdVehicule() {
        return  sessionFactory.getCurrentSession().createQuery("select max(idVignette) from Visitetechnique").list();
    }

    @Override
    public void delete(Visitetechnique visitetechnique) {
        sessionFactory.getCurrentSession().delete(visitetechnique);
    }

    @Override
    public void deleteByVehicule(int idVehicule) {
       sessionFactory.getCurrentSession().createQuery("delete from Visitetechnique a where a.vehicule.idVehicule ="+idVehicule).executeUpdate();
    }
    
}
