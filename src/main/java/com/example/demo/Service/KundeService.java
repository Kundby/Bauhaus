package com.example.demo.Service;

import com.example.demo.Model.Kunde;
import com.example.demo.Repository.KundeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KundeService {

    @Autowired
    KundeRepo kundeRepo;

    public List<Kunde> fetchAll(){
        return kundeRepo.fetchAll();
    }

    public Kunde tilføjKunde(Kunde k){
        // Tilføjer kunde
        return kundeRepo.tilføjKunde(k);
    }

    public Kunde findKundeMedKørekort(int kørekortNr){
        // Finder en kunde ud fra KørekortNr
        return kundeRepo.findKundeMedKørekort(kørekortNr);
    }

    public Boolean sletKunde(int kørekortNr){
        // Sletter kunde ud fra kørekortNr
        return kundeRepo.sletKunde(kørekortNr);
    }

    public  Kunde redigerKunde(int køreKortNr, Kunde k){
        // redigerer kunde
        return kundeRepo.redigerKunde(køreKortNr, k);
    }


}
