import com.bean.*;
import com.dao.*;
import java.util.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TestApplication {
    public static void main(String[] args){
        Configuration config = new Configuration();
        SessionFactory sessionFactory = config.configure("hibernate.cfg.xml").buildSessionFactory();
        Session session=sessionFactory.openSession();
        CountryDAO dao=new CountryDAO();
        dao.setSession(session);
        
        Country nihon=new Country();
        State kumamoto=new State();
        List<State> liso=new ArrayList<State>();
        liso.add(kumamoto);
        
        nihon.setCountryName("Japan");
        nihon.setCurrency("Yen");
        nihon.setCapital("Tokyo");
        nihon.setStatelist(liso);
        
        kumamoto.setStateName("kumamoto");
        kumamoto.setLanguage("Japanese");
        kumamoto.setPopulation(5000);
        kumamoto.setCountry(nihon);
        
        dao.addCountry(nihon);
        State hokkaido=new State();
        hokkaido.setStateName("Hokkaido");
        hokkaido.setLanguage("Japanese");
        hokkaido.setPopulation(4500);
        hokkaido.setCountry(nihon);
        
        dao.addStatetoCountry("Japan", hokkaido);
        List<State> max=dao.stateWithMaxPopulation("India");
        dao.removeCountry("Japan");
    }

}
