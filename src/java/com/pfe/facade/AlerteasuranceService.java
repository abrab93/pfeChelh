/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.facade;

import com.pfe.model.Alerteasurance;
import java.util.List;

/**
 *
 * @author Youness
 */
public interface AlerteasuranceService {
    
    public void save(Alerteasurance alerteasurance);

    public Alerteasurance findById(int id);
    
    public List<Alerteasurance> findByIdVehicule(int id);

    public List<Alerteasurance> findAll();

    public void update(Alerteasurance alerteasurance);
    
    public List<Integer> generateIdAlerteasurance();
    
    public void delete(Alerteasurance alerteasurance);
}
