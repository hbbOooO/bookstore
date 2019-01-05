package cn.edu.zjut.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Transaction;

import cn.edu.zjut.po.Goods;
import cn.edu.zjut.po.GoodsPhoto;

public class GoodsPhotoDAO extends BaseHibernateDAO{
	private Log log = LogFactory.getLog(GoodsPhoto.class);
	//ͨ���������ң�
	public GoodsPhoto findById(int goodsPhotoId){
		
		GoodsPhoto goodsphoto=new GoodsPhoto();
		try{
			goodsphoto=(GoodsPhoto)getSession().get(GoodsPhoto.class,goodsPhotoId);
		}
		finally{
			getSession().close();
		}
		return goodsphoto;
	}
  //��
	//�Զ������
  public List findByHql(String hql) { 
	log.debug("finding Goods instance by hql"); 
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
  public void save(GoodsPhoto instance) { 
	    log.debug("saving goodsphoto instance");  
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
  public void update(GoodsPhoto instance) {
	    log.debug("updating goodsphoto instance"); 
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
  public void delete(GoodsPhoto instance) {
	    log.debug("deleting goodsphoto instance"); 
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
