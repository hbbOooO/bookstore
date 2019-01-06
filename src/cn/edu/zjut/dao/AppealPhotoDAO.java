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
		
		AppealPhoto appealphoto=new AppealPhoto();
		try{
			appealphoto=(AppealPhoto)getSession().get(AppealPhoto.class,appealphotoId);
		}
		finally{
			getSession().close();
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
  public void update(AppealPhoto instance) {
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
  //É¾
  public void delete(AppealPhoto instance) {
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
