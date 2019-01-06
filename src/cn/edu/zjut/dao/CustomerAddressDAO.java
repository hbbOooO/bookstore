package cn.edu.zjut.dao; 
import java.util.List; 
import org.hibernate.Query; 
import org.hibernate.SessionFactory;
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; 
import org.apache.commons.logging.Log; 
import org.apache.commons.logging.LogFactory; 

import cn.edu.zjut.po.Appeal;
import cn.edu.zjut.po.AppealPhoto; 
import cn.edu.zjut.po.CustomerAddress;
  public class CustomerAddressDAO extends BaseHibernateDAO{ 
	private Log log = LogFactory.getLog(CustomerAddress.class);
	public CustomerAddress findById(String customeraddressId){
		
		CustomerAddress customeraddress=new CustomerAddress();
		try{
			customeraddress=(CustomerAddress)getSession().get(CustomerAddress.class,customeraddressId);
		}
		finally{
			getSession().close();
		}
		return customeraddress;
	}
  //��
  public List findByHql(String hql) { 
	log.debug("finding CustomerAddress instance by hql"); 
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
  public void save(CustomerAddress instance) { 
	    log.debug("saving customeraddress instance"); 
	    
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
  public void update(CustomerAddress instance) {
	    log.debug("updating customer instance"); 
	    
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
	    finally{ getSession().close(); } }
  //ɾ
  public void delete(CustomerAddress instance) {
	    log.debug("deleting customer instance"); 
	    
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
	    finally{ getSession().close(); } }
}
