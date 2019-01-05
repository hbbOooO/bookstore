package cn.edu.zjut.po;



/**
 * CustomerAddress entity. @author MyEclipse Persistence Tools
 */

public class CustomerAddress  implements java.io.Serializable {


    // Fields    

     private Integer addressid;
     private Customer customer;
     private String addressinfo;


    // Constructors

    /** default constructor */
    public CustomerAddress() {
    }

	/** minimal constructor */
    public CustomerAddress(Customer customer) {
        this.customer = customer;
    }
    
    /** full constructor */
    public CustomerAddress(Customer customer, String addressinfo) {
        this.customer = customer;
        this.addressinfo = addressinfo;
    }

   
    // Property accessors

    public Integer getAddressid() {
        return this.addressid;
    }
    
    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getAddressinfo() {
        return this.addressinfo;
    }
    
    public void setAddressinfo(String addressinfo) {
        this.addressinfo = addressinfo;
    }
   








}