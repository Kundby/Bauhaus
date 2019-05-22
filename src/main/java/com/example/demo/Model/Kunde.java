package com.example.demo.Model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Kunde {
    @Id
    private int korekortnr;
    private int adresse_ID;
    private String korekortudlob;
    private String fornavn;
    private String efternavn;
    private String fodselsdato;
    private int postnummer;
    private String bynavn;
    private String adresse;
    private int telefonnr;
    private String datoOprettet;
    private boolean blacklist;
    private String blacklist_besk;

    public Kunde(){
    }

    public Kunde(int korekortnr, int adresse_ID, String korekortudlob, String fornavn, String efternavn, String fodselsdato, int postnummer, String bynavn, String adresse,  int telefonnr, String datoOprettet, boolean blacklist, String blacklist_besk){
        this.korekortnr = korekortnr;
        this.adresse_ID = adresse_ID;
        this.korekortudlob = korekortudlob;
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.fodselsdato = fodselsdato;
        this.postnummer = postnummer;
        this.bynavn = bynavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
        this.datoOprettet = datoOprettet;
        this.blacklist = blacklist;
        this.blacklist_besk = blacklist_besk;
    }

    public int getPostnummer() {
        return postnummer;
    }

    public void setPostnummer(int postnummer) {
        this.postnummer = postnummer;
    }

    public String getBlacklist_besk() {
        return blacklist_besk;
    }

    public void setBlacklist_besk(String blacklist_besk) {
        this.blacklist_besk = blacklist_besk;
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

    public void setDatoOprettet(String datoOprettet) {
        this.datoOprettet = datoOprettet;
    }

    public int getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(int telefonnr) {
        this.telefonnr = telefonnr;
    }

    public int getAdresse_ID() {
        return adresse_ID;
    }

    public void setAdresse_ID(int adresse_ID) {
        this.adresse_ID = adresse_ID;
    }

    public int getKorekortnr() {
        return korekortnr;
    }

    public void setKorekortnr(int korekortnr) {
        this.korekortnr = korekortnr;
    }

    public String getKorekortudlob() {
        return korekortudlob;
    }

    public void setKorekortudlob(String korekortudlob) {
        this.korekortudlob = korekortudlob;
    }

    public int getKorekortNr() {
        return korekortnr;
    }

    public void setKorekortNr(int korekortnr) {
        this.korekortnr = korekortnr;
    }

    public String getKorekortUdlob() {
        return korekortudlob;
    }

    public void setKorekortUdlob(String korekortUdlob) {
        this.korekortudlob = korekortUdlob;
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

    public String getFodselsdato() {
        return fodselsdato;
    }

    public void setFodselsdato(String fodselsdato) {
        this.fodselsdato = fodselsdato;
    }



    public String getDatoOprettet() {
        return datoOprettet;
    }

    public void setDataOprettet(String datoOprettet) {
        this.datoOprettet = datoOprettet;
    }

    public boolean isBlacklist() {
        return blacklist;
    }

    public void setBlacklist(boolean blacklist) {
        this.blacklist = blacklist;
    }
}