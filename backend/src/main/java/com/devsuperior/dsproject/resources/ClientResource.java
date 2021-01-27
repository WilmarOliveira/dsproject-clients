package com.devsuperior.dsproject.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsproject.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {

	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		
		List<Client> list = new ArrayList<>();
		list.add(new Client(1L, "teste1", "10000000000", 1250.00, 2));
		list.add(new Client(2L, "teste2", "20000000000", 2250.00, 3));
		list.add(new Client(3L, "teste3", "30000000000", 3250.00, 4));
		
		return ResponseEntity.ok().body(list);
		
	}
}
