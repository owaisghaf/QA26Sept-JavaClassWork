package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.FilmNotFoundException;
import com.example.model.Film;
import com.example.service.FilmService;

@RestController
public class FilmController {
	@Autowired
	FilmService service;
	
	@PostMapping("/create")
	public ResponseEntity<Film> create(@RequestBody Film film) {
		return new ResponseEntity<>(this.service.create(film),HttpStatus.CREATED);
	}

	@GetMapping("/readAll")
	public ResponseEntity<List<Film>> read() {
		return ResponseEntity.ok(this.service.readAll());

	}
	
	@GetMapping("/readOne/{id}")
	public ResponseEntity<Optional<Film>> readId(@PathVariable Integer id) {
		return ResponseEntity.ok(this.service.readOne(id));

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Film> update(@RequestBody Film film, @PathVariable Integer id) {
		return new ResponseEntity<>(this.service.update(film,id), HttpStatus.ACCEPTED);
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		this.service.delete(id);

	}
	
	// allows you to get list of info for films with a given title using postman
	@GetMapping("/readByTitle/{title}")
	public ResponseEntity<List<Film>> readByTitle(@PathVariable String title) {
		return ResponseEntity.ok(this.service.readByTitle(title));

	}
	
	// allows you to get list of info for films with a given genre and release year using postman
	@GetMapping("/readByYear/{genre}/{year}")
	public ResponseEntity<List<Film>> readByYear(@PathVariable String genre, @PathVariable int year) {
		return ResponseEntity.ok(this.service.readByYear(genre,year));

	}
	
	// allows you to get list of info for films with a given platform using postman
	@GetMapping("/readByPlatform/{platform}")
	public ResponseEntity<List<Film>> readByPlatform(@PathVariable String platform) {
		return ResponseEntity.ok(this.service.readByPlatform(platform));

	}
}
