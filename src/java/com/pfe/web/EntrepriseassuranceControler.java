/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.web;

import com.pfe.facade.EntrepriseassuranceService;
import com.pfe.model.Entrepriseassurance;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Youness
 */
@Component("entrepriseassuranceControler")
@SessionScoped
public class EntrepriseassuranceControler {

    private Entrepriseassurance entrepriseassurance=new Entrepriseassurance();
    private List<Entrepriseassurance> entrepriseassurances=new ArrayList<Entrepriseassurance>();
    
    @Autowired
    private EntrepriseassuranceService entrepriseassuranceService;
    
    public void save(){
       entrepriseassuranceService.save(entrepriseassurance); 
    }
    
    @PostConstruct
    private void init(){
      entrepriseassurances=entrepriseassuranceService.findAll();
    }
    
    
    public EntrepriseassuranceControler() {
       
    }

    public Entrepriseassurance getEntrepriseassurance() {
        return entrepriseassurance;
    }

    public void setEntrepriseassurance(Entrepriseassurance entrepriseassurance) {
        this.entrepriseassurance = entrepriseassurance;
    }

    public List<Entrepriseassurance> getEntrepriseassurances() {
        return entrepriseassurances;
    }

    public void setEntrepriseassurances(List<Entrepriseassurance> entrepriseassurances) {
        this.entrepriseassurances = entrepriseassurances;
    }

    public EntrepriseassuranceService getEntrepriseassuranceService() {
        return entrepriseassuranceService;
    }

    public void setEntrepriseassuranceService(EntrepriseassuranceService entrepriseassuranceService) {
        this.entrepriseassuranceService = entrepriseassuranceService;
    }
    
    
    
}
