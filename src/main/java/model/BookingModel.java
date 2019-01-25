package model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BookingModel {
    //    @Id
//    @GeneratedValue(generator="system-uuid")
//    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Id
//    @GeneratedValue(strategy= GenerationType.AUTO)
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    private String id;
    private String SalonId;
    private String stylistId;
    //    private Date bookingDates;
    private String status;

    public BookingModel() {
    }

    public BookingModel(String salonId, String stylistId, String status) {
        SalonId = salonId;
        this.stylistId = stylistId;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSalonId() {
        return SalonId;
    }

    public void setSalonId(String salonId) {
        SalonId = salonId;
    }

    public String getStylistId() {
        return stylistId;
    }

    public void setStylistId(String stylistId) {
        this.stylistId = stylistId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

