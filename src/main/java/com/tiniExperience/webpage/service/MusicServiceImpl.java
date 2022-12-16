package com.tiniExperience.webpage.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiniExperience.webpage.Repositories.MusicRepository;
import com.tiniExperience.webpage.entities.Music;

@Service
public class MusicServiceImpl implements MusicService {
	
	@Autowired
	private MusicRepository musicRepository;

	@Override
	public Music saveMusic(Music music) {
		return musicRepository.save(music);
	}

	@Override
	public List<Music> fetchMusicList() {
		return (List<Music>) musicRepository.findAll();
	}

	@Override
	public Music updateMusic(Music music, Long id) {
		Music musicDB = musicRepository.findById(id).get();
		
		if(Objects.nonNull(music.getName()) && !"".equalsIgnoreCase(music.getName())) {
			musicDB.setName(music.getName());
		}
		
		if(Objects.nonNull(music.getDuration())) {
			musicDB.setDuration(music.getDuration());
		}
		
		if(Objects.nonNull(music.getGenre()) && !"".equalsIgnoreCase(music.getGenre())) {
			musicDB.setGenre(music.getGenre());
		}
		
		return musicRepository.save(musicDB);
	}

	@Override
	public void deleteMusicById(Long id) {
		musicRepository.deleteById(id);
	}
	
}
