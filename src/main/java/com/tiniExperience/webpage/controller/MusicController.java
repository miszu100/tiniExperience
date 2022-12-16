package com.tiniExperience.webpage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tiniExperience.webpage.entities.Music;
import com.tiniExperience.webpage.service.MusicService;

import jakarta.validation.Valid;

@RestController
public class MusicController {
	
	@Autowired
	private MusicService musicService;
	
	// Save operation
	@PostMapping("/musik")
	public Music saveMusic(@Valid @RequestBody Music music) {
		return musicService.saveMusic(music);
	}
	
	// Read operation
	@GetMapping("/musik")
	public List<Music> fetchMusicList() {
		return musicService.fetchMusicList();
	}
	
	// Update operation
	@PutMapping("/musik/{id}")
	public Music updateMusic(@RequestBody Music music, @PathVariable("id") Long id) {
		return musicService.updateMusic(music, id);
	}
	
	// Delete operation
	@DeleteMapping("/musik/{id}")
	public String deleteMusicById(@PathVariable("id") Long id) {
		musicService.deleteMusicById(id);
		return "Deleted Succesfully";
	}

}
