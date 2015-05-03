/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.facade;

import com.pfe.model.Panne;
import com.pfe.model.Pneu;
import java.util.List;

/**
 *
 * @author Youness
 */
public interface PanneService {
    
    
    public void save(Panne panne);

    public Panne findById(int id);

    public List<Panne> findAll();

    public void update(Panne panne);
    
    public List<Integer> generateIdMarque();
    
     public void delete(Panne panne);
     
    public void deleteByVehicule(int idVehicule); 
}
