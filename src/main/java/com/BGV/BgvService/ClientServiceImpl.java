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

	@Override
	public Client getDetailsById(int CliId) {
		// TODO Auto-generated method stub
		return clientRepository.findById(CliId).get();
	}

	@Override
	public void update(Client client, int CliId) {
		// TODO Auto-generated method stub
		clientRepository.save(client);
	}

	@Override
	public void delete(int CliId) {
		// TODO Auto-generated method stub
		clientRepository.deleteById(CliId);	}

	
	
	
	
		
		

}
