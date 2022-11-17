package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.Client;
import com.example.validation_tp.Entities.Facture;
import com.example.validation_tp.Repositories.IRepositoryClient;
import com.example.validation_tp.Repositories.IRepositoryFacture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ServiceFactureImp implements IServiceFacture{
    @Autowired
    IRepositoryFacture iRepositoryFacture;
    @Autowired
    IRepositoryClient iRepositoryClient;


    @Override
    public List<Facture> retrieveAllFactures() {
        return iRepositoryFacture.findAll();
    }

    @Override
    public void cancelFacture(Long id) {

    }

    @Override
    public Facture retrieveFacture(Long id) {
        return iRepositoryFacture.findById(id).orElse(null);
    }

    @Override
    public List<Facture> findFactureByClien(long idclient) {
        return iRepositoryFacture.findByClientIdclient(idclient);
    }

    @Override
    public Facture addFacturetoClient(Facture f, long idclient) {
        Client client = iRepositoryClient.findById(idclient).orElse(null);
        if (client!=null){
     Facture facture= iRepositoryFacture.save(f);
     facture.setClient(client);
        return iRepositoryFacture.save(facture);
        }

        return null;
    }
}
