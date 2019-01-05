package cn.edu.zjut.po;

import java.util.HashSet;
import java.util.Set;


/**
 * Seller entity. @author MyEclipse Persistence Tools
 */

public class Seller  implements java.io.Serializable {


    // Fields    

     private String account;
     private String password;
     private String phone;
     private String email;
     private String state;
     private Set sellerAddresses = new HashSet(0);
     private Set goodses = new HashSet(0);
     private Set customerServices = new HashSet(0);


    // Constructors

    /** default constructor */
    public Seller() {
    }

	/** minimal constructor */
    public Seller(String account, String password, String state) {
        this.account = account;
        this.password = password;
        this.state = state;
    }
    
    /** full constructor */
    public Seller(String account, String password, String phone, String email, String state, Set sellerAddresses, Set goodses, Set customerServices) {
        this.account = account;
        this.password = password;
        this.phone = phone;
        this.email = email;
        this.state = state;
        this.sellerAddresses = sellerAddresses;
        this.goodses = goodses;
        this.customerServices = customerServices;
    }

   
    // Property accessors

    public String getAccount() {
        return this.account;
    }
    
    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    public Set getSellerAddresses() {
        return this.sellerAddresses;
    }
    
    public void setSellerAddresses(Set sellerAddresses) {
        this.sellerAddresses = sellerAddresses;
    }

    public Set getGoodses() {
        return this.goodses;
    }
    
    public void setGoodses(Set goodses) {
        this.goodses = goodses;
    }

    public Set getCustomerServices() {
        return this.customerServices;
    }
    
    public void setCustomerServices(Set customerServices) {
        this.customerServices = customerServices;
    }
   








}