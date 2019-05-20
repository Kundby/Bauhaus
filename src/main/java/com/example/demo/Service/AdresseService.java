package com.example.demo.Service;


import com.example.demo.Model.Adresse;
import com.example.demo.Repository.AdresseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdresseService{

    @Autowired
    AdresseRepo adresseRepo;

    public List<Adresse> fetchAll() {
        return adresseRepo.fetchAll();
    }



}
