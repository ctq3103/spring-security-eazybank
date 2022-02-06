package com.quynhchu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
	
	@GetMapping("/cards")
	public String getCards(String input) {
		return "Cards";
	}
}
