package org.nioun.essentials.client.service;

import java.util.List;

import org.nioun.essentials.client.model.Client;

public interface ClientService {

Client	saveClient(Client client);

Client updateClient(Client client);

void deleteClient(Client client);

Client getClient(Long clientId);

List<Client> getAllClients();
	
}
