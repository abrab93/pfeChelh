/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.facade;

import com.pfe.model.Vignette;
import java.util.List;

/**
 *
 * @author Youness
 */
public interface VignetteService {
    
    public void save(Vignette vignette);

    public Vignette findById(int id);

    public List<Vignette> findAll();

    public void update(Vignette vignette);
    
    public List<Integer> generateIdVehicule();
    
    public void delete(Vignette vignette);
       
    public void deleteByVehicule(int idVehicule);

}
