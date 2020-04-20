package com.BGV.BgvRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BGV.BgvModel.Certificate;
@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Integer> {

}
