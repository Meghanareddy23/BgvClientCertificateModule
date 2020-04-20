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

import com.BGV.BgvModel.Certificate;
import com.BGV.BgvService.CertificateService;
@RestController
@RequestMapping("/certificate")

public class CertificateController {
 @Autowired
 CertificateService certificateService;
 @GetMapping("/list")
 private List<Certificate> getCertificateList()
	{
		return certificateService.getCertificateList();
	}
 @PostMapping("/add")
	public int createCertificate(@Valid @RequestBody Certificate certificate) {
		Certificate cert = certificateService.addCertificate(certificate);
		return cert.getCertId();
	}
 @GetMapping("/list/{CertId}")
	private Certificate getDetailsById(@PathVariable("CertId") int CertId) 
	{
	return certificateService.getDetailsById(CertId);
	}
	@PutMapping("/update")
	private Certificate update(@RequestBody Certificate certificate) 
	{
	certificateService.addCertificate(certificate);
	return certificate;
	}
	@DeleteMapping("/delete/{CertId}")
	private void delete(@PathVariable("CertId") int CertId) 
	{
	certificateService.delete(CertId);
	}

}
