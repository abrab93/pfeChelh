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
 * Alertevisitetechnique generated by hbm2java
 */
@Entity
@Table(name="alertevisitetechnique"
    ,catalog="gestionvehiculepfe"
    , uniqueConstraints = @UniqueConstraint(columnNames="idVehicule") 
)
public class Alertevisitetechnique  implements java.io.Serializable {


     private Integer idAlerteVisiteTechnique;
     private Vehicule vehicule=new Vehicule();
     private String desceription;
     private Date dateAlert;

    public Alertevisitetechnique() {
    }

    public Alertevisitetechnique(Vehicule vehicule, String desceription, Date dateAlert) {
       this.vehicule = vehicule;
       this.desceription = desceription;
       this.dateAlert = dateAlert;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idAlerteVisiteTechnique", unique=true, nullable=false)
    public Integer getIdAlerteVisiteTechnique() {
        return this.idAlerteVisiteTechnique;
    }
    
    public void setIdAlerteVisiteTechnique(Integer idAlerteVisiteTechnique) {
        this.idAlerteVisiteTechnique = idAlerteVisiteTechnique;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idVehicule", unique=true, nullable=false)
    public Vehicule getVehicule() {
        return this.vehicule;
    }
    
    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    
    @Column(name="desceription", nullable=false, length=65535)
    public String getDesceription() {
        return this.desceription;
    }
    
    public void setDesceription(String desceription) {
        this.desceription = desceription;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="dateAlert", nullable=false, length=10)
    public Date getDateAlert() {
        return this.dateAlert;
    }
    
    public void setDateAlert(Date dateAlert) {
        this.dateAlert = dateAlert;
    }




}


