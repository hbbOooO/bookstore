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
			SessionFactory sf=new Configuration().configure().buildSessionFactory(); 
			Session session=sf.openSession(); 
			Shoppingcart customer=new Shoppingcart();
			try{
				customer=(Shoppingcart)session.get(Shoppingcart.class,customerId);
			}
			finally{
				session.close();
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
	  public void update(Shoppingcart instance) {
		  log.debug("update Shoppingcart instance"); 
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
		    finally{ session.close(); }
	  } 
	  //É¾
	  public void delete(Shoppingcart instance) {
		  log.debug("delete Shoppingcart instance"); 
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
		    finally{ session.close(); }
	  }
	}
