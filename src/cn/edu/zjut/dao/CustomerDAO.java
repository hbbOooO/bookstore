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
		 
		Customer customer=new Customer();
		try{
			customer=(Customer)getSession().get(Customer.class,account);
		}
		finally{
			getSession().close();
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
//	    log.debug("saving customer instance"); 
//	    
//	    try { 
//	    Transaction tx=getSession().beginTransaction();
	    getSession().save(instance); 
	    getSession().flush(); 
//		log.debug("save successful"); 
//		tx.commit();
//	    } 
//	    catch (RuntimeException re) { 
//			log.error("save failed", re); 
//			throw re; 
//		} 
//	    finally{ 
//	    	getSession().close(); 
//	    } 
  }

  
  public void update(Customer instance) {
	log.debug("update customer instance"); 
	
	try { 
	Transaction tx=getSession().beginTransaction();
	getSession().update(instance); 
	getSession().flush(); 
	log.debug("update successful"); 
	tx.commit();
	} 
	catch (RuntimeException re) { 
		log.error("update failed", re); 
		throw re; 
	} 
	finally{ 
		getSession().close(); 
	} 
	    
	  //getSession().update(instance); 
  } 
  
  public void delete(Customer instance) {
  	log.debug("delete customer instance"); 
	
	try { 
	Transaction tx=getSession().beginTransaction();
	getSession().delete(instance); 
	getSession().flush(); 
	log.debug("delete successful"); 
	tx.commit();
	} 
	catch (RuntimeException re) { 
		log.error("delete failed", re); 
		throw re; 
	} 
	finally{ 
		getSession().close(); 
	} 
	  //getSession().delete(instance);   
  }
}
  
  
  
  
  
  