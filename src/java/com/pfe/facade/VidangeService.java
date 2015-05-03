/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.facade;

import com.pfe.model.Vidange;
import java.util.List;

/**
 *
 * @author Youness
 */
public interface VidangeService {
    
    public void save(Vidange vidange);

    public Vidange findById(int id);

    public List<Vidange> findAll();

    public void update(Vidange vidange);
    
    public List<Integer> generateIdVehicule();
    
    public void delete(Vidange vidange);
    
    public void deleteByVehicule(int idVehicule); 

    
}
