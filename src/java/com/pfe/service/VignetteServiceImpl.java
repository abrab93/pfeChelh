/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.service;

import com.pfe.facade.VignetteService;
import com.pfe.model.Vignette;
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
@Service("vignetteService")
public class VignetteServiceImpl implements VignetteService{

    
    @Autowired
     private SessionFactory sessionFactory;
    
    @Override
    public void save(Vignette vignette) {
        sessionFactory.getCurrentSession().save(vignette);
    }

    @Override
    public Vignette findById(int id) {
        return (Vignette) sessionFactory.getCurrentSession().get(Vignette.class, id);
    }

    @Override
    public List<Vignette> findAll() {
        return   sessionFactory.getCurrentSession().createQuery("From Vignette").list(); 
    }

    @Override
    public void update(Vignette vignette) {
        sessionFactory.getCurrentSession().saveOrUpdate(vignette);
    }

    @Override
    public List<Integer> generateIdVehicule() {
       return  sessionFactory.getCurrentSession().createQuery("select max(idVignette) from Vignette").list();
    }

    @Override
    public void delete(Vignette vignette) {
        sessionFactory.getCurrentSession().delete(vignette);
    }

    @Override
    public void deleteByVehicule(int idVehicule) {
       sessionFactory.getCurrentSession().createQuery("delete from Vignette a where a.vehicule.idVehicule="+idVehicule).executeUpdate();
    }
    
}
