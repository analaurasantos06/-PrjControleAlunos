package com.senai.PrjcontroleAlunos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name = "tb_produto")
public class entities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nome")
	private String name;
	
	@Column(name = "CPF")
	private double price;
	
	@Column(name = "RG")
	private double string;
	
	@Column(name = "endereço")
	private double string;

	{
	
	
	
	
	
}

public Long getId() {
	return id; 
}

public String getName() {
	return name;
}
public double  getCPF() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
	
	{
}

