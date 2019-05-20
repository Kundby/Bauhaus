package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Adresse {
    @Id
    private int adresse_ID;
    private int postnummer;
    private String bynavn;
    private String adresse;

    public Adresse(){

    }
    public Adresse(int adresse_ID, int postnummer, String bynavn, String adresse){
        this.adresse_ID = adresse_ID;
        this.postnummer = postnummer;
        this.bynavn = bynavn;
        this.adresse = adresse;
    }

    public int getAdresse_ID() {
        return adresse_ID;
    }

    public void setAdresse_ID(int adresse_ID) {
        this.adresse_ID = adresse_ID;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }

    public String getBynavn() {
        return bynavn;
    }

    public void setBynavn(String bynavn) {
        this.bynavn = bynavn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
