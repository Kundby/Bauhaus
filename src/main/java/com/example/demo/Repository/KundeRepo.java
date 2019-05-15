package com.example.demo.Repository;

import com.example.demo.Model.Kunde;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class KundeRepo {

    @Autowired
    JdbcTemplate template;

    public Kunde tilføjKunde(Kunde k){
        // Tilføjer en kunde
        String sql = "INSERT INTO kunde (";
        template.update(sql, k.getKørekortNr(), k.getKørekortUdløb(), k.getFornavn(), k.getEfternavn(), k.getFødselsdato(), k.getPostNr(), k.getBy(), k.getAdresse(), k.getTelefonNr(), k.getDataOprettet(), k.isBlacklist());
        return null;
    }

    public Kunde findKundeMedKørekort(int kørekortNr){
        // Finder kunde ud fra kørekortsnr
        String sql = "SELECT * FROM kunde WHERE XXX = ?";
        RowMapper<Kunde> rowMapper = new BeanPropertyRowMapper<>(Kunde.class);
        Kunde k = template.queryForObject(sql, rowMapper, kørekortNr);
        return k;
    }

    public Boolean sletKunde(int kørekortNr){
        // Sletter kunde
        String sql = "DELETE FROM kunde WHERE XXX = ?";
        return template.update(sql, kørekortNr) > 0;
    }

    public Kunde redigerKunde(int kørekortNr, Kunde k){
        // redigerer kunde
        String sql = "UPDATE kunde SET ";
        template.update(sql, k.getKørekortNr(), k.getKørekortUdløb(), k.getFornavn(), k.getEfternavn(), k.getFødselsdato(), k.getPostNr(), k.getBy(), k.getAdresse(), k.getTelefonNr(),k.getDataOprettet(), k.isBlacklist());
        return null;
    }

}
