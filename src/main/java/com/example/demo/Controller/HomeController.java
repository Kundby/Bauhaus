package com.example.demo.Controller;


import com.example.demo.Model.Kunde;
import com.example.demo.Service.KundeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    KundeService kundeService;

    @GetMapping("/")
    public String index(Model model){
        List<Kunde> kundeList = kundeService.fetchAll();
        model.addAttribute("kunder", kundeList);
        return "home/index";
    }

    @PostMapping("/tilføj")
    public String tilføj (@ModelAttribute Kunde kunde){
        kundeService.tilføjKunde(kunde);
        return "home/tilføjBekræft";
    }

    @PostMapping("/rediger")
    public String opdater(@ModelAttribute Kunde kunde){
        kundeService.redigerKunde(kunde.getKørekortNr(), kunde);
        return "home/redigerOversigt";
    }
}
