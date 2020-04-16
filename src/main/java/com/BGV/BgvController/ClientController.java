package com.BGV.BgvController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
}
