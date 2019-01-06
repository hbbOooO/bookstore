package cn.edu.zjut.service;

import cn.edu.zjut.po.*;
import cn.edu.zjut.dao.*;
import org.hibernate.Session; 
import org.hibernate.Transaction;

public class CustService {
	private CustomerDAO customerDAO=null;
	
	
	// set Customer对象，依赖注入
	public void setCustomerDAO(CustomerDAO customerDAO){
		this.customerDAO=customerDAO;
	}
	
	public boolean login(Customer cust){
		//对数据库的操作
		//不需要事务
		
		Customer newCust=customerDAO.findById(cust.getAccount());
		if(newCust!=null) return true;
		else return false;
	}
	
	public boolean register(Customer cust){
		Customer newCust=customerDAO.findById(cust.getAccount());
		if(newCust!=null){
			return false;
		}
		else if(!newCust.getPassword().equals(cust.getPassword())){
			return false;
		}
		else {
			Session session=customerDAO.getSession();
			Transaction tx=session.beginTransaction();
			try{
				customerDAO.save(cust);
				tx.commit();
				return true;
			}catch(Exception e) { 
				if(tx != null) tx.rollback(); 
				return false; 
			} 
			finally{
				session.close();
			}
		}
		
	}
}
