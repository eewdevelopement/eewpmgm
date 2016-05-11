package com.eew.pojo;
// Generated May 10, 2016 10:59:43 PM by Hibernate Tools 3.6.0



/**
 * TblGroupStudent generated by hbm2java
 */
public class TblGroupStudent  implements java.io.Serializable {


     private Integer id;
     private TblProjectGroup tblProjectGroup;
     private TblProfile tblProfile;
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
    public TblGroupStudent(TblProjectGroup tblProjectGroup, TblProfile tblProfile, String studentName, String studentContact, String studentEmail) {
       this.tblProjectGroup = tblProjectGroup;
       this.tblProfile = tblProfile;
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
    public TblProjectGroup getTblProjectGroup() {
        return this.tblProjectGroup;
    }
    
    public void setTblProjectGroup(TblProjectGroup tblProjectGroup) {
        this.tblProjectGroup = tblProjectGroup;
    }
    public TblProfile getTblProfile() {
        return this.tblProfile;
    }
    
    public void setTblProfile(TblProfile tblProfile) {
        this.tblProfile = tblProfile;
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


