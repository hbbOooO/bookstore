package cn.edu.zjut.po;



/**
 * CustomerService entity. @author MyEclipse Persistence Tools
 */

public class CustomerService  implements java.io.Serializable {


    // Fields    

     private Integer customerserviceid;
     private Seller seller;
     private String password;
     private String phone;
     private String state;
     private String fileaddress;


    // Constructors

    /** default constructor */
    public CustomerService() {
    }

	/** minimal constructor */
    public CustomerService(Seller seller, String password, String state, String fileaddress) {
        this.seller = seller;
        this.password = password;
        this.state = state;
        this.fileaddress = fileaddress;
    }
    
    /** full constructor */
    public CustomerService(Seller seller, String password, String phone, String state, String fileaddress) {
        this.seller = seller;
        this.password = password;
        this.phone = phone;
        this.state = state;
        this.fileaddress = fileaddress;
    }

   
    // Property accessors

    public Integer getCustomerserviceid() {
        return this.customerserviceid;
    }
    
    public void setCustomerserviceid(Integer customerserviceid) {
        this.customerserviceid = customerserviceid;
    }

    public Seller getSeller() {
        return this.seller;
    }
    
    public void setSeller(Seller seller) {
        this.seller = seller;
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
   








}