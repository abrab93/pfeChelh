/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.service;

import com.pfe.facade.AlertepneuService;
import com.pfe.model.Alertepneu;
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
@Service("alertepneuServiceImpl")
public class AlertepneuServiceImpl implements AlertepneuService{

    @Autowired
     private SessionFactory sessionFactory;
    
    @Override
    public void save(Alertepneu alertepneu) {
        sessionFactory.getCurrentSession().save(alertepneu);
    }

    @Override
    public Alertepneu findById(int id) {
        return (Alertepneu) sessionFactory.getCurrentSession().get(Alertepneu.class, id);
    }

    @Override
    public List<Alertepneu> findByIdVehicule(int id) {
        return  sessionFactory.getCurrentSession().createQuery("select a From Alertepneu a where a.vehicule.idVehicule="+id).list();
    }

    @Override
    public List<Alertepneu> findAll() {
        return   sessionFactory.getCurrentSession().createQuery("From Alertepneu").list();
    }

    @Override
    public void update(Alertepneu alertepneu) {
        sessionFactory.getCurrentSession().saveOrUpdate(alertepneu);
    }

    @Override
    public List<Integer> generateIdAlertepneu() {
        return  sessionFactory.getCurrentSession().createQuery("select max(IdAlertepneu) from Alertepneu").list();
    }

    @Override
    public void delete(Alertepneu alertepneu) {
       sessionFactory.getCurrentSession().delete(alertepneu);
    }
    
}
