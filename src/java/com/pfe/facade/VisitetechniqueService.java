/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.facade;

import com.pfe.model.Visitetechnique;
import java.util.List;

/**
 *
 * @author Youness
 */
public interface VisitetechniqueService {
    
    
     public void save(Visitetechnique visitetechnique);

    public Visitetechnique findById(int id);

    public List<Visitetechnique> findAll();

    public void update(Visitetechnique visitetechnique);
    
    public List<Integer> generateIdVehicule();
    
    public void delete(Visitetechnique visitetechnique);
    
    public void deleteByVehicule(int idVehicule);
}
