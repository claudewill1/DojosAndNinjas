package com.springboot.claude.mvc.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.claude.mvc.models.Dojo;

@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long> {
	// retrieve all dojos
		public List<Dojo> findAll();
}
