package com.example.demo.Controller;


import com.example.demo.Model.Adresse;
import com.example.demo.Model.Kunde;
import com.example.demo.Service.AdresseService;
import com.example.demo.Service.KundeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    KundeService kundeService;
    AdresseService adresseService;

    @GetMapping("/")
    public String index(Model model){
        List<Kunde> kundeList = kundeService.fetchAll();
        model.addAttribute("kunder", kundeList);
        return "home/index";
    }

    @GetMapping("/rediger/{korekortnr}")
    public String rediger(@PathVariable("korekortnr")int korekortnr, Model model){
        model.addAttribute("kunde", kundeService.findKundeMedKørekort(korekortnr));
        return "home/rediger";
    }

    @PostMapping("/rediger")
    public String rediger(@ModelAttribute Kunde kunde){
        kundeService.redigerKunde(kunde.getKorekortnr(), kunde);
        return "redirect:/redigerOversigt";
    }

    @GetMapping("/redigerOversigt")
    public String redigerOversigt(Model model){
        List<Kunde> kundeList = kundeService.fetchAll();
        model.addAttribute("kunder", kundeList);
        return "home/redigerOversigt";
    }
    @PostMapping("/redigerOversigt")
    public String redigerOversigt(@ModelAttribute Kunde kunde){
        kundeService.redigerKunde(kunde.getKorekortNr(), kunde);
        return "redirect:/redigerOversigt";
    }

    @GetMapping("/slet/{korekortnr}")
    public String slet(@PathVariable ("korekortnr") int korekortnr){
        boolean slettet = kundeService.sletKunde(korekortnr);
        if (slettet){
            return "redirect:/redigerOversigt";
        }else{
            return "redirect:/redigerOversigt";
        }
    }

}
