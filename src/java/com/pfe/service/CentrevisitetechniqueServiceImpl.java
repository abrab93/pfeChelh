/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.service;

import com.pfe.facade.CentrevisitetechniqueService;
import com.pfe.model.Centrevisitetechnique;
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
@Service("centrevisitetechniqueService")
public class CentrevisitetechniqueServiceImpl implements CentrevisitetechniqueService{

    
    @Autowired
     private SessionFactory sessionFactory;
    
    @Override
    public void save(Centrevisitetechnique centrevisitetechnique) {
        sessionFactory.getCurrentSession().save(centrevisitetechnique);
    }

    @Override
    public Centrevisitetechnique findById(int id) {
        return (Centrevisitetechnique) sessionFactory.getCurrentSession().get(Centrevisitetechnique.class, id);
    }

    @Override
    public List<Centrevisitetechnique> findAll() {
        return   sessionFactory.getCurrentSession().createQuery("From Centrevisitetechnique").list();
    }

    @Override
    public void update(Centrevisitetechnique centrevisitetechnique) {
        sessionFactory.getCurrentSession().saveOrUpdate(centrevisitetechnique);
    }

    @Override
    public List<Integer> generateIdCentrevisitetechnique() {
        return  sessionFactory.getCurrentSession().createQuery("select max(idCentrevisitetechnique) from Centrevisitetechnique").list();
    }

    @Override
    public void delete(Centrevisitetechnique centrevisitetechnique) {
        sessionFactory.getCurrentSession().delete(centrevisitetechnique);
    }
    
}
