/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.facade;

import com.pfe.model.Alertevignette;
import java.util.List;

/**
 *
 * @author Youness
 */
public interface AlertevignetteService {
    
    public void save(Alertevignette alertevignette);

    public Alertevignette findById(int id);
    
    public List<Alertevignette> findByIdVehicule(int id);

    public List<Alertevignette> findAll();

    public void update(Alertevignette alertevignette);
    
    public List<Integer> generateIdAlertevignette();
    
    public void delete(Alertevignette alertevignette);
}
