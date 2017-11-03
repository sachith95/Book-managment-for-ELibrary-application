package controller;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;
import net.sf.hibernate.HibernateException;
import model.Book;

public class BookManager {
	
 
	public void add(Book b)
	{
		SessionFactory sessionFactory = new
		AnnotationConfiguration().configure().buildSessionFactory();
	      Session session = sessionFactory.getCurrentSession();
	      Transaction tx = session.beginTransaction();
	      session.save(b);
	      tx.commit();
	}
	
	@SuppressWarnings("unchecked")
	public List<Book> list() throws HibernateException {
		
		SessionFactory sessionFactory = new
	    AnnotationConfiguration().configure().buildSessionFactory();
		Session session = sessionFactory.getCurrentSession();
		
	    session.beginTransaction();
		List<Book> books = null;
		books = (List<Book>)session.createQuery("FROM Book").list();
		
		// String hql="FROM books";
		// org.hibernate.Query query=session.createQuery(hql);
		// book=query.list();

		 session.getTransaction().commit(); 
		return books;
	}
	public int delete(String name) {
		    SessionFactory sessionFactory = new  AnnotationConfiguration().configure().buildSessionFactory();
	      Session session = sessionFactory.getCurrentSession();
	      session.beginTransaction();

	      Query qry = session.createQuery("DELETE FROM Book WHERE Name=:Name");
	  	 qry.setParameter("Name",name);
		
	      int x=qry.executeUpdate();
	   
	    session.getTransaction().commit();
		return x;
	}
	public void update(String name,String category)
	{  
		SessionFactory sessionFactory = new
		AnnotationConfiguration().configure().buildSessionFactory();
	      Session session = sessionFactory.getCurrentSession();
	      Transaction tx = session.beginTransaction();
	      Query qry=session.createQuery("UPDATE Book set Category=:cat WHERE Name=:name");
	    	qry.setParameter("cat",category);
	    	qry.setParameter("name",name);
	    			
	    	qry.executeUpdate();
	}
	@SuppressWarnings("unchecked")
	public List<Book> search(String name)
	
	{
	 SessionFactory sessionFactory = new  AnnotationConfiguration().configure().buildSessionFactory();
      Session session = sessionFactory.getCurrentSession();
      session.beginTransaction();
      List<Book> book=null;
      Query qry= session.createQuery("FROM Book b WHERE b.Name=:Name");
  	 qry.setParameter("Name",name);
	 book=qry.list();
      
   
    session.getTransaction().commit();
	return book;
}

}
