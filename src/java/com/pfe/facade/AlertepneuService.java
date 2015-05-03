/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.facade;

import com.pfe.model.Alertepneu;
import java.util.List;

/**
 *
 * @author Youness
 */
public interface AlertepneuService {
    
    public void save(Alertepneu alertepneu);

    public Alertepneu findById(int id);
    
    public List<Alertepneu> findByIdVehicule(int id);

    public List<Alertepneu> findAll();

    public void update(Alertepneu alertepneu);
    
    public List<Integer> generateIdAlertepneu();
    
    public void delete(Alertepneu alertepneu);
    
}
