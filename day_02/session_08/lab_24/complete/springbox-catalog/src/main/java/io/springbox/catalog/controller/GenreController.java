package io.springbox.catalog.controller;

import io.springbox.catalog.domain.Genre;
import io.springbox.catalog.repository.GenreRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GenreController {
	
	@Autowired
	private GenreRepository genreRepository;
	
	@RequestMapping(value="/genres", method=RequestMethod.GET)
	public Iterable<Genre> findAll() {
		return genreRepository.findAll();
	}

	@RequestMapping(value="/genres/{mlId}", method=RequestMethod.GET)
	public Genre findByMlId(@PathVariable String mlId) {
		return genreRepository.findByMlId(mlId);
	}

}
