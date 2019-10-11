package bo;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

public class Collaborateur {
    private String matricule;
    private String nom;
    private LocalDate dateNaissance;
    private String adresse;
    private String noSecuSociale;
    private String emailPro;
    private String photo;
    private ZonedDateTime dateHeureCreation;
    private boolean actif;

    public Collaborateur(String matricule, String nom, LocalDate dateNaissance, String adresse, String noSecuSociale, String emailPro, String photo, ZonedDateTime dateHeureCreation, boolean actif) {
        this.matricule = matricule;
        this.nom = nom;
        this.dateNaissance = dateNaissance;
        this.adresse = adresse;
        this.noSecuSociale = noSecuSociale;
        this.emailPro = emailPro;
        this.photo = photo;
        this.dateHeureCreation = dateHeureCreation;
        this.actif = actif;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNoSecuSociale() {
        return noSecuSociale;
    }

    public void setNoSecuSociale(String noSecuSociale) {
        this.noSecuSociale = noSecuSociale;
    }

    public String getEmailPro() {
        return emailPro;
    }

    public void setEmailPro(String emailPro) {
        this.emailPro = emailPro;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public ZonedDateTime getDateHeureCreation() {
        return dateHeureCreation;
    }

    public void setDateHeureCreation(ZonedDateTime dateHeureCreation) {
        this.dateHeureCreation = dateHeureCreation;
    }

    public boolean isActif() {
        return actif;
    }

    public void setActif(boolean actif) {
        this.actif = actif;
    }

    @Override
    public String toString() {
        return "Collaborateur{" +
                "matricule='" + matricule + '\'' +
                ", nom='" + nom + '\'' +
                ", dateNaissance=" + dateNaissance +
                ", adresse='" + adresse + '\'' +
                ", noSecuSociale='" + noSecuSociale + '\'' +
                ", emailPro='" + emailPro + '\'' +
                ", photo='" + photo + '\'' +
                ", dateHeureCreation=" + dateHeureCreation +
                ", actif=" + actif +
                '}';
    }
}
