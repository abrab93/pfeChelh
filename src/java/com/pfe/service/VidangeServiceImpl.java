/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.service;

import com.pfe.facade.VidangeService;
import com.pfe.model.Vidange;
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
@Service("vidangeService")
public class VidangeServiceImpl implements VidangeService{

    @Autowired
     private SessionFactory sessionFactory;
    
    
    
    @Override
    public void save(Vidange vidange) {
        sessionFactory.getCurrentSession().save(vidange);
    }

    @Override
    public Vidange findById(int id) {
        return (Vidange) sessionFactory.getCurrentSession().get(Vidange.class, id);
    }

    @Override
    public List<Vidange> findAll() {
        return   sessionFactory.getCurrentSession().createQuery("From Vidange").list(); 
    }

    @Override
    public void update(Vidange vidange) {
        sessionFactory.getCurrentSession().saveOrUpdate(vidange);
    }

    @Override
    public List<Integer> generateIdVehicule() {
      return  sessionFactory.getCurrentSession().createQuery("select max(idVidange) from Vidange").list();
    }

    @Override
    public void delete(Vidange vidange) {
        sessionFactory.getCurrentSession().delete(vidange);
    }

    @Override
    public void deleteByVehicule(int idVehicule) {
       sessionFactory.getCurrentSession().createQuery("delete from Vidange a where a.vehicule.idVehicule="+idVehicule).executeUpdate();
    }
    
}
