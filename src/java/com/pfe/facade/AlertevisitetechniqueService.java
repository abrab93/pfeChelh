/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.facade;

import com.pfe.model.Alertevisitetechnique;
import java.util.List;

/**
 *
 * @author Youness
 */
public interface AlertevisitetechniqueService {
    
    public void save(Alertevisitetechnique alertevisitetechnique);

    public Alertevisitetechnique findById(int id);
    
    public List<Alertevisitetechnique> findByIdVehicule(int id);

    public List<Alertevisitetechnique> findAll();

    public void update(Alertevisitetechnique alertevisitetechnique);
    
    public List<Integer> generateIdAlertevisitetechnique();
    
    public void delete(Alertevisitetechnique alertevisitetechnique);
    
}
