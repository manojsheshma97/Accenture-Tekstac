package com.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.bean.*;
import java.util.*;

public class CricketDAO {
	
	private Session session;

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	
	public void allocatePlayertoMatch(int matchId,int playerId)
	{
		Transaction transaction=session.beginTransaction();
		Player player=(Player)session.get(Player.class,playerId);
		CricketMatch cricketMatch = (CricketMatch)session.get(CricketMatch.class,matchId);
		
		Set<Player> list=cricketMatch.getPlayers();
		list.add(player);
		cricketMatch.setPlayers(list);
		session.save(cricketMatch);
		transaction.commit();
	}

}
