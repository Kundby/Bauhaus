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

    public Kunde(){
    }

    public Kunde(int korekortnr, int adresse_ID, String korekortudlob, String fornavn, String efternavn, String fodselsdato,  int telefonnr, String datoOprettet, boolean blacklist){
        this.korekortnr = korekortnr;
        this.adresse_ID = adresse_ID;
        this.korekortudlob = korekortudlob;
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.fodselsdato = fodselsdato;

        this.telefonnr = telefonnr;
        this.datoOprettet = datoOprettet;
        this.blacklist = blacklist;
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