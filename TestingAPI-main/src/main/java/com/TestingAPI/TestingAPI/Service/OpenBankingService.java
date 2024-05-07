package com.TestingAPI.TestingAPI.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TestingAPI.TestingAPI.Entities.Openbanking;
import com.TestingAPI.TestingAPI.Repository.OpenbankingRepository;

@Service
public class OpenBankingService {

	@Autowired
	OpenbankingRepository openbankingrepository;
	
	public Openbanking addOpenBanking(Openbanking openbankingbody) {
		return openbankingrepository.save(openbankingbody);
	}
}
