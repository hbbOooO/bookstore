package cn.edu.zjut.po;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * Record entity. @author MyEclipse Persistence Tools
 */

public class Record  implements java.io.Serializable {


    // Fields    

     private Integer recordid;
     private Goods goods;
     private Customer customer;
     private String state;
     private Timestamp ordertime;
     private String ordernumber;
     private Integer goodsquality;
     private Set appeals = new HashSet(0);


    // Constructors

    /** default constructor */
    public Record() {
    }

	/** minimal constructor */
    public Record(Goods goods, Customer customer, String state, Timestamp ordertime, String ordernumber, Integer goodsquality) {
        this.goods = goods;
        this.customer = customer;
        this.state = state;
        this.ordertime = ordertime;
        this.ordernumber = ordernumber;
        this.goodsquality = goodsquality;
    }
    
    /** full constructor */
    public Record(Goods goods, Customer customer, String state, Timestamp ordertime, String ordernumber, Integer goodsquality, Set appeals) {
        this.goods = goods;
        this.customer = customer;
        this.state = state;
        this.ordertime = ordertime;
        this.ordernumber = ordernumber;
        this.goodsquality = goodsquality;
        this.appeals = appeals;
    }

   
    // Property accessors

    public Integer getRecordid() {
        return this.recordid;
    }
    
    public void setRecordid(Integer recordid) {
        this.recordid = recordid;
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

    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    public Timestamp getOrdertime() {
        return this.ordertime;
    }
    
    public void setOrdertime(Timestamp ordertime) {
        this.ordertime = ordertime;
    }

    public String getOrdernumber() {
        return this.ordernumber;
    }
    
    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Integer getGoodsquality() {
        return this.goodsquality;
    }
    
    public void setGoodsquality(Integer goodsquality) {
        this.goodsquality = goodsquality;
    }

    public Set getAppeals() {
        return this.appeals;
    }
    
    public void setAppeals(Set appeals) {
        this.appeals = appeals;
    }
   








}