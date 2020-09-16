package com.devsuperior.dspesquisa.dto;

import java.io.Serializable;

import com.devsuperior.dspesquisa.entities.Game;
import com.devsuperior.dspesquisa.entities.enums.Platform;

public class GameDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String Title;
	private Platform platform;
	
	public GameDTO () {
		
	}
	
	public GameDTO (Game entity) {
		
		id = entity.getId();
		Title = entity.getTitle();
		platform = entity.getPlatform();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public Platform getPlatform() {
		return platform;
	}

	public void setPlatform(Platform platform) {
		this.platform = platform;
	}
	
	

}
