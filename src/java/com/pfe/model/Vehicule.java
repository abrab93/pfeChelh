package com.pfe.model;
// Generated 1 mai 2015 23:05:25 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Vehicule generated by hbm2java
 */
@Entity
@Table(name="vehicule"
    ,catalog="gestionvehiculepfe"
    , uniqueConstraints = {@UniqueConstraint(columnNames="idMarque"), @UniqueConstraint(columnNames="idProprietaire"), @UniqueConstraint(columnNames="idTypeCarburant"), @UniqueConstraint(columnNames="idTypeVehicule")} 
)
public class Vehicule  implements java.io.Serializable {


     private Integer idVehicule;
     private Marque marque=new Marque();
     private Proprietairevehicule proprietairevehicule=new Proprietairevehicule();
     private Typecarburant typecarburant=new Typecarburant();
     private Typevehicule typevehicule=new Typevehicule();
     private String immatriculation;
     private Date date1mc;
     private Date date1mcmaroc;
     private String usageVehicule;
     private String numeroChassis;
     private int nombreCylindres;
     private int puissanceFiscale;
     private int nombrePlaces;
     private double ptac;
     private double poidsVide;
     private double ptmct;
     private boolean remorque;
     private double dureDeVie;
     private double kilometrageVehicule;
     private Set<Alerteasurance> alerteasurances = new HashSet<Alerteasurance>(0);
     private Set<Alertepneu> alertepneus = new HashSet<Alertepneu>(0);
     private Set<Visitetechnique> visitetechniques = new HashSet<Visitetechnique>(0);
     private Set<Alertevisitetechnique> alertevisitetechniques = new HashSet<Alertevisitetechnique>(0);
     private Set<Panne> pannes = new HashSet<Panne>(0);
     private Set<Pneu> pneus = new HashSet<Pneu>(0);
     private Set<Vignette> vignettes = new HashSet<Vignette>(0);
     private Set<Vidange> vidanges = new HashSet<Vidange>(0);
     private Set<Alertevidange> alertevidanges = new HashSet<Alertevidange>(0);
     private Set<Assurance> assurances = new HashSet<Assurance>(0);
     private Set<Reservation> reservations = new HashSet<Reservation>(0);
     private Set<Alertevignette> alertevignettes = new HashSet<Alertevignette>(0);

