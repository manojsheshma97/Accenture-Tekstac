package com.bean;
import static javax.persistence.GenerationType.IDENTITY;
import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.*;

@Entity 

public class CricketMatch {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private int matchId;
	private String matchName;
	private Date matchDate;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="CricketMatch_Player",joinColumns={@JoinColumn(name="cricketmatch_matchid")},inverseJoinColumns={@JoinColumn(name="players_playerid")})
	
	private Set<Player> players=new HashSet<Player>();
	public Set<Player> getPlayers(){
	    return players;
	}
	public void setPlayers(Set<Player> players){
	    this.players=players;
	}
	public int getMatchId() {
		return matchId;
	}
	public void setMatchId(int matchId) {
		this.matchId = matchId;
	}
	public String getMatchName() {
		return matchName;
	}
	public void setMatchName(String matchName) {
		this.matchName = matchName;
	}
	public Date getMatchDate() {
		return matchDate;
	}
	public void setMatchDate(Date matchDate) {
		this.matchDate = matchDate;
	}
	

}
