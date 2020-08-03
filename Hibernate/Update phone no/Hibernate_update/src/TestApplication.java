import com.bean.*;
import com.dao.*;
import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import java.util.*;
import java.io.*;

public class TestApplication {
    public static void main(String args[]) throws IOException{
        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
        Configuration config=new Configuration();
        SessionFactory sessionFactory=config.configure("hibernate.cfg.xml").buildSessionFactory();
        CustomerDAO cdao=new CustomerDAO();
        Session session=sessionFactory.openSession();
        cdao.setSession(session);
        cdao.updateCustomer(101,Long.parseLong(sc.readLine()));
        cdao.updateCustomer(102,Long.parseLong(sc.readLine()));
        cdao.updateCustomer(103,Long.parseLong(sc.readLine()));
    }

}
