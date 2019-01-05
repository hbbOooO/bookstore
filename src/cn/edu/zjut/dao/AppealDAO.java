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
		SessionFactory sf=new Configuration().configure().buildSessionFactory(); 
		Session session=sf.openSession(); 
		Appeal appeal=new Appeal();
		try{
			appeal=(Appeal)session.get(Appeal.class,appealId);
		}
		finally{
			session.close();
		}
		return appeal;
	}
  //²é
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
  //Ôö
  public void save(Appeal instance) { 
	    log.debug("saving appeal instance"); 
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
  public void update(Appeal instance) {
	    log.debug("updating appeal instance"); 
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
	    finally{ session.close(); } }
  //É¾
  public void delete(Appeal instance) {
	    log.debug("deleting customer instance"); 
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
	    finally{ session.close(); } }
}