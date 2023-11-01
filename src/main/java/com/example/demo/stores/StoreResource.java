package com.example.demo.stores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoreResource {
	
	@Autowired
	private StoreDaoService service;

	@GetMapping("/stores")
	public List<Store> index() {
		return service.getAllStores();
	}
}
