package cn.edu.zjut.dao; 
import java.util.List; 
import org.hibernate.Query; 
import org.hibernate.SessionFactory;
import org.hibernate.Session; 
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; 
import org.apache.commons.logging.Log; 
import org.apache.commons.logging.LogFactory; 
import cn.edu.zjut.po.AppealPhoto; 
  public class AppealPhotoDAO extends BaseHibernateDAO{ 
	private Log log = LogFactory.getLog(AppealPhoto.class);
	public AppealPhoto findById(String appealphotoId){
		SessionFactory sf=new Configuration().configure().buildSessionFactory(); 
		Session session=sf.openSession(); 
		AppealPhoto appealphoto=new AppealPhoto();
		try{
			appealphoto=(AppealPhoto)session.get(AppealPhoto.class,appealphotoId);
		}
		finally{
			session.close();
		}
		return appealphoto;
	}
  //²é
  public List findByHql(String hql) { 
	log.debug("finding AppealPhoto instance by hql"); 
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
  public void save(AppealPhoto instance) { 
	    log.debug("saving appealphoto instance"); 
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
  public void update(AppealPhoto instance) {
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
  //É¾
  public void delete(AppealPhoto instance) {
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
