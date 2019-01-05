package cn.edu.zjut.po;

import java.util.HashSet;
import java.util.Set;


/**
 * Appeal entity. @author MyEclipse Persistence Tools
 */

public class Appeal  implements java.io.Serializable {


    // Fields    

     private Integer appealid;
     private Record record;
     private String reason;
     private String result;
     private String resultdetail;
     private Set appealPhotos = new HashSet(0);


    // Constructors

    /** default constructor */
    public Appeal() {
    }

	/** minimal constructor */
    public Appeal(String reason) {
        this.reason = reason;
    }
    
    /** full constructor */
    public Appeal(Record record, String reason, String result, String resultdetail, Set appealPhotos) {
        this.record = record;
        this.reason = reason;
        this.result = result;
        this.resultdetail = resultdetail;
        this.appealPhotos = appealPhotos;
    }

   
    // Property accessors

    public Integer getAppealid() {
        return this.appealid;
    }
    
    public void setAppealid(Integer appealid) {
        this.appealid = appealid;
    }

    public Record getRecord() {
        return this.record;
    }
    
    public void setRecord(Record record) {
        this.record = record;
    }

    public String getReason() {
        return this.reason;
    }
    
    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getResult() {
        return this.result;
    }
    
    public void setResult(String result) {
        this.result = result;
    }

    public String getResultdetail() {
        return this.resultdetail;
    }
    
    public void setResultdetail(String resultdetail) {
        this.resultdetail = resultdetail;
    }

    public Set getAppealPhotos() {
        return this.appealPhotos;
    }
    
    public void setAppealPhotos(Set appealPhotos) {
        this.appealPhotos = appealPhotos;
    }
   








}