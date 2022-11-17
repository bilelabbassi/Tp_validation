package com.example.validation_tp.Repositories;

import com.example.validation_tp.Entities.Client;
import com.example.validation_tp.Entities.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRepositoryFacture extends JpaRepository<Facture,Long> {

    List<Facture> findByClientIdclient(long idclient);
}
