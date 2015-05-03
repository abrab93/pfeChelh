/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.service;

import com.pfe.facade.PneuService;
import com.pfe.model.Pneu;
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
@Service("pneuService")
public class PneuServiceImpl implements PneuService{

    
    @Autowired
     private SessionFactory sessionFactory;
    
    
    @Override
    public void save(Pneu pneu) {
        sessionFactory.getCurrentSession().save(pneu);
    }

    @Override
    public Pneu findById(int id) {
         return (Pneu) sessionFactory.getCurrentSession().get(Pneu.class, id);
    }

    @Override
    public List<Pneu> findAll() {
        return sessionFactory.getCurrentSession().createQuery("From Pneu").list();
    }

    @Override
    public void update(Pneu pneu) {
        sessionFactory.getCurrentSession().saveOrUpdate(pneu);
    }

    @Override
    public List<Integer> generateIdMarque() {
        return sessionFactory.getCurrentSession().createQuery("select max(idPneu) from Vignette").list();
    }

    @Override
    public void delete(Pneu pneu) {
        sessionFactory.getCurrentSession().delete(pneu);
    }

    @Override
    public void deleteByVehicule(int idVehicule) {
       sessionFactory.getCurrentSession().createQuery("delete from Pneu a where a.vehicule.idVehicule="+idVehicule).executeUpdate();
    }
    
}
