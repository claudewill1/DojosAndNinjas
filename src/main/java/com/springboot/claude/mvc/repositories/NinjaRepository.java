package com.springboot.claude.mvc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.claude.mvc.models.Ninja;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {
	// retrieve all Ninjas
	public List<Ninja> findAll();
	
	@Query(value="SELECT n.* FROM ninjas AS n LEFT JOIN dojos AS d ON n.id = d.ninja_id WHERE d.id = id",nativeQuery=true)
	public List<Ninja> findByDojoId();
}
