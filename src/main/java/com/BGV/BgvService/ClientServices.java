package com.BGV.BgvService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.BGV.BgvModel.Client;

@Service
public interface ClientServices {
	List<Client> getClientList();

	}
