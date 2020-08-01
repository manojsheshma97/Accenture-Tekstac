import com.bean.*;
import com.dao.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestApplication {

	public static void main(String[] args) {
		Configuration config=new Configuration();
		SessionFactory sessionFactory = config.configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		CustomerDAO dao=new CustomerDAO();
		Customer c=new Customer();
		BonusCard b=new BonusCard();
		dao.setSession(session);
		c.setCustName("Megha");
		c.setCustAddress("Mumbai");
		b.setCardNo(123);
		b.setCardType("Savings");
		b.setPoints(120);
		c.setCard(b);
        dao.addCustomer(c);

	}

}
