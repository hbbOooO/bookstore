package cn.edu.zjut.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;

import cn.edu.zjut.po.*;
import cn.edu.zjut.service.*;

public class CustomerAction {
	private Customer cust;
	private CustomerAddress addr;
	
	private Map request;
	
	public Customer getCust(){
		return cust;
	}
	public void setCust(Customer cust){
		this.cust=cust;
	}
	public CustomerAddress getAddr(){
		return addr;
	}
	public void setCustomerAddress(CustomerAddress addr){
		this.addr=addr;
	}
	
	//action 方法
	public String login(){
		CustService custSer=new CustService();
		if(custSer.login(cust)){
			return "loginSuccess";
		}
		else {
			return "loginFail";
		}
	}
	
	//校验 login方法
	public void validateLogin(){
		ActionContext ctx = ActionContext.getContext();
		request=(Map)ctx.get("request");
		if(null==cust.getAccount() &&cust.getAccount().trim().equals("")){
			// 输出错误提示账号不能为空
			request.put("errorMess_login_account", "账号不能为空");

		}
		if(null==cust.getPassword()&&cust.getPassword().trim().equals("")){
			// 输出错误题是密码不能为空
			request.put("errorMess_login_password", "密码不能为空");
		}
	}
	
	public String register(){
		CustService custSer=new CustService();
		if(custSer.register(cust)){
			return "loginSuccess";
		}
		else {
			return "loginFail";
		}
	}
	
	
}
