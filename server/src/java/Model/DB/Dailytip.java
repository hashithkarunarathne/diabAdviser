package Model.DB;
// Generated 24-Dec-2015 11:17:32 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Dailytip generated by hbm2java
 */
public class Dailytip  implements java.io.Serializable {


     private Integer iddailyTip;
     private Doctor doctor;
     private String dailyTip;
     private Date addedDate;

    public Dailytip() {
    }

	
    public Dailytip(Doctor doctor) {
        this.doctor = doctor;
    }
    public Dailytip(Doctor doctor, String dailyTip, Date addedDate) {
       this.doctor = doctor;
       this.dailyTip = dailyTip;
       this.addedDate = addedDate;
    }
   
    public Integer getIddailyTip() {
        return this.iddailyTip;
    }
    
    public void setIddailyTip(Integer iddailyTip) {
        this.iddailyTip = iddailyTip;
    }
    public Doctor getDoctor() {
        return this.doctor;
    }
    
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    public String getDailyTip() {
        return this.dailyTip;
    }
    
    public void setDailyTip(String dailyTip) {
        this.dailyTip = dailyTip;
    }
    public Date getAddedDate() {
        return this.addedDate;
    }
    
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }




}


