package com.main.pojo;
// Generated May 5, 2016 4:40:48 AM by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * TblProjectGroup generated by hbm2java
 */
public class TblProjectGroup  implements java.io.Serializable {


     private Integer id;
     private int profileId;
     private String groupId;
     private String brachName;
     private Integer groupPStudent;
     private String projectTitle;
     private String projectDomain;
     private String groupUsername;
     private String groupPassword;
     private String projectLanguage;
     private Character isActive;
     private Integer createBy;
     private Integer updatedBy;
     private Date createOn;
     private Date updatedOn;

    public TblProjectGroup() {
    }

	
    public TblProjectGroup(int profileId, String groupId, String brachName, String projectTitle, String projectDomain, String groupUsername, String groupPassword, String projectLanguage) {
        this.profileId = profileId;
        this.groupId = groupId;
        this.brachName = brachName;
        this.projectTitle = projectTitle;
        this.projectDomain = projectDomain;
        this.groupUsername = groupUsername;
        this.groupPassword = groupPassword;
        this.projectLanguage = projectLanguage;
    }
    public TblProjectGroup(int profileId, String groupId, String brachName, Integer groupPStudent, String projectTitle, String projectDomain, String groupUsername, String groupPassword, String projectLanguage, Character isActive, Integer createBy, Integer updatedBy, Date createOn, Date updatedOn) {
       this.profileId = profileId;
       this.groupId = groupId;
       this.brachName = brachName;
       this.groupPStudent = groupPStudent;
       this.projectTitle = projectTitle;
       this.projectDomain = projectDomain;
       this.groupUsername = groupUsername;
       this.groupPassword = groupPassword;
       this.projectLanguage = projectLanguage;
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
    public int getProfileId() {
        return this.profileId;
    }
    
    public void setProfileId(int profileId) {
        this.profileId = profileId;
    }
    public String getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }
    public String getBrachName() {
        return this.brachName;
    }
    
    public void setBrachName(String brachName) {
        this.brachName = brachName;
    }
    public Integer getGroupPStudent() {
        return this.groupPStudent;
    }
    
    public void setGroupPStudent(Integer groupPStudent) {
        this.groupPStudent = groupPStudent;
    }
    public String getProjectTitle() {
        return this.projectTitle;
    }
    
    public void setProjectTitle(String projectTitle) {
        this.projectTitle = projectTitle;
    }
    public String getProjectDomain() {
        return this.projectDomain;
    }
    
    public void setProjectDomain(String projectDomain) {
        this.projectDomain = projectDomain;
    }
    public String getGroupUsername() {
        return this.groupUsername;
    }
    
    public void setGroupUsername(String groupUsername) {
        this.groupUsername = groupUsername;
    }
    public String getGroupPassword() {
        return this.groupPassword;
    }
    
    public void setGroupPassword(String groupPassword) {
        this.groupPassword = groupPassword;
    }
    public String getProjectLanguage() {
        return this.projectLanguage;
    }
    
    public void setProjectLanguage(String projectLanguage) {
        this.projectLanguage = projectLanguage;
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


