package Model.DB;
// Generated 24-Dec-2015 11:17:32 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Status generated by hbm2java
 */
public class Status  implements java.io.Serializable {


     private Integer iduserStatus;
     private String userStatus;
     private Set users = new HashSet(0);
     private Set doctorHasPatients = new HashSet(0);
     private Set maintaincharges = new HashSet(0);

    public Status() {
    }

    public Status(String userStatus, Set users, Set doctorHasPatients, Set maintaincharges) {
       this.userStatus = userStatus;
       this.users = users;
       this.doctorHasPatients = doctorHasPatients;
       this.maintaincharges = maintaincharges;
    }
   
    public Integer getIduserStatus() {
        return this.iduserStatus;
    }
    
    public void setIduserStatus(Integer iduserStatus) {
        this.iduserStatus = iduserStatus;
    }
    public String getUserStatus() {
        return this.userStatus;
    }
    
    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }
    public Set getUsers() {
        return this.users;
    }
    
    public void setUsers(Set users) {
        this.users = users;
    }
    public Set getDoctorHasPatients() {
        return this.doctorHasPatients;
    }
    
    public void setDoctorHasPatients(Set doctorHasPatients) {
        this.doctorHasPatients = doctorHasPatients;
    }
    public Set getMaintaincharges() {
        return this.maintaincharges;
    }
    
    public void setMaintaincharges(Set maintaincharges) {
        this.maintaincharges = maintaincharges;
    }




}


