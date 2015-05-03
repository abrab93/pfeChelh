/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.service;

import com.pfe.facade.AssuranceService;
import com.pfe.facade.MarqueService;
import com.pfe.facade.PanneService;
import com.pfe.facade.PneuService;
import com.pfe.facade.ProprietairevehiculeService;
import com.pfe.facade.TypecarburantService;
import com.pfe.facade.TypevehiculeService;
import com.pfe.facade.VehiculeService;
import com.pfe.facade.VidangeService;
import com.pfe.facade.VignetteService;
import com.pfe.facade.VisitetechniqueService;
import com.pfe.model.Marque;
import com.pfe.model.Proprietairevehicule;
import com.pfe.model.Typecarburant;
import com.pfe.model.Typevehicule;
import com.pfe.model.Vehicule;

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
@Service("vehiculeService")
public class VehiculeServiceImpl implements VehiculeService {

    @Autowired
    private SessionFactory sessionFactory;
    @Autowired
    private TypecarburantService typecarburantService;
    @Autowired
    private TypevehiculeService typevehiculeService;
    @Autowired
    private ProprietairevehiculeService proprietairevehiculeService;
    @Autowired
    private MarqueService marqueService;
    @Autowired
    private VisitetechniqueService visitetechniqueService;
    @Autowired
    private VignetteService vignetteService;
    @Autowired
    private VidangeService vidangeService;
    @Autowired
    private PneuService pneuService;
    @Autowired
    private PanneService panneService;
    @Autowired
    private AssuranceService assuranceService;

    @Override
    public void save(Vehicule vehicule) {
        System.out.println("****idtypc" + vehicule.getTypecarburant().getIdTypeCarburant());
        Typecarburant typecarburant = typecarburantService.findById(vehicule.getTypecarburant().getIdTypeCarburant());
        Typevehicule typevehicule = typevehiculeService.findById(vehicule.getTypevehicule().getIdTypeVehicule());
        Proprietairevehicule proprietairevehicule = proprietairevehiculeService.findById(vehicule.getProprietairevehicule().getIdProprietaire());
        Marque marque = marqueService.findById(vehicule.getMarque().getIdMarque());

        if (typecarburant != null & proprietairevehicule != null & typevehicule != null & marque != null) {
            System.out.println("*****typecarburant :" + typecarburant);
        }
        System.out.println("\n*****proprietairevehicule :" + proprietairevehicule);
        System.out.println("\n******marque:" + marque);

        vehicule.setMarque(marque);
        vehicule.setTypecarburant(typecarburant);
        vehicule.setTypevehicule(typevehicule);
        vehicule.setProprietairevehicule(proprietairevehicule);

        sessionFactory.getCurrentSession().save(vehicule);
    }

    @Override
    public Vehicule findById(int id) {
        return (Vehicule) sessionFactory.getCurrentSession().get(Vehicule.class, id);
    }

    @Override
    public List<Vehicule> findAll() {
        return sessionFactory.getCurrentSession().createQuery("From Vehicule").list();
    }

    @Override
    public void update(Vehicule vehicule) {
        sessionFactory.getCurrentSession().saveOrUpdate(vehicule);
    }

    @Override
    public List<Integer> generateIdVehicule() {
        return sessionFactory.getCurrentSession().createQuery("select max(idVehicule) from Vehicule").list();
    }

    @Override
    public void delete(Vehicule vehicule) {

        sessionFactory.getCurrentSession().createQuery("delete from Vehicule where idVehicule=" + vehicule.getIdVehicule()).executeUpdate();
        assuranceService.deleteByVehicule(vehicule.getIdVehicule());
        visitetechniqueService.deleteByVehicule(vehicule.getIdVehicule());
        panneService.deleteByVehicule(vehicule.getIdVehicule());
        vignetteService.deleteByVehicule(vehicule.getIdVehicule());
        pneuService.deleteByVehicule(vehicule.getIdVehicule());
        vidangeService.deleteByVehicule(vehicule.getIdVehicule());
    }

}
