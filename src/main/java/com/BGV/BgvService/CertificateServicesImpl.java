package com.BGV.BgvService;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BGV.BgvModel.Certificate;
import com.BGV.BgvRepository.CertificateRepository;
@Service
public class CertificateServicesImpl implements CertificateService{
@Autowired
CertificateRepository certificateRepository;

	@Override
	public List<Certificate> getCertificateList() {
		// TODO Auto-generated method stub
		List<Certificate> certificateList=certificateRepository.findAll();
		
		return certificateList;
	}

	@Override
	public Certificate addCertificate(@Valid Certificate certificate) {
		// TODO Auto-generated method stub
		return certificateRepository.save(certificate);
	}

	@Override
	public Certificate getDetailsById(int CertId) {
		// TODO Auto-generated method stub
		return certificateRepository.findById(CertId).get();
	}

	@Override
	public void update(Certificate certificate, int CertId) {
		// TODO Auto-generated method stub
		certificateRepository.save(certificate);
	}

	@Override
	public void delete(int CertId) {
		// TODO Auto-generated method stub
		certificateRepository.deleteById(CertId);
	}

}
