package cn.edu.zjut.dao;
import java.util.List; 
import org.hibernate.Query; 
import org.hibernate.SessionFactory;
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; 
import org.apache.commons.logging.Log; 
import org.apache.commons.logging.LogFactory; 

import cn.edu.zjut.po.*;
public class SellerDAO extends BaseHibernateDAO{
	private Log log = LogFactory.getLog(SellerDAO.class);
	public Seller findById(String customerId){
		log.debug("finding seller instance by account"); 
		SessionFactory sf=new Configuration().configure().buildSessionFactory(); 
		Session session=sf.openSession(); 
		Seller customer=new Seller();
		try{
			customer=(Seller)session.get(Seller.class,customerId);
		}
		finally{
			session.close();
		}
		return customer;
	}
  //²é
  public List findByHql(String hql) { 
	log.debug("finding seller instance by hql"); 
	try {
		String queryString = hql; 
		Query queryObject = getSession().createQuery(queryString); 
		return queryObject.list(); 
		} catch (RuntimeException re) { 
			log.error("find by hql failed", re); 
			throw re; 
			}
    } 
  //Ôö
  public void save(Seller instance) { 
	    log.debug("saving seller instance"); 
	    SessionFactory sf= new Configuration().configure().buildSessionFactory(); 
	    Session session=sf.openSession(); 
	    try { 
	    Transaction tx=session.beginTransaction();
		session.save(instance); 
		session.flush(); 
		log.debug("save successful"); 
		tx.commit();
	    	} 
	    catch (RuntimeException re) { 
		log.error("save failed", re); 
		throw re; } 
	    finally{ session.close(); } }

  //¸Ä
  public void update(Seller instance) { 
		    log.debug("update seller instance"); 
		    SessionFactory sf= new Configuration().configure().buildSessionFactory(); 
		    Session session=sf.openSession(); 
		    try { 
		    Transaction tx=session.beginTransaction();
			session.update(instance); 
			session.flush(); 
			log.debug("update successful"); 
			tx.commit();
		    	} 
		    catch (RuntimeException re) { 
			log.error("update failed", re); 
			throw re; } 
		    finally{ session.close(); }
  } 
  //É¾
  public void delete(Seller instance) {
	  log.debug("delete seller instance"); 
	    SessionFactory sf= new Configuration().configure().buildSessionFactory(); 
	    Session session=sf.openSession(); 
	    try { 
	    Transaction tx=session.beginTransaction();
		session.delete(instance); 
		session.flush(); 
		log.debug("delete successful"); 
		tx.commit();
	    	} 
	    catch (RuntimeException re) { 
		log.error("delete failed", re); 
		throw re; } 
	    finally{ session.close(); } 
  }
}
