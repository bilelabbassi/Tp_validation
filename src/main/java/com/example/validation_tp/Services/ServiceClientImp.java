package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.Client;
import com.example.validation_tp.Repositories.IRepositoryClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceClientImp implements IServiceClient {

    @Autowired
    IRepositoryClient iRepositoryClient;

    @Override
    public Client addClient(Client c) {
        return iRepositoryClient.save(c);
    }

    @Override
    public Client updateClient(Client c) { return iRepositoryClient.save(c);}

    @Override
    public List<Client> retrieveAllClients() {return iRepositoryClient.findAll();}

    @Override
    public void deleteClient(Long id) {
        iRepositoryClient.deleteById(id);

    }

    @Override
    public Client retrieveClient(Long id) {
        return iRepositoryClient.findById(id).orElse(null);
    }
}
