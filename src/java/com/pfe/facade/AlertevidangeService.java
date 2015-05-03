/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.facade;

import com.pfe.model.Alertevidange;
import java.util.List;

/**
 *
 * @author Youness
 */
public interface AlertevidangeService {
    
    public void save(Alertevidange alertevidange);

    public Alertevidange findById(int id);
    
    public List<Alertevidange> findByIdVehicule(int id);

    public List<Alertevidange> findAll();

    public void update(Alertevidange alertevidange);
    
    public List<Integer> generateIdAlertevidange();
    
    public void delete(Alertevidange alertevidange);
    
    public List<Alertevidange>alertVidange();
    
}
