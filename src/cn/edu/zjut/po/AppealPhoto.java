package cn.edu.zjut.po;



/**
 * AppealPhoto entity. @author MyEclipse Persistence Tools
 */

public class AppealPhoto  implements java.io.Serializable {


    // Fields    

     private Integer photoid;
     private Appeal appeal;
     private String photoes;


    // Constructors

    /** default constructor */
    public AppealPhoto() {
    }

	/** minimal constructor */
    public AppealPhoto(Appeal appeal) {
        this.appeal = appeal;
    }
    
    /** full constructor */
    public AppealPhoto(Appeal appeal, String photoes) {
        this.appeal = appeal;
        this.photoes = photoes;
    }

   
    // Property accessors

    public Integer getPhotoid() {
        return this.photoid;
    }
    
    public void setPhotoid(Integer photoid) {
        this.photoid = photoid;
    }

    public Appeal getAppeal() {
        return this.appeal;
    }
    
    public void setAppeal(Appeal appeal) {
        this.appeal = appeal;
    }

    public String getPhotoes() {
        return this.photoes;
    }
    
    public void setPhotoes(String photoes) {
        this.photoes = photoes;
    }
   








}