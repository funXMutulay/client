package org.nioun.essentials.client.service;

import java.util.List;

import org.nioun.essentials.client.model.Client;
import org.nioun.essentials.client.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

	
	@Autowired
	ClientRepository clientRepository;
	
	
	
	public ClientRepository getClientRepository() {
		return clientRepository;
	}


	public void setClientRepository(ClientRepository clientRepository) {
		this.clientRepository = clientRepository;
	}


	public Client saveClient(Client client) {
	
		return clientRepository.save(client);
	}


	public Client updateClient(Client client) {

		return clientRepository.save(client);
	}


	public void deleteClient(Client client) {
		clientRepository.delete(client);

	}


	public Client getClient(Long clientId) {

		return clientRepository.findById(clientId).get();
	}


	public List<Client> getAllClients() {

		return clientRepository.findAll();
	}

}
