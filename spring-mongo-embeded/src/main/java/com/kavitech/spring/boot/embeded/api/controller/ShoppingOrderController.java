package com.kavitech.spring.boot.embeded.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kavitech.spring.boot.embeded.api.model.User;
import com.kavitech.spring.boot.embeded.api.repository.ShoppingCartRepository;

@RestController
@RequestMapping("/orderservice")
public class ShoppingOrderController {

	@Autowired
	private ShoppingCartRepository repository;

	@PostMapping("/placeOrder")
	public String placeOrdering(@RequestBody User user) {
		repository.save(user);
		return "Order Created successfully";
	}
	
	@GetMapping("/getUserByName/{name}")
	public List<User> getUserbyName(@PathVariable String name){
		return repository.findByName(name);
	}
	
	@GetMapping("/getUserByAddress/{city}")
	public List<User> getUserByAddress(@PathVariable String city){
		return repository.findByCity(city);
	}

}
