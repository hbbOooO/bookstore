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
  public class AppealDAO extends BaseHibernateDAO{ 
	private Log log = LogFactory.getLog(Appeal.class);
	public Appeal findById(String appealId){
		
		Appeal appeal=new Appeal();
		try{
			appeal=(Appeal)getSession().get(Appeal.class,appealId);
		}
		finally{
			getSession().close();
		}
		return appeal;
	}
  //��
  public List findByHql(String hql) { 
	log.debug("finding Appeal instance by hql"); 
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
  public void save(Appeal instance) { 
	    log.debug("saving appeal instance"); 
	    
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
  public void update(Appeal instance) {
	    log.debug("updating appeal instance"); 
	    
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
  public void delete(Appeal instance) {
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