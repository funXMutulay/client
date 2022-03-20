package org.nioun.essentials.client.controller;

import org.nioun.essentials.client.model.Client;
import org.nioun.essentials.client.repository.ClientRepository;
import org.nioun.essentials.client.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	@Autowired
	ClientRepository clientRepository ;
	
	@Autowired
	ClientService clientService;

@GetMapping("/client/firstName/{firstName}/lastName/{lastName}")
public  Client	getClient(@PathVariable String firstName , @PathVariable String lastName){
	 
	Client client = clientRepository.findByFirstNameAndLastName(firstName, lastName);
	
	if (client==null){
		
		throw new RuntimeException("Impossible de trouver le clientaunom de  "+firstName+lastName);
	}
	
	return  client;
	}

@GetMapping("/client/clientId/{clientId}")
public Client getClientById(@PathVariable Long clientId) {
	
	Client client = clientService.getClient(clientId);
	return client;
}
	
}
