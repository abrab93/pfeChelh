/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.service;

import com.pfe.facade.AlertevignetteService;
import com.pfe.model.Alertevignette;
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
@Service("alertevignetteService")
public class AlertevignetteServiceImpl implements AlertevignetteService{

    
     @Autowired
     private SessionFactory sessionFactory;
    
    @Override
    public void save(Alertevignette alertevignette) {
        sessionFactory.getCurrentSession().save(alertevignette);
    }

    @Override
    public Alertevignette findById(int id) {
        return (Alertevignette) sessionFactory.getCurrentSession().get(Alertevignette.class, id);
    }

    @Override
    public List<Alertevignette> findByIdVehicule(int id) {
        return  sessionFactory.getCurrentSession().createQuery("select a From Alertevignette a where a.vehicule.idVehicule="+id).list();
    }

    @Override
    public List<Alertevignette> findAll() {
        return   sessionFactory.getCurrentSession().createQuery("From Alertevignette").list();
    }

    @Override
    public void update(Alertevignette alertevignette) {
        sessionFactory.getCurrentSession().saveOrUpdate(alertevignette);
    }

    @Override
    public List<Integer> generateIdAlertevignette() {
        return  sessionFactory.getCurrentSession().createQuery("select max(idAlerteasurance) from Alertevignette").list();
    }

    @Override
    public void delete(Alertevignette alertevignette) {
        sessionFactory.getCurrentSession().delete(alertevignette);
    }
    
}
