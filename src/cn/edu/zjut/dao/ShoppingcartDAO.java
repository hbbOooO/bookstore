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

	public class ShoppingcartDAO extends BaseHibernateDAO{
		private Log log = LogFactory.getLog(SellerAddressDAO.class);
		public Shoppingcart findById(int customerId){
			log.debug("finding Shoppingcart instance by sgoppingcartid"); 
			
			Shoppingcart customer=new Shoppingcart();
			try{
				customer=(Shoppingcart)getSession().get(Shoppingcart.class,customerId);
			}
			finally{
				getSession().close();
			}
			return customer;
		}
	  //²é
	  public List findByHql(String hql) { 
		log.debug("finding Shoppingcart instance by hql"); 
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
	  public void save(Shoppingcart instance) { 
		    log.debug("saving Shoppingcart instance"); 
		    
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
	  public void update(Shoppingcart instance) {
		  log.debug("update Shoppingcart instance"); 
		    
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
	  public void delete(Shoppingcart instance) {
		  log.debug("delete Shoppingcart instance"); 
		    
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
