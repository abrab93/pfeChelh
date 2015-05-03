/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.service;

import com.pfe.facade.AssuranceService;
import com.pfe.model.Assurance;
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
@Service("assuranceService")
public class AssuranceServiceImpl implements AssuranceService{

    @Autowired
     private SessionFactory sessionFactory;
    
    @Override
    public void save(Assurance assurance) {
        sessionFactory.getCurrentSession().save(assurance);
    }

    @Override
    public Assurance findById(int id) {
        return (Assurance) sessionFactory.getCurrentSession().get(Assurance.class, id);
    }

    @Override
    public List<Assurance> findAll() {
        return   sessionFactory.getCurrentSession().createQuery("From Assurance").list(); 
    }

    @Override
    public void update(Assurance assurance) {
       sessionFactory.getCurrentSession().saveOrUpdate(assurance);
    }

    @Override
    public List<Integer> generateIdMarque() {
       return  sessionFactory.getCurrentSession().createQuery("select max(idAssurance) from Assurance").list();
    }

    @Override
    public void delete(Assurance assurance) {
        sessionFactory.getCurrentSession().delete(assurance);
    }

    @Override
    public void deleteByVehicule(int idVehicule) {
       sessionFactory.getCurrentSession().createQuery("delete from Assurance a where a.vehicule.idVehicule="+idVehicule).executeUpdate();
    }
    
}
