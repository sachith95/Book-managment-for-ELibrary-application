package controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;

import model.Book;
import model.User;

public class UserManager {

	
@SuppressWarnings("unchecked")
public String login(String name,String pw)
	{
	String rt="ERROR";
	 SessionFactory sessionFactory = new  AnnotationConfiguration().configure().buildSessionFactory();
      Session session = sessionFactory.getCurrentSession();
      session.beginTransaction();
      List<User> user=null;
      Query qry= session.createQuery("FROM User u WHERE u.username=:UName AND u.password=:Pw");
  	 qry.setParameter("UName",name);
  	 qry.setParameter("Pw",pw);
	 user=qry.list();
     session.getTransaction().commit();
     if(1>=user.size())
     {
    	 rt="success";
    	 
     }
	return rt;
}

public void register(User u)
{
	SessionFactory sessionFactory = new
	AnnotationConfiguration().configure().buildSessionFactory();
      Session session = sessionFactory.getCurrentSession();
      Transaction tx = session.beginTransaction();
      session.save(u);
      tx.commit();
}


}
