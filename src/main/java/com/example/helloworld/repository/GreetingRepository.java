package com.example.helloworld.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.helloworld.domain.Greeting;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {

	Optional<Greeting> findByLangCodeIgnoreCase(String langCode);
}
