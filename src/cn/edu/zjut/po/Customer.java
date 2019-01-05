package cn.edu.zjut.po;

import java.util.HashSet;
import java.util.Set;


/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer  implements java.io.Serializable {


    // Fields    

     private String account;
     private String password;
     private String paypassword;
     private String phone;
     private String state;
     private String fileaddress;
     private Set records = new HashSet(0);
     private Set shoppingcarts = new HashSet(0);
     private Set customerAddresses = new HashSet(0);


    // Constructors

    /** default constructor */
    public Customer() {
    }

	/** minimal constructor */
    public Customer(String account, String password, String paypassword, String state, String fileaddress) {
        this.account = account;
        this.password = password;
        this.paypassword = paypassword;
        this.state = state;
        this.fileaddress = fileaddress;
    }
    
    /** full constructor */
    public Customer(String account, String password, String paypassword, String phone, String state, String fileaddress, Set records, Set shoppingcarts, Set customerAddresses) {
        this.account = account;
        this.password = password;
        this.paypassword = paypassword;
        this.phone = phone;
        this.state = state;
        this.fileaddress = fileaddress;
        this.records = records;
        this.shoppingcarts = shoppingcarts;
        this.customerAddresses = customerAddresses;
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

    public String getPaypassword() {
        return this.paypassword;
    }
    
    public void setPaypassword(String paypassword) {
        this.paypassword = paypassword;
    }

    public String getPhone() {
        return this.phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    public String getFileaddress() {
        return this.fileaddress;
    }
    
    public void setFileaddress(String fileaddress) {
        this.fileaddress = fileaddress;
    }

    public Set getRecords() {
        return this.records;
    }
    
    public void setRecords(Set records) {
        this.records = records;
    }

    public Set getShoppingcarts() {
        return this.shoppingcarts;
    }
    
    public void setShoppingcarts(Set shoppingcarts) {
        this.shoppingcarts = shoppingcarts;
    }

    public Set getCustomerAddresses() {
        return this.customerAddresses;
    }
    
    public void setCustomerAddresses(Set customerAddresses) {
        this.customerAddresses = customerAddresses;
    }
   








}