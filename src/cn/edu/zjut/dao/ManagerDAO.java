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

public class ManagerDAO extends BaseHibernateDAO{
	private Log log = LogFactory.getLog(ManagerDAO.class);
	
	public Manager findById(String managerid){
		SessionFactory sf=new Configuration().configure().buildSessionFactory(); 
		Session session=sf.openSession(); 
		Manager manager=new Manager();
		try{
			manager=(Manager)session.get(Manager.class,managerid);
		}
		finally{
			session.close();
		}
		return manager;
	}
  
  public List findByHql(String hql) { 
	log.debug("finding manager List by hql"); 
	try {
		String queryString = hql; 
		Query queryObject = getSession().createQuery(queryString); 
		return queryObject.list(); 
		} catch (RuntimeException re) { 
			log.error("find by hql failed", re); 
			throw re; 
		}
    } 
  
  public void save(Manager instance) { 
	    log.debug("saving manager instance"); 
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
			throw re; 
		} 
	    finally{ 
	    	session.close(); 
	    } 
  }

  
  public void update(Manager instance) {
	log.debug("update manager instance"); 
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
		throw re; 
	} 
	finally{ 
		session.close(); 
	} 
	    
	  
  } 
  
  public void delete(Manager instance) {
  	log.debug("delete manager instance"); 
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
		throw re; 
	} 
	finally{ 
		session.close(); 
	} 
	    
  }

}
