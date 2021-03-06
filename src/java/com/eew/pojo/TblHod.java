package com.eew.pojo;
// Generated May 11, 2016 10:15:25 PM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * TblHod generated by hbm2java
 */
public class TblHod  implements java.io.Serializable {


     private Integer id;
     private TblProfile tblProfile;
     private String fullName;
     private String contactNo;
     private String landLineNo;
     private String emailId;
     private String password;
     private String securityQuestion;
     private String answer;
     private String brachName;
     private String fromDuration;
     private String toDuration;
     private Character isActive;
     private Integer createBy;
     private Integer updatedBy;
     private Date createOn;
     private Date updatedOn;

    public TblHod() {
    }

	
    public TblHod(String fullName, String contactNo, String emailId, String password, String securityQuestion, String answer, String brachName, String fromDuration, String toDuration) {
        this.fullName = fullName;
        this.contactNo = contactNo;
        this.emailId = emailId;
        this.password = password;
        this.securityQuestion = securityQuestion;
        this.answer = answer;
        this.brachName = brachName;
        this.fromDuration = fromDuration;
        this.toDuration = toDuration;
    }
    public TblHod(TblProfile tblProfile, String fullName, String contactNo, String landLineNo, String emailId, String password, String securityQuestion, String answer, String brachName, String fromDuration, String toDuration, Character isActive, Integer createBy, Integer updatedBy, Date createOn, Date updatedOn) {
       this.tblProfile = tblProfile;
       this.fullName = fullName;
       this.contactNo = contactNo;
       this.landLineNo = landLineNo;
       this.emailId = emailId;
       this.password = password;
       this.securityQuestion = securityQuestion;
       this.answer = answer;
       this.brachName = brachName;
       this.fromDuration = fromDuration;
       this.toDuration = toDuration;
       this.isActive = isActive;
       this.createBy = createBy;
       this.updatedBy = updatedBy;
       this.createOn = createOn;
       this.updatedOn = updatedOn;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public TblProfile getTblProfile() {
        return this.tblProfile;
    }
    
    public void setTblProfile(TblProfile tblProfile) {
        this.tblProfile = tblProfile;
    }
    public String getFullName() {
        return this.fullName;
    }
    
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getContactNo() {
        return this.contactNo;
    }
    
    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
    public String getLandLineNo() {
        return this.landLineNo;
    }
    
    public void setLandLineNo(String landLineNo) {
        this.landLineNo = landLineNo;
    }
    public String getEmailId() {
        return this.emailId;
    }
    
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    public String getSecurityQuestion() {
        return this.securityQuestion;
    }
    
    public void setSecurityQuestion(String securityQuestion) {
        this.securityQuestion = securityQuestion;
    }
    public String getAnswer() {
        return this.answer;
    }
    
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    public String getBrachName() {
        return this.brachName;
    }
    
    public void setBrachName(String brachName) {
        this.brachName = brachName;
    }
    public String getFromDuration() {
        return this.fromDuration;
    }
    
    public void setFromDuration(String fromDuration) {
        this.fromDuration = fromDuration;
    }
    public String getToDuration() {
        return this.toDuration;
    }
    
    public void setToDuration(String toDuration) {
        this.toDuration = toDuration;
    }
    public Character getIsActive() {
        return this.isActive;
    }
    
    public void setIsActive(Character isActive) {
        this.isActive = isActive;
    }
    public Integer getCreateBy() {
        return this.createBy;
    }
    
    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }
    public Integer getUpdatedBy() {
        return this.updatedBy;
    }
    
    public void setUpdatedBy(Integer updatedBy) {
        this.updatedBy = updatedBy;
    }
    public Date getCreateOn() {
        return this.createOn;
    }
    
    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }
    public Date getUpdatedOn() {
        return this.updatedOn;
    }
    
    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }




}


