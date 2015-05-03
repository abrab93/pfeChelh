/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.web;

import com.pfe.facade.AlertevidangeService;
import com.pfe.facade.VehiculeService;
import com.pfe.facade.VidangeService;
import com.pfe.model.Alertevidange;
import com.pfe.model.Vehicule;
import com.pfe.model.Vidange;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Youness
 */
@Component("vidangeControler")
@SessionScoped
public class VidangeControler {

    private Vidange vidange=new Vidange();
    private List<Vidange> vidanges=new ArrayList<Vidange>();
    private List<Alertevidange> alertevidanges=new ArrayList<Alertevidange>();
    private Alertevidange alertevidange;
    private String size;
    
    @Autowired
    private VidangeService vidangeService;
    @Autowired
    private AlertevidangeService alertevidangeService;
    @Autowired
    private VehiculeService vehiculeService;

    
    @PostConstruct
    private void init(){
       alertevidanges =alertevidangeService.findAll();
       size=alertevidanges.size()+"";
      
    }
    
    public void save(Vehicule v){
         FacesContext context = FacesContext.getCurrentInstance();

        vidange.setVehicule(v);
     vidangeService.save(vidange);
     alertevidange=new Alertevidange();
     alertevidange.setDesceription("vehicule dont l immatriculation a besoin de faire le vidange");
     alertevidange.setKilometrageAlert(vidange.getKilometrage()+10000);
     alertevidange.setVehicule(vehiculeService.findById(vidange.getVehicule().getIdVehicule()));
     alertevidangeService.save(alertevidange);
     vidange=new Vidange();
      context.addMessage(null, new FacesMessage("Succes",  "Vidange ajoutè") );
    }
    
     public void saveMessage() {
        FacesContext context = FacesContext.getCurrentInstance();
         
        context.addMessage(null, new FacesMessage("Succes",  "Vidange ajoutè") );
       
    }
     
    public Vidange getVidange() {
        return vidange;
    }

    public void setVidange(Vidange vidange) {
        this.vidange = vidange;
    }

    public List<Vidange> getVidanges() {
        return vidanges;
    }

    public void setVidanges(List<Vidange> vidanges) {
        this.vidanges = vidanges;
    }

    public VidangeService getVidangeService() {
        return vidangeService;
    }

    public void setVidangeService(VidangeService vidangeService) {
        this.vidangeService = vidangeService;
    }

    public List<Alertevidange> getAlertevidanges() {
        return alertevidanges;
    }

    public void setAlertevidanges(List<Alertevidange> alertevidanges) {
        this.alertevidanges = alertevidanges;
    }

    public AlertevidangeService getAlertevidangeService() {
        return alertevidangeService;
    }

    public void setAlertevidangeService(AlertevidangeService alertevidangeService) {
        this.alertevidangeService = alertevidangeService;
    }

    public VehiculeService getVehiculeService() {
        return vehiculeService;
    }

    public void setVehiculeService(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    
    
    
    public VidangeControler() {
    }
    
}
