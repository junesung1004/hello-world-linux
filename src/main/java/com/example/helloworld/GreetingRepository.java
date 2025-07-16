package com.example.helloworld;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetingRepository extends JpaRepository<Greeting, Long> {

	Optional<Greeting> findByLangCodeIgnoreCase(String langCode);
}
