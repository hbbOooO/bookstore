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
		SessionFactory sf=new Configuration().configure().buildSessionFactory(); 
		Session session=sf.openSession(); 
		CustomerAddress customeraddress=new CustomerAddress();
		try{
			customeraddress=(CustomerAddress)session.get(CustomerAddress.class,customeraddressId);
		}
		finally{
			session.close();
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

  //��
  public void update(CustomerAddress instance) {
	    log.debug("updating customer instance"); 
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
  //ɾ
  public void delete(CustomerAddress instance) {
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
