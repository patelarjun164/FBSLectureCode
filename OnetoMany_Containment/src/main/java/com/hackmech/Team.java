package com.hackmech;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="team")
public class Team {

	 @Id
	 @Column(name="teamid")
	 int teamId;
	 
	 @Column(name="teamname")
	 String teamName;
	 
	 @OneToMany(targetEntity = Player.class, cascade = CascadeType.ALL)
	 Set<Player> players;
	 
	 public Team() {
		 
	 }

	 public Team(int teamId, String teamName, Set<Player> players) {
		super();
		this.teamId = teamId;
		this.teamName = teamName;
		this.players = players;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	
}