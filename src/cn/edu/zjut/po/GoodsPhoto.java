package cn.edu.zjut.po;



/**
 * GoodsPhoto entity. @author MyEclipse Persistence Tools
 */

public class GoodsPhoto  implements java.io.Serializable {


    // Fields    

     private Integer photoid;
     private Goods goods;
     private String photoes;


    // Constructors

    /** default constructor */
    public GoodsPhoto() {
    }

	/** minimal constructor */
    public GoodsPhoto(Goods goods) {
        this.goods = goods;
    }
    
    /** full constructor */
    public GoodsPhoto(Goods goods, String photoes) {
        this.goods = goods;
        this.photoes = photoes;
    }

   
    // Property accessors

    public Integer getPhotoid() {
        return this.photoid;
    }
    
    public void setPhotoid(Integer photoid) {
        this.photoid = photoid;
    }

    public Goods getGoods() {
        return this.goods;
    }
    
    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public String getPhotoes() {
        return this.photoes;
    }
    
    public void setPhotoes(String photoes) {
        this.photoes = photoes;
    }
   








}