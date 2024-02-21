package com.senai.PrjcontroleAlunos;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
	
	private final controlerAlunosRepository ControlerAlunosrepository;
	
	@Autowired
	public ControlerService(controlerAlunosRepository ControlerAlunosrepository) {
		this.ControlerAlunosrepository = controlerAlunosRepository;
		
	}
	public Controler saveControler(Controler controler) {
		return controlerRepository.save(Controler); 

}
