package com.example.validation_tp.Services;

import com.example.validation_tp.Entities.Client;

import java.util.List;

public interface IServiceClient {
    public Client addClient(Client c);
    public  Client updateClient(Client c);
    public List<Client> retrieveAllClients();
   public void deleteClient(Long id);
   public  Client retrieveClient(Long id);

}
