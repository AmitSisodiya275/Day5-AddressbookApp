package com.bridgelab.addressbook.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressbook")
public class Controller {

	@GetMapping("/get")
	public ResponseEntity<String> getAllUser() {
		return new ResponseEntity<String>("Get call for all user successful.", HttpStatus.NO_CONTENT);
	}

	@GetMapping("/get/{eId}")
	public ResponseEntity<String> geUserById(@PathVariable("eId") int eId) {
		return new ResponseEntity<String>("Get call for specific id is successful id : " + eId, HttpStatus.OK);
	}

	@PostMapping("/add")
	public ResponseEntity<String> addUser() {
		return new ResponseEntity<String>("Post call successful ", HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<String> updateUser(@PathVariable("id") int id) {
		return new ResponseEntity<String>("data updated for id : " + id, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") int id) {
		return new ResponseEntity<String>("Data deleted for id : " + id, HttpStatus.OK);
	}
}
