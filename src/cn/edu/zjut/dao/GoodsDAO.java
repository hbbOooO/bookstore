package cn.edu.zjut.dao;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import cn.edu.zjut.po.Goods;

public class GoodsDAO extends BaseHibernateDAO{
	private Log log = LogFactory.getLog(Goods.class);
	//ͨ���������ң�
	//�Ѽ���
	public Goods findById(int goodsId){
		
		Goods goods=new Goods();
		try{
			goods=(Goods)getSession().get(Goods.class,goodsId);
		}
		finally{
			getSession().close();
		}
		return goods;
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
  public void save(Goods instance) { 
	    log.debug("saving goods instance");  
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
  public void update(Goods instance) {
	    log.debug("updating goods instance"); 
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
  public void delete(Goods instance) {
	    log.debug("deleting goods instance"); 
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
