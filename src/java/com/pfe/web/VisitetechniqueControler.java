/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.web;

import com.pfe.facade.AlertevisitetechniqueService;
import com.pfe.facade.VehiculeService;
import com.pfe.facade.VisitetechniqueService;
import com.pfe.model.Alertevisitetechnique;
import com.pfe.model.Vehicule;
import com.pfe.model.Visitetechnique;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Youness
 */
@Component("visitetechniqueControler")
@SessionScoped
public class VisitetechniqueControler {

    private Visitetechnique visitetechnique=new Visitetechnique();
    private List<Visitetechnique>visitetechniques=new ArrayList<Visitetechnique>();
     private Alertevisitetechnique alerteVisitetechnique;
     
    @Autowired
    private VisitetechniqueService visitetechniqueService;
    @Autowired
    private AlertevisitetechniqueService alertevisitetechniqueService;
     @Autowired
    private VehiculeService vehiculeService;
    
    public void save(Vehicule v){
         FacesContext context = FacesContext.getCurrentInstance();
         
        visitetechnique.setVehicule(v);
      visitetechniqueService.save(visitetechnique);
      alerteVisitetechnique=new Alertevisitetechnique();
      alerteVisitetechnique.setDateAlert(visitetechnique.getDateProchaineVisite());
      alerteVisitetechnique.setDesceription("");
      alerteVisitetechnique.setVehicule(vehiculeService.findById(visitetechnique.getVehicule().getIdVehicule()));
      visitetechnique=new Visitetechnique();
      context.addMessage(null, new FacesMessage("Succes",  "Visitetechnique ajoutè") );
    }
    
    public VisitetechniqueControler() {
    }

    public Visitetechnique getVisitetechnique() {
        return visitetechnique;
    }

    public void setVisitetechnique(Visitetechnique visitetechnique) {
        this.visitetechnique = visitetechnique;
    }

    public List<Visitetechnique> getVisitetechniques() {
        return visitetechniques;
    }

    public void setVisitetechniques(List<Visitetechnique> visitetechniques) {
        this.visitetechniques = visitetechniques;
    }

    public VisitetechniqueService getVisitetechniqueService() {
        return visitetechniqueService;
    }

    public void setVisitetechniqueService(VisitetechniqueService visitetechniqueService) {
        this.visitetechniqueService = visitetechniqueService;
    }

    public AlertevisitetechniqueService getAlertevisitetechniqueService() {
        return alertevisitetechniqueService;
    }

    public void setAlertevisitetechniqueService(AlertevisitetechniqueService alertevisitetechniqueService) {
        this.alertevisitetechniqueService = alertevisitetechniqueService;
    }

    public VehiculeService getVehiculeService() {
        return vehiculeService;
    }

    public void setVehiculeService(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }
    
    
}
