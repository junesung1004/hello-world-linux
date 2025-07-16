package com.example.helloworld;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "greetings")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Greeting {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "lang_code", unique = true, nullable = false)
	private String langCode;

	@Column(nullable = false)
	private String message;



}
