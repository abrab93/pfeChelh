/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.web;

import com.pfe.facade.CentrevisitetechniqueService;
import com.pfe.model.Centrevisitetechnique;
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
@Component("centrevisitetechniqueControler")
@SessionScoped
public class CentrevisitetechniqueControler {

    private Centrevisitetechnique centrevisitetechnique;
    private List<Centrevisitetechnique> centrevisitetechniques=new ArrayList<Centrevisitetechnique>();
    
    @Autowired
    private CentrevisitetechniqueService centrevisitetechniqueService;
    
    
    
    public void save(){
      centrevisitetechniqueService.save(centrevisitetechnique);
    }
    
    @PostConstruct
    private void init(){
     centrevisitetechniques=centrevisitetechniqueService.findAll();
    }
     
    public CentrevisitetechniqueControler() {
    }

    public Centrevisitetechnique getCentrevisitetechnique() {
        return centrevisitetechnique;
    }

    public void setCentrevisitetechnique(Centrevisitetechnique centrevisitetechnique) {
        this.centrevisitetechnique = centrevisitetechnique;
    }

    public List<Centrevisitetechnique> getCentrevisitetechniques() {
        return centrevisitetechniques;
    }

    public void setCentrevisitetechniques(List<Centrevisitetechnique> centrevisitetechniques) {
        this.centrevisitetechniques = centrevisitetechniques;
    }

    public CentrevisitetechniqueService getCentrevisitetechniqueService() {
        return centrevisitetechniqueService;
    }

    public void setCentrevisitetechniqueService(CentrevisitetechniqueService centrevisitetechniqueService) {
        this.centrevisitetechniqueService = centrevisitetechniqueService;
    }
    

}
