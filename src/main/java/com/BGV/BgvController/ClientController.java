package com.BGV.BgvController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.BGV.BgvModel.Client;
import com.BGV.BgvService.ClientServices;

@RestController
@RequestMapping("/client")
public class ClientController {
	@Autowired
	ClientServices clientServices;
	@GetMapping("/list")
	private List<Client> getClientList()
	{
		return clientServices.getClientList();
	}
	@PostMapping("/add")
	public int createProvider(@Valid @RequestBody Client client) {
		Client cli = clientServices.createClient(client);
		return cli.getCliId();
	}
	@GetMapping("/list/{CliId}")
	private Client getDetailsById(@PathVariable("CliId") int CliId) 
	{
	return clientServices.getDetailsById(CliId);
	}
	@PutMapping("/update")
	private Client update(@RequestBody Client client) 
	{
	clientServices.createClient(client);
	return client;
	}
	@DeleteMapping("/delete/{CliId}")
	private void delete(@PathVariable("CliId") int CliId) 
	{
	clientServices.delete(CliId);
	}

}
