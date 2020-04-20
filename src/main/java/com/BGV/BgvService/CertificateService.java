package com.BGV.BgvService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.BGV.BgvModel.Certificate;
@Service
public interface CertificateService {
	List<Certificate> getCertificateList();
	Certificate addCertificate(@Valid Certificate certificate);
	Certificate getDetailsById(int CertId);
	 void update(Certificate certificate, int CertId);
	  void delete(int CertId);
}
