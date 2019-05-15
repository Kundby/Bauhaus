package com.example.demo.Model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kunde {
    @Id
    private int kørekortNr;
    private String kørekortUdløb;
    private String fornavn;
    private String efternavn;
    private String fødselsdato;
    private int postNr;
    private String by;
    private String adresse;
    private int telefonNr;
    private String dataOprettet;
    private boolean blacklist;

    public Kunde(){
    }

    public Kunde(int KørekortNr, String KørekortUdløb, String Fornavn, String Efternavn, String Fødselsdato, int PostNr, String By, String Adresse, int TelefonNr, String DatoOprettet, boolean Blacklist){
        this.kørekortNr = KørekortNr;
        this.kørekortUdløb = KørekortUdløb;
        this.fornavn = Fornavn;
        this.efternavn = Efternavn;
        this.fødselsdato = Fødselsdato;
        this.postNr = PostNr;
        this.by = By;
        this.adresse = Adresse;
        this.telefonNr = TelefonNr;
        this.dataOprettet = DatoOprettet;
        this.blacklist = Blacklist;
    }

    public int getKørekortNr() {
        return kørekortNr;
    }

    public void setKørekortNr(int kørekortNr) {
        this.kørekortNr = kørekortNr;
    }

    public String getKørekortUdløb() {
        return kørekortUdløb;
    }

    public void setKørekortUdløb(String kørekortUdløb) {
        this.kørekortUdløb = kørekortUdløb;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public String getFødselsdato() {
        return fødselsdato;
    }

    public void setFødselsdato(String fødselsdato) {
        this.fødselsdato = fødselsdato;
    }

    public int getPostNr() {
        return postNr;
    }

    public void setPostNr(int postNr) {
        this.postNr = postNr;
    }

    public String getBy() {
        return by;
    }

    public void setBy(String by) {
        this.by = by;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getTelefonNr() {
        return telefonNr;
    }

    public void setTelefonNr(int telefonNr) {
        this.telefonNr = telefonNr;
    }

    public String getDataOprettet() {
        return dataOprettet;
    }

    public void setDataOprettet(String dataOprettet) {
        this.dataOprettet = dataOprettet;
    }

    public boolean isBlacklist() {
        return blacklist;
    }

    public void setBlacklist(boolean blacklist) {
        this.blacklist = blacklist;
    }
}