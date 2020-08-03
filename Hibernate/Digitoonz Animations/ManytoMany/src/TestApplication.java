import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import com.bean.*;
import com.dao.*;
import java.util.*;

public class TestApplication {
	public static void main(String[] args) {
		Configuration config=new Configuration();
		SessionFactory sessionFactory =config.configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        
        CricketDAO dao=new CricketDAO();
        dao.setSession(session);
        Player player=new Player();
        CricketMatch cricketMatch = new CricketMatch();
        dao.allocatePlayertoMatch(cricketMatch.getMatchId(),player.getPlayerId());
	}

}
