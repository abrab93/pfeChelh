/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.service;

import com.pfe.facade.AlerteasuranceService;
import com.pfe.model.Alerteasurance;
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
@Service("alerteasuranceService")
public class AlerteasuranceServiceImpl implements AlerteasuranceService{

    
    @Autowired
     private SessionFactory sessionFactory;
    
    
    @Override
    public void save(Alerteasurance alerteasurance) {
        sessionFactory.getCurrentSession().save(alerteasurance);
    }

    @Override
    public Alerteasurance findById(int id) {
        return (Alerteasurance) sessionFactory.getCurrentSession().get(Alerteasurance.class, id);
    }

    @Override
    public List<Alerteasurance> findByIdVehicule(int id) {
         return  sessionFactory.getCurrentSession().createQuery("select a From Alerteasurance a where a.vehicule.idVehicule="+id).list();
    }

    @Override
    public List<Alerteasurance> findAll() {
        return   sessionFactory.getCurrentSession().createQuery("From Alerteasurance").list();
    }

    @Override
    public void update(Alerteasurance alerteasurance) {
        sessionFactory.getCurrentSession().saveOrUpdate(alerteasurance);
    }

    @Override
    public List<Integer> generateIdAlerteasurance() {
        return  sessionFactory.getCurrentSession().createQuery("select max(idAlerteasurance) from Alerteasurance").list();
    }

    @Override
    public void delete(Alerteasurance alerteasurance) {
        sessionFactory.getCurrentSession().delete(alerteasurance);
    }
    
}
