/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.web;

import com.pfe.facade.AlertevignetteService;
import com.pfe.facade.VehiculeService;
import com.pfe.facade.VignetteService;
import com.pfe.model.Alertevignette;
import com.pfe.model.Vehicule;
import com.pfe.model.Vignette;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Youness
 */
@Component("vignetteControler")
@SessionScoped
public class VignetteControler {

    private Vignette vignette=new Vignette();
    private List<Vignette>vignettes=new ArrayList<Vignette>();
    private Alertevignette alertevignette;
    
    @Autowired
    private VignetteService vignetteService;
     @Autowired
     private AlertevignetteService alertevignetteService; 
     @Autowired
    private VehiculeService vehiculeService;
     
     public void save(Vehicule v){
          FacesContext context = FacesContext.getCurrentInstance();
         
         vignette.setVehicule(v);
     vignetteService.save(vignette);
     alertevignette=new Alertevignette();
     alertevignette.setDateAlert(vignette.getDateFin());
     alertevignette.setDesceription("la vignette a expirer");
     alertevignette.setVehicule(vehiculeService.findById(vignette.getVehicule().getIdVehicule()));
     alertevignetteService.save(alertevignette);
     vignette=new Vignette();
      context.addMessage(null, new FacesMessage("Succes",  "Vignette ajoutè") );
     }
     
     
     
    public Vignette getVignette() {
        return vignette;
    }

    public void setVignette(Vignette vignette) {
        this.vignette = vignette;
    }

    public List<Vignette> getVignettes() {
        return vignettes;
    }

    public void setVignettes(List<Vignette> vignettes) {
        this.vignettes = vignettes;
    }

    public VignetteService getVignetteService() {
        return vignetteService;
    }

    public void setVignetteService(VignetteService vignetteService) {
        this.vignetteService = vignetteService;
    }

    public AlertevignetteService getAlertevignetteService() {
        return alertevignetteService;
    }

    public void setAlertevignetteService(AlertevignetteService alertevignetteService) {
        this.alertevignetteService = alertevignetteService;
    }
    
     
     
     
    public VignetteControler() {
    }
    
}
