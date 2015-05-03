/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.service;

import com.pfe.facade.AlertevidangeService;
import com.pfe.model.Alertevidange;
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
@Service("alertevidangeService")
public class AlertevidangeServiceImpl implements AlertevidangeService{

    
    @Autowired
     private SessionFactory sessionFactory;
    
    @Override
    public void save(Alertevidange alertevidange) {
        sessionFactory.getCurrentSession().save(alertevidange);
    }

    @Override
    public Alertevidange findById(int id) {
       return (Alertevidange) sessionFactory.getCurrentSession().get(Alertevidange.class, id);
    }

    @Override
    public List<Alertevidange> findByIdVehicule(int id) {
        return  sessionFactory.getCurrentSession().createQuery("select a From Alertevidange a where a.vehicule.idVehicule="+id).list();
    }

    @Override
    public List<Alertevidange> findAll() {
        return   sessionFactory.getCurrentSession().createQuery("From Alertevidange").list();
    }

    @Override
    public void update(Alertevidange alertevidange) {
        sessionFactory.getCurrentSession().saveOrUpdate(alertevidange);
    }

    @Override
    public List<Integer> generateIdAlertevidange() {
        return  sessionFactory.getCurrentSession().createQuery("select max(IdAlertevidange) from Alertevidange").list();
    }

    @Override
    public void delete(Alertevidange alertevidange) {
        sessionFactory.getCurrentSession().delete(alertevidange);
    }

    @Override
    public List<Alertevidange> alertVidange() {
        return  sessionFactory.getCurrentSession().createQuery("select a From Alertevidange a where a.vehicule.kilometrageVehicule=a.kilometrageAlert").list();
    }
    
}
