package com.example.demo.Repository;

import com.example.demo.Model.Adresse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdresseRepo {

    @Autowired
    JdbcTemplate template;

    public List<Adresse> fetchAll(){
        String sql = "SELECT * FROM nf3adresse";
        RowMapper<Adresse> rowMapper = new BeanPropertyRowMapper<>(Adresse.class);
        return template.query(sql, rowMapper);
    }
}
