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
	public class SellerAddressDAO extends BaseHibernateDAO{
		private Log log = LogFactory.getLog(SellerAddressDAO.class);
		public SellerAddress findById(int customerId){
			log.debug("finding SellerAddress instance by addressid"); 
			
			SellerAddress customer=new SellerAddress();
			try{
				customer=(SellerAddress)getSession().get(SellerAddress.class,customerId);
			}
			finally{
				getSession().close();
			}
			return customer;
		}
	  //��
	  public List findByHql(String hql) { 
		log.debug("finding SellerAddress instance by hql"); 
		try {
			String queryString = hql; 
			Query queryObject = getSession().createQuery(queryString); 
			return queryObject.list(); 
			} catch (RuntimeException re) { 
				log.error("find by hql failed", re); 
				throw re; 
				}
	    } 
	  //��
	  public void save(SellerAddress instance) { 
		    log.debug("saving SellerAddress instance"); 
		    
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

	  //��
	  public void update(SellerAddress instance) {
		  log.debug("update SellerAddress instance"); 
		    
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
	  //ɾ
	  public void delete(SellerAddress instance) {
		  log.debug("delete SellerAddress instance"); 
		    
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
