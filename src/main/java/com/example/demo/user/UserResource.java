package com.example.demo.user;

import java.net.URI;
import java.util.Date;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fasterxml.jackson.annotation.JsonView;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService service;

	@JsonView(View.Public.class)
	@GetMapping("/users")
	public List<User> index() {
		return service.allUsers();
	}

	@JsonView(View.Public.class)
	@GetMapping("/users/{id}")
	public ResponseEntity<?> getUser(@PathVariable int id) {
		User user = service.getUser(id);
		if (user != null) {
			return ResponseEntity.ok(user);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User is not found");

		}
	}

	@PostMapping("/users")
	public ResponseEntity<Object> addUser(@RequestBody User u) {
		User newUser = service.addUser(u);
		if (newUser != null) {
			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
					.buildAndExpand(newUser.getId()).toUri();
			ResponseEntity.status(400).body("User added successfully");
			return ResponseEntity.created(location).build();
		} else {
			return ResponseEntity.status(400).body("form not valid");
		}
	}
}
