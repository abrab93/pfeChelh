/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.facade;

import com.pfe.model.Centrevisitetechnique;
import java.util.List;

/**
 *
 * @author Youness
 */
public interface CentrevisitetechniqueService {
    
    public void save(Centrevisitetechnique centrevisitetechnique);

    public Centrevisitetechnique findById(int id);

    public List<Centrevisitetechnique> findAll();

    public void update(Centrevisitetechnique centrevisitetechnique);
    
    public List<Integer> generateIdCentrevisitetechnique();
    
    public void delete(Centrevisitetechnique centrevisitetechnique);
 
}
