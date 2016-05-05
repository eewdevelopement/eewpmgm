package com.main.pojo;
// Generated May 5, 2016 4:40:48 AM by Hibernate Tools 3.6.0



/**
 * TblGroupStudent generated by hbm2java
 */
public class TblGroupStudent  implements java.io.Serializable {


     private Integer id;
     private Integer profileId;
     private Integer groupId;
     private String studentName;
     private String studentContact;
     private String studentEmail;

    public TblGroupStudent() {
    }

	
    public TblGroupStudent(String studentName, String studentContact, String studentEmail) {
        this.studentName = studentName;
        this.studentContact = studentContact;
        this.studentEmail = studentEmail;
    }
    public TblGroupStudent(Integer profileId, Integer groupId, String studentName, String studentContact, String studentEmail) {
       this.profileId = profileId;
       this.groupId = groupId;
       this.studentName = studentName;
       this.studentContact = studentContact;
       this.studentEmail = studentEmail;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Integer getProfileId() {
        return this.profileId;
    }
    
    public void setProfileId(Integer profileId) {
        this.profileId = profileId;
    }
    public Integer getGroupId() {
        return this.groupId;
    }
    
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
    public String getStudentName() {
        return this.studentName;
    }
    
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public String getStudentContact() {
        return this.studentContact;
    }
    
    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }
    public String getStudentEmail() {
        return this.studentEmail;
    }
    
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }




}

