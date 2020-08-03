import com.bean.*;
import com.dao.*;
import java.util.*;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class TestApplication {
	public static void main(String[] args) {
		Configuration config=new Configuration();
		SessionFactory sf=config.configure("hibernate.cfg.xml").buildSessionFactory();
		Session s=sf.openSession();
		CricketDAO dao=new CricketDAO();
		dao.setSession(s);
		CricketMatch cm=new CricketMatch();
		cm=dao.viewMatchwithPlayerDetails(101);

	}

}
