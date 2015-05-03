/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.service;

import com.pfe.facade.EntrepriseassuranceService;
import com.pfe.model.Entrepriseassurance;
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
@Service("entrepriseassuranceService")
public class EntrepriseassuranceServiceImpl implements EntrepriseassuranceService{

    
    @Autowired
     private SessionFactory sessionFactory;
    
    @Override
    public void save(Entrepriseassurance entrepriseassurance) {
         sessionFactory.getCurrentSession().save(entrepriseassurance);
    }

    @Override
    public Entrepriseassurance findById(int id) {
        return (Entrepriseassurance) sessionFactory.getCurrentSession().get(Entrepriseassurance.class, id);
    }

    @Override
    public List<Entrepriseassurance> findAll() {
        return   sessionFactory.getCurrentSession().createQuery("From Entrepriseassurance").list();
    }

    @Override
    public void update(Entrepriseassurance entrepriseassurance) {
        sessionFactory.getCurrentSession().saveOrUpdate(entrepriseassurance);
    }

    @Override
    public List<Integer> generateIdEntrepriseassurance() {
        return  sessionFactory.getCurrentSession().createQuery("select max(idEntrepriseassurance) from Entrepriseassurance").list();
    }

    @Override
    public void delete(Entrepriseassurance entrepriseassurance) {
        sessionFactory.getCurrentSession().delete(entrepriseassurance);
    }
    
}
