/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.facade;

import com.pfe.model.Assurance;
import com.pfe.model.Pneu;
import java.util.List;

/**
 *
 * @author Youness
 */
public interface PneuService {
    
    public void save(Pneu pneu);

    public Pneu findById(int id);

    public List<Pneu> findAll();

    public void update(Pneu pneu);
    
    public List<Integer> generateIdMarque();
    
     public void delete(Pneu pneu);
         
     public void deleteByVehicule(int idVehicule); 

    
}
