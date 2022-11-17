package com.example.validation_tp.Controllers;

import com.example.validation_tp.Entities.Facture;
import com.example.validation_tp.Services.IServiceFacture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facture")
public class FactureController {
    @Autowired
    IServiceFacture iServiceFacture;
    @GetMapping("/{idclient}")
    public List<Facture> findFactureByClien(@PathVariable long idclient ){
        return iServiceFacture.findFactureByClien(idclient);
    }
    @PostMapping("/{idclient}")
    public Facture addFacturetoClient(@RequestBody Facture f,@PathVariable long idclient){

        return iServiceFacture.addFacturetoClient(f,idclient) ;  }
}
