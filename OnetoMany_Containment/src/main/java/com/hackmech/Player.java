package com.hackmech;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="players")
public class Player {

	@Id
	@Column(name="playerid")
	int playerId;
	@Column(name="playername")
	String name;
	@Column(name="jersey")
	private int jurseyNO;
	int totalRuns;
	
	@ManyToOne(targetEntity = Team.class)
	Team currentTeam;
	
	public Player() {
		
	}

	public Player(int playerId, String name, int jurseyNO, int totalRuns, Team currentTeam) {
		super();
		this.playerId = playerId;
		this.name = name;
		this.jurseyNO = jurseyNO;
		this.totalRuns = totalRuns;
		this.currentTeam = currentTeam;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public int getJurseyNO() {
		return jurseyNO;
	}
	public void setJurseyNO(int jurseyNO) {
		this.jurseyNO = jurseyNO;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getTotalRuns() {
		return totalRuns;
	}
	public void setTotalRuns(int totalRuns) {
		this.totalRuns = totalRuns;
	}
	
	
}
