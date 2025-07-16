package com.example.helloworld.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.Greeting;
import com.example.helloworld.GreetingRepository;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloController {
	private final GreetingRepository greetingRepository;


	@GetMapping("/")
	public String hello() {
		return "Hello, World!! june";
	}

	@GetMapping("/greeting")
	public String greeting(@RequestParam String lang) {
		Optional<Greeting> byLangCodeIgnoreCase = greetingRepository.findByLangCodeIgnoreCase(lang);
		if (byLangCodeIgnoreCase.isPresent()) {
			Greeting greeting = byLangCodeIgnoreCase.get();
			return greeting.getMessage();
		}
		return "there is no greeting with this language code";
	}
}
