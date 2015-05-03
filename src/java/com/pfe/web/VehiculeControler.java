/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.web;

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
import com.pfe.model.Vehicule;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.SessionScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author Youness
 */
@Component("vehiculeControler")
@SessionScoped
public class VehiculeControler {

    private Vehicule  vehicule=new Vehicule();
    private List<Vehicule>vehicules=new ArrayList<Vehicule>();
    private Vehicule clonedVehicule=new Vehicule();
    
    @Autowired
    private VehiculeService vehiculeService;
    @Autowired
    private MarqueService marqueService;
    @Autowired
    private TypecarburantService typeCarburantService;
    @Autowired
    private TypevehiculeService typevehiculeService;
    @Autowired
    private ProprietairevehiculeService proprietairevehiculeService;
    
    
    private void cloner(){
        vehicule.setIdVehicule(vehiculeService.generateIdVehicule().get(0));
        clonedVehicule=vehicule;
    }
    
    public String save(){
        System.out.println("d5èèlt");
        vehiculeService.save(vehicule);
        cloner();
        vehicules=vehiculeService.findAll();
        
    return "vehiculeAjouter";
    }
    public String test(){
        System.out.println("test");
        return null;
    }
    
    @PostConstruct
    private void init(){
        vehicules=vehiculeService.findAll();
    }
    
    public Vehicule findById(int id){
    return vehiculeService.findById(id);
    }
    
    public List<Vehicule> findAll(){
    return vehiculeService.findAll();
    }
    
   public void delete(){
  
        vehiculeService.delete(vehicule);///ba9iii 5aasha t devloppa 
           vehicules.remove(vehicule);

    }
    
    int indexVehicule;
    public String update(Vehicule vehicule1){
        indexVehicule=vehicules.indexOf(vehicule1);
        vehicule=vehicule1;
        
    return "updateVehicule";
    }
    
    public void saveChange(){
        //indexVehicule=vehicules.indexOf(vehicule);
        System.out.println("********* hqnii");
//        System.out.println("***********  change Vehicule  : "+vehicule);
//         vehicule.setTypecarburant(typeCarburantService.findById(vehicule.getTypecarburant().getIdTypeCarburant()));
//          vehicule.setTypevehicule(typevehiculeService.findById(vehicule.getTypevehicule().getIdTypeVehicule()));
//          vehicule.setMarque(marqueService.findById(vehicule.getMarque().getIdMarque()));
//          vehicule.setProprietairevehicule(proprietairevehiculeService.findById(vehicule.getProprietairevehicule().getIdProprietaire()));
//          
//        
//        vehiculeService.update(vehicule);//baa9i 5èès nchoof lcote tliste apres lmaj 
////        user.setService(serviceService.find(user.getService().getIdService()));
////        users.set(indexUser, user);
//         
//          vehicules.set(indexVehicule, vehicule);
    }
    
    public void tst(){
        System.out.println("asdfsadsdasd");
        
        indexVehicule=vehicules.indexOf(vehicule);
        System.out.println("********* hqnii");
        System.out.println("***********  change Vehicule  : "+vehicule);
         vehicule.setTypecarburant(typeCarburantService.findById(vehicule.getTypecarburant().getIdTypeCarburant()));
          vehicule.setTypevehicule(typevehiculeService.findById(vehicule.getTypevehicule().getIdTypeVehicule()));
          vehicule.setMarque(marqueService.findById(vehicule.getMarque().getIdMarque()));
          vehicule.setProprietairevehicule(proprietairevehiculeService.findById(vehicule.getProprietairevehicule().getIdProprietaire()));
          
        
        vehiculeService.update(vehicule);//baa9i 5èès nchoof lcote tliste apres lmaj 
//        user.setService(serviceService.find(user.getService().getIdService()));
//        users.set(indexUser, user);
         
          vehicules.set(indexVehicule, vehicule);
    }
    
    public VehiculeControler() {
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public List<Vehicule> getVehicules() {
        return vehicules;
    }

    public void setVehicules(List<Vehicule> vehicules) {
        this.vehicules = vehicules;
    }

    public VehiculeService getVehiculeService() {
        return vehiculeService;
    }

    public void setVehiculeService(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }

    public int getIndexVehicule() {
        return indexVehicule;
    }

    public void setIndexVehicule(int indexVehicule) {
        this.indexVehicule = indexVehicule;
    }

    public Vehicule getClonedVehicule() {
        return clonedVehicule;
    }

    public void setClonedVehicule(Vehicule clonedVehicule) {
        this.clonedVehicule = clonedVehicule;
    }
    
    
    
}
