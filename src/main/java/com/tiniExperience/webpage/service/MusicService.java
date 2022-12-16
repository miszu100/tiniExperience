package com.tiniExperience.webpage.service;

import java.util.List;

import com.tiniExperience.webpage.entities.Music;

public interface MusicService {
	
	// Save operation
	Music saveMusic(Music music);
	
	// Read operation
	List<Music> fetchMusicList();
	
	// Update operation
	Music updateMusic(Music music, Long id);
	
	// Delete operation
	void deleteMusicById(Long id);
}
