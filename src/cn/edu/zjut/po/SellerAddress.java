package cn.edu.zjut.po;



/**
 * SellerAddress entity. @author MyEclipse Persistence Tools
 */

public class SellerAddress  implements java.io.Serializable {


    // Fields    

     private Integer addressid;
     private Seller seller;
     private String storeaddress;
     private String deliveraddress;


    // Constructors

    /** default constructor */
    public SellerAddress() {
    }

	/** minimal constructor */
    public SellerAddress(String deliveraddress) {
        this.deliveraddress = deliveraddress;
    }
    
    /** full constructor */
    public SellerAddress(Seller seller, String storeaddress, String deliveraddress) {
        this.seller = seller;
        this.storeaddress = storeaddress;
        this.deliveraddress = deliveraddress;
    }

   
    // Property accessors

    public Integer getAddressid() {
        return this.addressid;
    }
    
    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public Seller getSeller() {
        return this.seller;
    }
    
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getStoreaddress() {
        return this.storeaddress;
    }
    
    public void setStoreaddress(String storeaddress) {
        this.storeaddress = storeaddress;
    }

    public String getDeliveraddress() {
        return this.deliveraddress;
    }
    
    public void setDeliveraddress(String deliveraddress) {
        this.deliveraddress = deliveraddress;
    }
   








}