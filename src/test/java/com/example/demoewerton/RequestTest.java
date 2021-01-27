package com.example.demoewerton;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demoewerton.models.AndamentoPesquisa;

@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class RequestTest {
	
	@Autowired
	private TestRestTemplate testTempate;

	@Test
	public void deveTestarController() {
		ResponseEntity<AndamentoPesquisa> testeEntity = testTempate.getForEntity("/v1", AndamentoPesquisa.class);
		HttpStatus statusCode = testeEntity.getStatusCode();
		AndamentoPesquisa body = testeEntity.getBody();
		System.out.println(statusCode);
	}
}