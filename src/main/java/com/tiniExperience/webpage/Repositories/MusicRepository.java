package com.tiniExperience.webpage.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tiniExperience.webpage.entities.Music;

@Repository
public interface MusicRepository extends CrudRepository<Music, Long>{
	
}
