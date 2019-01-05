package cn.edu.zjut.po;

import java.util.HashSet;
import java.util.Set;


/**
 * Goods entity. @author MyEclipse Persistence Tools
 */

public class Goods  implements java.io.Serializable {


    // Fields    

     private Integer goodsid;
     private Seller seller;
     private String goodsname;
     private String state;
     private String type;
     private String recommendation;
     private String detail;
     private Long price;
     private Set shoppingcarts = new HashSet(0);
     private Set records = new HashSet(0);
     private Set goodsPhotos = new HashSet(0);


    // Constructors

    /** default constructor */
    public Goods() {
    }

	/** minimal constructor */
    public Goods(Seller seller, String goodsname, String state, String type, String recommendation, Long price) {
        this.seller = seller;
        this.goodsname = goodsname;
        this.state = state;
        this.type = type;
        this.recommendation = recommendation;
        this.price = price;
    }
    
    /** full constructor */
    public Goods(Seller seller, String goodsname, String state, String type, String recommendation, String detail, Long price, Set shoppingcarts, Set records, Set goodsPhotos) {
        this.seller = seller;
        this.goodsname = goodsname;
        this.state = state;
        this.type = type;
        this.recommendation = recommendation;
        this.detail = detail;
        this.price = price;
        this.shoppingcarts = shoppingcarts;
        this.records = records;
        this.goodsPhotos = goodsPhotos;
    }

   
    // Property accessors

    public Integer getGoodsid() {
        return this.goodsid;
    }
    
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    public Seller getSeller() {
        return this.seller;
    }
    
    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public String getGoodsname() {
        return this.goodsname;
    }
    
    public void setGoodsname(String goodsname) {
        this.goodsname = goodsname;
    }

    public String getState() {
        return this.state;
    }
    
    public void setState(String state) {
        this.state = state;
    }

    public String getType() {
        return this.type;
    }
    
    public void setType(String type) {
        this.type = type;
    }

    public String getRecommendation() {
        return this.recommendation;
    }
    
    public void setRecommendation(String recommendation) {
        this.recommendation = recommendation;
    }

    public String getDetail() {
        return this.detail;
    }
    
    public void setDetail(String detail) {
        this.detail = detail;
    }

    public Long getPrice() {
        return this.price;
    }
    
    public void setPrice(Long price) {
        this.price = price;
    }

    public Set getShoppingcarts() {
        return this.shoppingcarts;
    }
    
    public void setShoppingcarts(Set shoppingcarts) {
        this.shoppingcarts = shoppingcarts;
    }

    public Set getRecords() {
        return this.records;
    }
    
    public void setRecords(Set records) {
        this.records = records;
    }

    public Set getGoodsPhotos() {
        return this.goodsPhotos;
    }
    
    public void setGoodsPhotos(Set goodsPhotos) {
        this.goodsPhotos = goodsPhotos;
    }
   








}