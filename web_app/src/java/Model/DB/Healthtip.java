package Model.DB;
// Generated 24-Dec-2015 11:17:32 by Hibernate Tools 4.3.1



/**
 * Healthtip generated by hbm2java
 */
public class Healthtip  implements java.io.Serializable {


     private Integer healthTipsIdtip;
     private Sugarrate sugarrate;
     private String tip;
     private String sendDate;
     private Boolean isRead;

    public Healthtip() {
    }

	
    public Healthtip(Sugarrate sugarrate) {
        this.sugarrate = sugarrate;
    }
    public Healthtip(Sugarrate sugarrate, String tip, String sendDate, Boolean isRead) {
       this.sugarrate = sugarrate;
       this.tip = tip;
       this.sendDate = sendDate;
       this.isRead = isRead;
    }
   
    public Integer getHealthTipsIdtip() {
        return this.healthTipsIdtip;
    }
    
    public void setHealthTipsIdtip(Integer healthTipsIdtip) {
        this.healthTipsIdtip = healthTipsIdtip;
    }
    public Sugarrate getSugarrate() {
        return this.sugarrate;
    }
    
    public void setSugarrate(Sugarrate sugarrate) {
        this.sugarrate = sugarrate;
    }
    public String getTip() {
        return this.tip;
    }
    
    public void setTip(String tip) {
        this.tip = tip;
    }
    public String getSendDate() {
        return this.sendDate;
    }
    
    public void setSendDate(String sendDate) {
        this.sendDate = sendDate;
    }
    public Boolean getIsRead() {
        return this.isRead;
    }
    
    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }




}


