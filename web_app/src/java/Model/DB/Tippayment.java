package Model.DB;
// Generated 24-Dec-2015 11:17:32 by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Tippayment generated by hbm2java
 */
public class Tippayment  implements java.io.Serializable {


     private Integer idtipPayment;
     private Maintaincharge maintaincharge;
     private Paidstatus paidstatus;
     private Sugarrate sugarrate;
     private Double amount;
     private Date paidDate;
     private Date claimedDate;

    public Tippayment() {
    }

	
    public Tippayment(Maintaincharge maintaincharge, Paidstatus paidstatus, Sugarrate sugarrate) {
        this.maintaincharge = maintaincharge;
        this.paidstatus = paidstatus;
        this.sugarrate = sugarrate;
    }
    public Tippayment(Maintaincharge maintaincharge, Paidstatus paidstatus, Sugarrate sugarrate, Double amount, Date paidDate, Date claimedDate) {
       this.maintaincharge = maintaincharge;
       this.paidstatus = paidstatus;
       this.sugarrate = sugarrate;
       this.amount = amount;
       this.paidDate = paidDate;
       this.claimedDate = claimedDate;
    }
   
    public Integer getIdtipPayment() {
        return this.idtipPayment;
    }
    
    public void setIdtipPayment(Integer idtipPayment) {
        this.idtipPayment = idtipPayment;
    }
    public Maintaincharge getMaintaincharge() {
        return this.maintaincharge;
    }
    
    public void setMaintaincharge(Maintaincharge maintaincharge) {
        this.maintaincharge = maintaincharge;
    }
    public Paidstatus getPaidstatus() {
        return this.paidstatus;
    }
    
    public void setPaidstatus(Paidstatus paidstatus) {
        this.paidstatus = paidstatus;
    }
    public Sugarrate getSugarrate() {
        return this.sugarrate;
    }
    
    public void setSugarrate(Sugarrate sugarrate) {
        this.sugarrate = sugarrate;
    }
    public Double getAmount() {
        return this.amount;
    }
    
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    public Date getPaidDate() {
        return this.paidDate;
    }
    
    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }
    public Date getClaimedDate() {
        return this.claimedDate;
    }
    
    public void setClaimedDate(Date claimedDate) {
        this.claimedDate = claimedDate;
    }




}


