package org.nioun.essentials.client.controller;

import java.util.List;

import org.nioun.essentials.client.model.Client;
import org.nioun.essentials.client.repository.ClientRepository;
import org.nioun.essentials.client.service.ClientService;
import org.nioun.essentials.client.util.EmailUtil;
import org.nioun.essentials.client.util.ReportUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientXController {
	@Autowired
	ClientService service;

	@Autowired
	ClientRepository repository;

	@Autowired
	EmailUtil emailUtil;

	@Autowired
	ReportUtil reportUtil;


	@RequestMapping("/creerClient")
	public String creerClient(ModelMap map) {
		Client client= new Client();
		map.addAttribute(client);
		return "ajouterClient";
	}

	@RequestMapping("/saveClient")
	public String saveClient(@ModelAttribute("client") Client client, ModelMap modelMap) {
		Client clientSaved = service.saveClient(client);
		String msg = "Client saved with id: " + clientSaved.getClientId();
		modelMap.addAttribute("msg", msg);
		 emailUtil.sendEmail("mmdukb@hotmail.com", "Client Saved",
				"Client Saved Successfully and about to return a response");

		return "ajouterClient";
	}

	@RequestMapping("/displayClients")
	public String displayClients(ModelMap modelMap) {
		List<Client> clients = service.getAllClients();
		modelMap.addAttribute("clients", clients);
		return "displayClients";
	}

	@RequestMapping("deleteClient")
	public String deleteClient(@RequestParam("clientId") Long clientId, ModelMap modelMap) {
		 // Client Client = service.getClient(ClientId);
		Client client = new Client();
		client.setClientId(clientId);
		service.deleteClient(client);
		List<Client> clients = service.getAllClients();
		modelMap.addAttribute("clients", clients);
		return "displayClients";
	}

	@RequestMapping("/showUpdate")
	public String showUpdate(@RequestParam("clientId") Long clientId, ModelMap modelMap) {
		Client client = service.getClient(clientId);
		modelMap.addAttribute("client", client);
		return "updateClient";
	}

	@RequestMapping("/updateClient")
	public String updateClient(@ModelAttribute("client") Client client, ModelMap modelMap) {
		service.updateClient(client);
		List<Client> clients = service.getAllClients();
		modelMap.addAttribute("clients", clients);
		return "afficherClients";
	}


}
