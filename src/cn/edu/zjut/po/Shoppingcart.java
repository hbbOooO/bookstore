package cn.edu.zjut.po;



/**
 * Shoppingcart entity. @author MyEclipse Persistence Tools
 */

public class Shoppingcart  implements java.io.Serializable {


    // Fields    

     private Integer shoppingcartid;
     private Goods goods;
     private Customer customer;
     private Integer number;


    // Constructors

    /** default constructor */
    public Shoppingcart() {
    }

    
    /** full constructor */
    public Shoppingcart(Goods goods, Customer customer, Integer number) {
        this.goods = goods;
        this.customer = customer;
        this.number = number;
    }

   
    // Property accessors

    public Integer getShoppingcartid() {
        return this.shoppingcartid;
    }
    
    public void setShoppingcartid(Integer shoppingcartid) {
        this.shoppingcartid = shoppingcartid;
    }

    public Goods getGoods() {
        return this.goods;
    }
    
    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Integer getNumber() {
        return this.number;
    }
    
    public void setNumber(Integer number) {
        this.number = number;
    }
   








}