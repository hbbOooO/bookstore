package cn.edu.zjut.dao; 
import java.util.List; 
import org.hibernate.Query; 
import org.hibernate.SessionFactory;
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; 
import org.apache.commons.logging.Log; 
import org.apache.commons.logging.LogFactory; 
import cn.edu.zjut.po.Customer; 

  public class CustomerDAO extends BaseHibernateDAO{ 
	private Log log = LogFactory.getLog(CustomerDAO.class);
	
	public Customer findById(String account){
		SessionFactory sf=new Configuration().configure().buildSessionFactory(); 
		Session session=sf.openSession(); 
		Customer customer=new Customer();
		try{
			customer=(Customer)session.get(Customer.class,account);
		}
		finally{
			session.close();
		}
		return customer;
	}
  
  public List findByHql(String hql) { 
	log.debug("finding Customer List by hql"); 
	try {
		String queryString = hql; 
		Query queryObject = getSession().createQuery(queryString); 
		return queryObject.list(); 
		} catch (RuntimeException re) { 
			log.error("find by hql failed", re); 
			throw re; 
		}
    } 
  
  public void save(Customer instance) { 
	    log.debug("saving customer instance"); 
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

  
  public void update(Customer instance) {
	log.debug("update customer instance"); 
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
	    
	  //getSession().update(instance); 
  } 
  
  public void delete(Customer instance) {
  	log.debug("delete customer instance"); 
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
	  //getSession().delete(instance);   
  }
}
  
  
  
  
  
  