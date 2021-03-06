package com.pfe.model;
// Generated 1 mai 2015 23:05:25 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Centrevisitetechnique generated by hbm2java
 */
@Entity
@Table(name="centrevisitetechnique"
    ,catalog="gestionvehiculepfe"
)
public class Centrevisitetechnique  implements java.io.Serializable {


     private Integer idCentreVisiteTechnique;
     private String numeroAutorisation;
     private String nomCentre;
     private String adresse;
     private String tel;
     private String fax;
     private Set<Visitetechnique> visitetechniques = new HashSet<Visitetechnique>(0);

    public Centrevisitetechnique() {
    }

	
    public Centrevisitetechnique(String numeroAutorisation, String nomCentre, String adresse, String tel, String fax) {
        this.numeroAutorisation = numeroAutorisation;
        this.nomCentre = nomCentre;
        this.adresse = adresse;
        this.tel = tel;
        this.fax = fax;
    }
    public Centrevisitetechnique(String numeroAutorisation, String nomCentre, String adresse, String tel, String fax, Set<Visitetechnique> visitetechniques) {
       this.numeroAutorisation = numeroAutorisation;
       this.nomCentre = nomCentre;
       this.adresse = adresse;
       this.tel = tel;
       this.fax = fax;
       this.visitetechniques = visitetechniques;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idCentreVisiteTechnique", unique=true, nullable=false)
    public Integer getIdCentreVisiteTechnique() {
        return this.idCentreVisiteTechnique;
    }
    
    public void setIdCentreVisiteTechnique(Integer idCentreVisiteTechnique) {
        this.idCentreVisiteTechnique = idCentreVisiteTechnique;
    }

    
    @Column(name="numeroAutorisation", nullable=false, length=30)
    public String getNumeroAutorisation() {
        return this.numeroAutorisation;
    }
    
    public void setNumeroAutorisation(String numeroAutorisation) {
        this.numeroAutorisation = numeroAutorisation;
    }

    
    @Column(name="nomCentre", nullable=false, length=40)
    public String getNomCentre() {
        return this.nomCentre;
    }
    
    public void setNomCentre(String nomCentre) {
        this.nomCentre = nomCentre;
    }

    
    @Column(name="adresse", nullable=false, length=30)
    public String getAdresse() {
        return this.adresse;
    }
    
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    
    @Column(name="tel", nullable=false, length=15)
    public String getTel() {
        return this.tel;
    }
    
    public void setTel(String tel) {
        this.tel = tel;
    }

    
    @Column(name="fax", nullable=false, length=15)
    public String getFax() {
        return this.fax;
    }
    
    public void setFax(String fax) {
        this.fax = fax;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="centrevisitetechnique")
    public Set<Visitetechnique> getVisitetechniques() {
        return this.visitetechniques;
    }
    
    public void setVisitetechniques(Set<Visitetechnique> visitetechniques) {
        this.visitetechniques = visitetechniques;
    }




}


