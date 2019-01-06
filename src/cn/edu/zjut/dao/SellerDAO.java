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
		
		Seller customer=new Seller();
		try{
			customer=(Seller)getSession().get(Seller.class,customerId);
		}
		finally{
			getSession().close();
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
	    
	    try { 
	    Transaction tx=getSession().beginTransaction();
	    getSession().save(instance); 
	    getSession().flush(); 
		log.debug("save successful"); 
		tx.commit();
	    	} 
	    catch (RuntimeException re) { 
		log.error("save failed", re); 
		throw re; } 
	    finally{ getSession().close(); } }

  //¸Ä
  public void update(Seller instance) { 
		    log.debug("update seller instance"); 
		    
		    try { 
		    Transaction tx=getSession().beginTransaction();
		    getSession().update(instance); 
		    getSession().flush(); 
			log.debug("update successful"); 
			tx.commit();
		    	} 
		    catch (RuntimeException re) { 
			log.error("update failed", re); 
			throw re; } 
		    finally{ getSession().close(); }
  } 
  //É¾
  public void delete(Seller instance) {
	  log.debug("delete seller instance"); 
	    
	    try { 
	    Transaction tx=getSession().beginTransaction();
	    getSession().delete(instance); 
	    getSession().flush(); 
		log.debug("delete successful"); 
		tx.commit();
	    	} 
	    catch (RuntimeException re) { 
		log.error("delete failed", re); 
		throw re; } 
	    finally{ getSession().close(); } 
  }
}
