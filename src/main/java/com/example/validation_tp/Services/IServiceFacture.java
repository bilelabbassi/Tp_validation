package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.Facture;

import java.util.List;

public interface IServiceFacture {

    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);

    public List<Facture> findFactureByClien(long idclient);

    public Facture addFacturetoClient(Facture f, long idclient);
}
