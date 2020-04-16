package com.BGV.BgvRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BGV.BgvModel.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
