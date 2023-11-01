package com.example.demo.stores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StoreDaoService {
	@Autowired
	private StoreRepository repo;
	
	public List<Store> getAllStores() {
		return repo.findAll();
	}
}
