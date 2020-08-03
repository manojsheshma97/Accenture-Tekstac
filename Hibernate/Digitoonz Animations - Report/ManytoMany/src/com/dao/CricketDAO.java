package com.dao;
import org.hibernate.Session;
import org.hibernate.*;
import com.bean.*;
import java.util.*;

import com.bean.CricketMatch;
public class CricketDAO {
	
	private Session session;

	public Session getSession() {
		return session;
	}

	public void setSession(Session session) {
		this.session = session;
	}
	
	public CricketMatch viewMatchwithPlayerDetails(int matchId)
	{
	    String hql="from CricketMatch where matchId = :matchId";
	    Query q=session.createQuery(hql);
	    q.setParameter("matchId",matchId);
	    List<CricketMatch> list=q.list();
    	return list.get(0);
	}

}
