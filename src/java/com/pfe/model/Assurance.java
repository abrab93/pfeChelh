package com.pfe.model;
// Generated 1 mai 2015 23:05:25 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Assurance generated by hbm2java
 */
@Entity
@Table(name="assurance"
    ,catalog="gestionvehiculepfe"
    , uniqueConstraints = {@UniqueConstraint(columnNames="idEntrepriseAssurance"), @UniqueConstraint(columnNames="idVehicule")} 
)
public class Assurance  implements java.io.Serializable {


     private Integer idAssurance;
     private Entrepriseassurance entrepriseassurance=new Entrepriseassurance();
     private Vehicule vehicule=new Vehicule();
     private String numeroOrdre;
     private Date dateDebut;
     private Date dateFin;
     private Date dateAssurance;

    public Assurance() {
    }

    public Assurance(Entrepriseassurance entrepriseassurance, Vehicule vehicule, String numeroOrdre, Date dateDebut, Date dateFin, Date dateAssurance) {
       this.entrepriseassurance = entrepriseassurance;
       this.vehicule = vehicule;
       this.numeroOrdre = numeroOrdre;
       this.dateDebut = dateDebut;
       this.dateFin = dateFin;
       this.dateAssurance = dateAssurance;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idAssurance", unique=true, nullable=false)
    public Integer getIdAssurance() {
        return this.idAssurance;
    }
    
    public void setIdAssurance(Integer idAssurance) {
        this.idAssurance = idAssurance;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idEntrepriseAssurance", unique=true, nullable=false)
    public Entrepriseassurance getEntrepriseassurance() {
        return this.entrepriseassurance;
    }
    
    public void setEntrepriseassurance(Entrepriseassurance entrepriseassurance) {
        this.entrepriseassurance = entrepriseassurance;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idVehicule", unique=true, nullable=false)
    public Vehicule getVehicule() {
        return this.vehicule;
    }
    
    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    
    @Column(name="numeroOrdre", nullable=false, length=30)
    public String getNumeroOrdre() {
        return this.numeroOrdre;
    }
    
    public void setNumeroOrdre(String numeroOrdre) {
        this.numeroOrdre = numeroOrdre;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dateDebut", nullable=false, length=10)
    public Date getDateDebut() {
        return this.dateDebut;
    }
    
    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dateFin", nullable=false, length=10)
    public Date getDateFin() {
        return this.dateFin;
    }
    
    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dateAssurance", nullable=false, length=10)
    public Date getDateAssurance() {
        return this.dateAssurance;
    }
    
    public void setDateAssurance(Date dateAssurance) {
        this.dateAssurance = dateAssurance;
    }




}


