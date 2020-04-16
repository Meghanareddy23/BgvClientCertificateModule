package com.BGV.BgvRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BGV.BgvModel.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
