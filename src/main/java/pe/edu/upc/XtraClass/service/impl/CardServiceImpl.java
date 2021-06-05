package pe.edu.upc.XtraClass.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.XtraClass.model.entity.Card;
import pe.edu.upc.XtraClass.model.repository.CardRepository;
import pe.edu.upc.XtraClass.service.CardService;

@Service
public class CardServiceImpl implements CardService{
	@Autowired
	private CardRepository cardRepository;
	
	@Override
	public JpaRepository<Card, Integer> getRepository() {
		return cardRepository;
	}
}
