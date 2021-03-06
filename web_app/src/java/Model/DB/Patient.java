package Model.DB;
// Generated 24-Dec-2015 11:17:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Patient generated by hbm2java
 */
public class Patient  implements java.io.Serializable {


     private int userIduser;
     private User user;
     private String firstName;
     private String mobile;
     private String confitmCode;
     private Set doctorHasPatients = new HashSet(0);

    public Patient() {
    }

	
    public Patient(User user) {
        this.user = user;
    }
    public Patient(User user, String firstName, String mobile, String confitmCode, Set doctorHasPatients) {
       this.user = user;
       this.firstName = firstName;
       this.mobile = mobile;
       this.confitmCode = confitmCode;
       this.doctorHasPatients = doctorHasPatients;
    }
   
    public int getUserIduser() {
        return this.userIduser;
    }
    
    public void setUserIduser(int userIduser) {
        this.userIduser = userIduser;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getFirstName() {
        return this.firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMobile() {
        return this.mobile;
    }
    
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getConfitmCode() {
        return this.confitmCode;
    }
    
    public void setConfitmCode(String confitmCode) {
        this.confitmCode = confitmCode;
    }
    public Set getDoctorHasPatients() {
        return this.doctorHasPatients;
    }
    
    public void setDoctorHasPatients(Set doctorHasPatients) {
        this.doctorHasPatients = doctorHasPatients;
    }




}


