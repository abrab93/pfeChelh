/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pfe.facade;

import com.pfe.model.Entrepriseassurance;
import java.util.List;

/**
 *
 * @author Youness
 */
public interface EntrepriseassuranceService {
    
    public void save(Entrepriseassurance entrepriseassurance);

    public Entrepriseassurance findById(int id);

    public List<Entrepriseassurance> findAll();

    public void update(Entrepriseassurance entrepriseassurance);
    
    public List<Integer> generateIdEntrepriseassurance();
    
    public void delete(Entrepriseassurance entrepriseassurance);
    
}
