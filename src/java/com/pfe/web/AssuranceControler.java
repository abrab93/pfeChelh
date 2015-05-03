/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.web;

import com.pfe.facade.AlerteasuranceService;
import com.pfe.facade.AssuranceService;
import com.pfe.facade.VehiculeService;
import com.pfe.model.Alerteasurance;
import com.pfe.model.Assurance;
import com.pfe.model.Vehicule;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.SessionScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Youness
 */
@Component("assuranceControler")
@SessionScoped
public class AssuranceControler {

    private Assurance assurance=new Assurance();
    private List<Assurance>assurances=new ArrayList<Assurance>();
     private Alerteasurance alerteasurance;
    @Autowired
    private AssuranceService assuranceService;
    @Autowired
   private VehiculeService vehiculeService;
    @Autowired
    private AlerteasuranceService alerteasuranceService;
    
    
    public void save(Vehicule v){
        System.out.println("******vehicule"+v);
        assurance.setVehicule(v);
    assuranceService.save(assurance);
    alerteasurance=new Alerteasurance();
    alerteasurance.setDateAlert(assurance.getDateFin());
    alerteasurance.setDesceription("");
    alerteasurance.setVehicule(vehiculeService.findById(assurance.getVehicule().getIdVehicule()));
    alerteasuranceService.save(alerteasurance);
    assurance=new Assurance();
    }
    
    
    public AssuranceControler() {
    }

    public Assurance getAssurance() {
        return assurance;
    }

    public void setAssurance(Assurance assurance) {
        this.assurance = assurance;
    }

    public List<Assurance> getAssurances() {
        return assurances;
    }

    public void setAssurances(List<Assurance> assurances) {
        this.assurances = assurances;
    }

    public AssuranceService getAssuranceService() {
        return assuranceService;
    }

    public void setAssuranceService(AssuranceService assuranceService) {
        this.assuranceService = assuranceService;
    }

    public VehiculeService getVehiculeService() {
        return vehiculeService;
    }

    public void setVehiculeService(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }
    
    
}
