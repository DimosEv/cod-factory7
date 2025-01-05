package gr.aueb.cf.ch12.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class Order {
    private int id;
    private String uuid;
    private double amount;
    private String descreption;
    private String state;
    private LocalDateTime timetamp;
    private String formattedtimestamp;

    public Order(){

    }

    public Order(int id,  double amount, String descreption, String state) {
        this.id = id;
        this.uuid = UUID.randomUUID().toString();
        this.amount = amount;
        this.descreption = descreption;
        this.state = state;
        this.timetamp = timetamp;
        this.formattedtimestamp = this.timetamp.format(DateTimeFormatter.ofPattern("dd-MM-yyyy  HH:mm:ss"));

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescreption() {
        return descreption;
    }

    public void setDescreption(String descreption) {
        this.descreption = descreption;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public LocalDateTime getTimetamp() {
        return timetamp;
    }

    public void setTimetamp(LocalDateTime timetamp) {
        this.timetamp = timetamp;
    }

    public String getFormattedtimestamp() {
        return formattedtimestamp;
    }

    public void setFormattedtimestamp(String formattedtimestamp) {
        this.formattedtimestamp = formattedtimestamp;
    }
}
