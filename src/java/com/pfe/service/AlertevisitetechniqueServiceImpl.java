/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.service;

import com.pfe.facade.AlertevisitetechniqueService;
import com.pfe.model.Alertevisitetechnique;
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
@Service("alertevisitetechniqueService")
public class AlertevisitetechniqueServiceImpl implements AlertevisitetechniqueService{

    
     @Autowired
     private SessionFactory sessionFactory;
    
    @Override
    public void save(Alertevisitetechnique alertevisitetechnique) {
        sessionFactory.getCurrentSession().save(alertevisitetechnique);
    }

    @Override
    public Alertevisitetechnique findById(int id) {
        return (Alertevisitetechnique) sessionFactory.getCurrentSession().get(Alertevisitetechnique.class, id);
    }

    @Override
    public List<Alertevisitetechnique> findByIdVehicule(int id) {
         return  sessionFactory.getCurrentSession().createQuery("select a From Alertevisitetechnique a where a.vehicule.idVehicule="+id).list();
    }

    @Override
    public List<Alertevisitetechnique> findAll() {
        return   sessionFactory.getCurrentSession().createQuery("From Alertevisitetechnique").list();
    }

    @Override
    public void update(Alertevisitetechnique alertevisitetechnique) {
        sessionFactory.getCurrentSession().saveOrUpdate(alertevisitetechnique);
    }

    @Override
    public List<Integer> generateIdAlertevisitetechnique() {
        return  sessionFactory.getCurrentSession().createQuery("select max(idAlertevisitetechnique) from Alertevisitetechnique").list();
    }

    @Override
    public void delete(Alertevisitetechnique alertevisitetechnique) {
        sessionFactory.getCurrentSession().delete(alertevisitetechnique);
    }
    
}
