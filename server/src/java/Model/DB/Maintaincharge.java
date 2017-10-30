package Model.DB;
// Generated 24-Dec-2015 11:17:32 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Maintaincharge generated by hbm2java
 */
public class Maintaincharge  implements java.io.Serializable {


     private Integer idadminCharge;
     private Status status;
     private Double adminCharge;
     private Date addedDate;
     private Set tippayments = new HashSet(0);

    public Maintaincharge() {
    }

	
    public Maintaincharge(Status status) {
        this.status = status;
    }
    public Maintaincharge(Status status, Double adminCharge, Date addedDate, Set tippayments) {
       this.status = status;
       this.adminCharge = adminCharge;
       this.addedDate = addedDate;
       this.tippayments = tippayments;
    }
   
    public Integer getIdadminCharge() {
        return this.idadminCharge;
    }
    
    public void setIdadminCharge(Integer idadminCharge) {
        this.idadminCharge = idadminCharge;
    }
    public Status getStatus() {
        return this.status;
    }
    
    public void setStatus(Status status) {
        this.status = status;
    }
    public Double getAdminCharge() {
        return this.adminCharge;
    }
    
    public void setAdminCharge(Double adminCharge) {
        this.adminCharge = adminCharge;
    }
    public Date getAddedDate() {
        return this.addedDate;
    }
    
    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }
    public Set getTippayments() {
        return this.tippayments;
    }
    
    public void setTippayments(Set tippayments) {
        this.tippayments = tippayments;
    }




}

