package com.example.demoewerton.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demoewerton.models.AndamentoPesquisa;
import com.example.demoewerton.services.RequestFeign;

@RestController
@RequestMapping(value = "/v1")

public class Request {

	@Autowired
	private RequestFeign requestFeign;

	private String codigoPesquisa = "92355";
	private String cnpj = "61139432000172";

	@GetMapping
	public ResponseEntity<AndamentoPesquisa> teste() {
		ResponseEntity<AndamentoPesquisa> pegaRequest = requestFeign.pegaRequest(codigoPesquisa, cnpj);
		System.out.println(pegaRequest);
		return pegaRequest;
	}


}
