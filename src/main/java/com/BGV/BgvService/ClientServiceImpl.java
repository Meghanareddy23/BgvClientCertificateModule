package com.BGV.BgvService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.BGV.BgvModel.Client;
import com.BGV.BgvRepository.ClientRepository;
@Component
@Service
public class ClientServiceImpl implements ClientServices {
	@Autowired
	ClientRepository clientRepository;

	@Override
	public List<Client> getClientList() {
		// TODO Auto-generated method stub
		List<Client> clientList= clientRepository.findAll();
		return clientList;
	}

	@Override
	public Client createClient(@Valid Client client) {
		// TODO Auto-generated method stub
		return clientRepository.save(client);
	}

	
	
	
	
		
		

}
