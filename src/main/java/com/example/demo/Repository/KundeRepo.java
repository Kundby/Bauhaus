package com.example.demo.Repository;

import com.example.demo.Model.Kunde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class KundeRepo {

    @Autowired
    JdbcTemplate template;

    public List<Kunde> fetchAll(){
        String sql = "SELECT k.*, a.* FROM nf3kunde k JOIN nf3adresse a ON k.adresse_ID=a.adresse_ID WHERE k.adresse_ID = 1";
        RowMapper<Kunde> rowMapper = new BeanPropertyRowMapper<>(Kunde.class);
        return template.query(sql, rowMapper);
    }

    public Kunde tilføjKunde(Kunde k){
        // Tilføjer en kunde
        String sql = "INSERT INTO nf3kunde (kørekortnr, kørekortudløb, fornavn, efternavn, fødselsdato, adresse, telefonnr, datoOprettet, blacklist) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        template.update(sql, k.getKorekortNr(), k.getKorekortUdlob(), k.getFornavn(), k.getEfternavn(), k.getFodselsdato(), /*k.getAdresse(), k.getTelefonNr(), k.getDataOprettet(),*/ k.isBlacklist());
       /* String sql2 = "INSERT INTO nf3kunde (postnummer, bynavn) VALUES (?, ?)";
        template.update(sql2, k.getPostNr(), k.getBy());*/
        return null;
    }

    public Kunde findKundeMedKørekort(int kørekortNr){
        // Finder kunde ud fra kørekortsnr
        String sql = "SELECT * FROM kunde WHERE kørekortnr = ?";
        RowMapper<Kunde> rowMapper = new BeanPropertyRowMapper<>(Kunde.class);
        Kunde k = template.queryForObject(sql, rowMapper, kørekortNr);
        return k;
    }

    public Boolean sletKunde(int kørekortNr){
        // Sletter kunde
        String sql = "DELETE FROM kunde WHERE kørekortnr = ?";
        return template.update(sql, kørekortNr) > 0;
    }

    public Kunde redigerKunde(int kørekortNr, Kunde k){
        // redigerer kunde
        String sql = "UPDATE nf3kunde SET kørekortnr = ?, kørekortudløb = ?,fornavn = ?,efternavn = ?,fødselsdato = ?,adresse = ?,telefonnr = ?,datoOprettet = ?,blacklist = ? WHERE kørekortnr = ?";
        template.update(sql, k.getKorekortNr(), k.getKorekortUdlob(), k.getFornavn(), k.getEfternavn(), k.getFodselsdato(), /*k.getAdresse(), k.getTelefonNr(),k.getDataOprettet(),*/ k.isBlacklist());
       /* String sql2 = "UPDATE nf3kunde SET postnummer = ?, bynavn = ? WHERE kørekortnr = ?";
        template.update(sql2, k.getPostNr(), k.getBy());*/
        return null;
    }

}
