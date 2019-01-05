package cn.edu.zjut.po;



/**
 * Manager entity. @author MyEclipse Persistence Tools
 */

public class Manager  implements java.io.Serializable {


    // Fields    

     private String managerid;
     private String password;
     private String phone;


    // Constructors

    /** default constructor */
    public Manager() {
    }

	/** minimal constructor */
    public Manager(String managerid, String password) {
        this.managerid = managerid;
        this.password = password;
    }
    
    /** full constructor */
    public Manager(String managerid, String password, String phone) {
        this.managerid = managerid;
        this.password = password;
        this.phone = phone;
    }

   
    // Property accessors

    public String getManagerid() {
        return this.managerid;
    }
    
    public void setManagerid(String managerid) {
        this.managerid = managerid;
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
   








}