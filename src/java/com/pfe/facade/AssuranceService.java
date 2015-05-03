/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.facade;

import com.pfe.model.Assurance;
import com.pfe.model.Visitetechnique;
import java.util.List;

/**
 *
 * @author Youness
 */
public interface AssuranceService {
    
    public void save(Assurance assurance);

    public Assurance findById(int id);

    public List<Assurance> findAll();

    public void update(Assurance assurance);
    
    public List<Integer> generateIdMarque();
    
    public void delete(Assurance assurance);
    
    public void deleteByVehicule(int idVehicule);
            
    
}
