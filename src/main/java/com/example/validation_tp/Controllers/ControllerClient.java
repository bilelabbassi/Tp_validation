package com.example.validation_tp.Controllers;

import com.example.validation_tp.Entities.Client;
import com.example.validation_tp.Services.IServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ControllerClient {
    @Autowired
    IServiceClient iServiceClient;

    @PostMapping
    public Client addClient(@RequestBody Client c) {

        return iServiceClient.addClient(c);
    }

    @PutMapping()
    public Client UpdateClient(@RequestBody Client c) {

        return iServiceClient.updateClient(c);
    }
@GetMapping()
    public List<Client> getAllClient (){
        return iServiceClient.retrieveAllClients();
}
@GetMapping("/{id}")
public Client getById (@PathVariable long id){
        return iServiceClient.retrieveClient( id);
}
@DeleteMapping("/{id}")
    public void Deleteclient(@PathVariable long id){
        iServiceClient.deleteClient(id);
}

}
