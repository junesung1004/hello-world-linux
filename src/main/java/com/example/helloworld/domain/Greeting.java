package com.example.helloworld.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "greetings")
// @AllArgsConstructor
// @NoArgsConstructor
// @Getter
// @Setter
public class Greeting {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "lang_code", unique = true, nullable = false)
	private String langCode;

	@Column(nullable = false)
	private String message;

	public Greeting(Long id, String langCode, String message) {
		this.id = id;
		this.langCode = langCode;
		this.message = message;
	}

	public Greeting() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLangCode() {
		return langCode;
	}

	public void setLangCode(String langCode) {
		this.langCode = langCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