    public Vehicule() {
    }

	
    public Vehicule(Marque marque, Proprietairevehicule proprietairevehicule, Typecarburant typecarburant, Typevehicule typevehicule, String immatriculation, Date date1mc, Date date1mcmaroc, String usageVehicule, String numeroChassis, int nombreCylindres, int puissanceFiscale, int nombrePlaces, double ptac, double poidsVide, double ptmct, boolean remorque, double dureDeVie, double kilometrageVehicule) {
        this.marque = marque;
        this.proprietairevehicule = proprietairevehicule;
        this.typecarburant = typecarburant;
        this.typevehicule = typevehicule;
        this.immatriculation = immatriculation;
        this.date1mc = date1mc;
        this.date1mcmaroc = date1mcmaroc;
        this.usageVehicule = usageVehicule;
        this.numeroChassis = numeroChassis;
        this.nombreCylindres = nombreCylindres;
        this.puissanceFiscale = puissanceFiscale;
        this.nombrePlaces = nombrePlaces;
        this.ptac = ptac;
        this.poidsVide = poidsVide;
        this.ptmct = ptmct;
        this.remorque = remorque;
        this.dureDeVie = dureDeVie;
        this.kilometrageVehicule = kilometrageVehicule;
    }
    public Vehicule(Marque marque, Proprietairevehicule proprietairevehicule, Typecarburant typecarburant, Typevehicule typevehicule, String immatriculation, Date date1mc, Date date1mcmaroc, String usageVehicule, String numeroChassis, int nombreCylindres, int puissanceFiscale, int nombrePlaces, double ptac, double poidsVide, double ptmct, boolean remorque, double dureDeVie, double kilometrageVehicule, Set<Alerteasurance> alerteasurances, Set<Alertepneu> alertepneus, Set<Visitetechnique> visitetechniques, Set<Alertevisitetechnique> alertevisitetechniques, Set<Panne> pannes, Set<Pneu> pneus, Set<Vignette> vignettes, Set<Vidange> vidanges, Set<Alertevidange> alertevidanges, Set<Assurance> assurances, Set<Reservation> reservations, Set<Alertevignette> alertevignettes) {
       this.marque = marque;
       this.proprietairevehicule = proprietairevehicule;
       this.typecarburant = typecarburant;
       this.typevehicule = typevehicule;
       this.immatriculation = immatriculation;
       this.date1mc = date1mc;
       this.date1mcmaroc = date1mcmaroc;
       this.usageVehicule = usageVehicule;
       this.numeroChassis = numeroChassis;
       this.nombreCylindres = nombreCylindres;
       this.puissanceFiscale = puissanceFiscale;
       this.nombrePlaces = nombrePlaces;
       this.ptac = ptac;
       this.poidsVide = poidsVide;
       this.ptmct = ptmct;
       this.remorque = remorque;
       this.dureDeVie = dureDeVie;
       this.kilometrageVehicule = kilometrageVehicule;
       this.alerteasurances = alerteasurances;
       this.alertepneus = alertepneus;
       this.visitetechniques = visitetechniques;
       this.alertevisitetechniques = alertevisitetechniques;
       this.pannes = pannes;
       this.pneus = pneus;
       this.vignettes = vignettes;
       this.vidanges = vidanges;
       this.alertevidanges = alertevidanges;
       this.assurances = assurances;
       this.reservations = reservations;
       this.alertevignettes = alertevignettes;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idVehicule", unique=true, nullable=false)
    public Integer getIdVehicule() {
        return this.idVehicule;
    }
    
    public void setIdVehicule(Integer idVehicule) {
        this.idVehicule = idVehicule;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idMarque", unique=true, nullable=false)
    public Marque getMarque() {
        return this.marque;
    }
    
    public void setMarque(Marque marque) {
        this.marque = marque;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idProprietaire", unique=true, nullable=false)
    public Proprietairevehicule getProprietairevehicule() {
        return this.proprietairevehicule;
    }
    
    public void setProprietairevehicule(Proprietairevehicule proprietairevehicule) {
        this.proprietairevehicule = proprietairevehicule;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idTypeCarburant", unique=true, nullable=false)
    public Typecarburant getTypecarburant() {
        return this.typecarburant;
    }
    
    public void setTypecarburant(Typecarburant typecarburant) {
        this.typecarburant = typecarburant;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idTypeVehicule", unique=true, nullable=false)
    public Typevehicule getTypevehicule() {
        return this.typevehicule;
    }
    
    public void setTypevehicule(Typevehicule typevehicule) {
        this.typevehicule = typevehicule;
    }

    
    @Column(name="immatriculation", nullable=false, length=30)
    public String getImmatriculation() {
        return this.immatriculation;
    }
    
    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date1MC", nullable=false, length=10)
    public Date getDate1mc() {
        return this.date1mc;
    }
    
    public void setDate1mc(Date date1mc) {
        this.date1mc = date1mc;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date1MCMaroc", nullable=false, length=10)
    public Date getDate1mcmaroc() {
        return this.date1mcmaroc;
    }
    
    public void setDate1mcmaroc(Date date1mcmaroc) {
        this.date1mcmaroc = date1mcmaroc;
    }

    
    @Column(name="usageVehicule", nullable=false, length=40)
    public String getUsageVehicule() {
        return this.usageVehicule;
    }
    
    public void setUsageVehicule(String usageVehicule) {
        this.usageVehicule = usageVehicule;
    }

    
    @Column(name="numeroChassis", nullable=false, length=40)
    public String getNumeroChassis() {
        return this.numeroChassis;
    }
    
    public void setNumeroChassis(String numeroChassis) {
        this.numeroChassis = numeroChassis;
    }

    
    @Column(name="nombreCylindres", nullable=false)
    public int getNombreCylindres() {
        return this.nombreCylindres;
    }
    
    public void setNombreCylindres(int nombreCylindres) {
        this.nombreCylindres = nombreCylindres;
    }

    
    @Column(name="puissanceFiscale", nullable=false)
    public int getPuissanceFiscale() {
        return this.puissanceFiscale;
    }
    
    public void setPuissanceFiscale(int puissanceFiscale) {
        this.puissanceFiscale = puissanceFiscale;
    }

    
    @Column(name="nombrePlaces", nullable=false)
    public int getNombrePlaces() {
        return this.nombrePlaces;
    }
    
    public void setNombrePlaces(int nombrePlaces) {
        this.nombrePlaces = nombrePlaces;
    }

    
    @Column(name="pTAC", nullable=false, precision=22, scale=0)
    public double getPtac() {
        return this.ptac;
    }
    
    public void setPtac(double ptac) {
        this.ptac = ptac;
    }

    
    @Column(name="poidsVide", nullable=false, precision=22, scale=0)
    public double getPoidsVide() {
        return this.poidsVide;
    }
    
    public void setPoidsVide(double poidsVide) {
        this.poidsVide = poidsVide;
    }

    
    @Column(name="pTMCT", nullable=false, precision=22, scale=0)
    public double getPtmct() {
        return this.ptmct;
    }
    
    public void setPtmct(double ptmct) {
        this.ptmct = ptmct;
    }

    
    @Column(name="remorque", nullable=false)
    public boolean isRemorque() {
        return this.remorque;
    }
    
    public void setRemorque(boolean remorque) {
        this.remorque = remorque;
    }

    
    @Column(name="dureDeVie", nullable=false, precision=22, scale=0)
    public double getDureDeVie() {
        return this.dureDeVie;
    }
    
    public void setDureDeVie(double dureDeVie) {
        this.dureDeVie = dureDeVie;
    }

    
    @Column(name="kilometrageVehicule", nullable=false, precision=22, scale=0)
    public double getKilometrageVehicule() {
        return this.kilometrageVehicule;
    }
    
    public void setKilometrageVehicule(double kilometrageVehicule) {
        this.kilometrageVehicule = kilometrageVehicule;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vehicule")
    public Set<Alerteasurance> getAlerteasurances() {
        return this.alerteasurances;
    }
    
    public void setAlerteasurances(Set<Alerteasurance> alerteasurances) {
        this.alerteasurances = alerteasurances;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vehicule")
    public Set<Alertepneu> getAlertepneus() {
        return this.alertepneus;
    }
    
    public void setAlertepneus(Set<Alertepneu> alertepneus) {
        this.alertepneus = alertepneus;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vehicule")
    public Set<Visitetechnique> getVisitetechniques() {
        return this.visitetechniques;
    }
    
    public void setVisitetechniques(Set<Visitetechnique> visitetechniques) {
        this.visitetechniques = visitetechniques;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vehicule")
    public Set<Alertevisitetechnique> getAlertevisitetechniques() {
        return this.alertevisitetechniques;
    }
    
    public void setAlertevisitetechniques(Set<Alertevisitetechnique> alertevisitetechniques) {
        this.alertevisitetechniques = alertevisitetechniques;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vehicule")
    public Set<Panne> getPannes() {
        return this.pannes;
    }
    
    public void setPannes(Set<Panne> pannes) {
        this.pannes = pannes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vehicule")
    public Set<Pneu> getPneus() {
        return this.pneus;
    }
    
    public void setPneus(Set<Pneu> pneus) {
        this.pneus = pneus;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vehicule")
    public Set<Vignette> getVignettes() {
        return this.vignettes;
    }
    
    public void setVignettes(Set<Vignette> vignettes) {
        this.vignettes = vignettes;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vehicule")
    public Set<Vidange> getVidanges() {
        return this.vidanges;
    }
    
    public void setVidanges(Set<Vidange> vidanges) {
        this.vidanges = vidanges;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vehicule")
    public Set<Alertevidange> getAlertevidanges() {
        return this.alertevidanges;
    }
    
    public void setAlertevidanges(Set<Alertevidange> alertevidanges) {
        this.alertevidanges = alertevidanges;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vehicule")
    public Set<Assurance> getAssurances() {
        return this.assurances;
    }
    
    public void setAssurances(Set<Assurance> assurances) {
        this.assurances = assurances;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vehicule")
    public Set<Reservation> getReservations() {
        return this.reservations;
    }
    
    public void setReservations(Set<Reservation> reservations) {
        this.reservations = reservations;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vehicule")
    public Set<Alertevignette> getAlertevignettes() {
        return this.alertevignettes;
    }
    
    public void setAlertevignettes(Set<Alertevignette> alertevignettes) {
        this.alertevignettes = alertevignettes;
    }

    @Override
    public String toString() {
        return "Vehicule{" + "idVehicule=" + idVehicule + ", alertevignettes=" + alertevignettes + '}';
    }




}


