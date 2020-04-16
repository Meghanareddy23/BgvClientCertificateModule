package com.BGV.BgvController;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

}
