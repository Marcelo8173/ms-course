package com.marcelo.hr_payroll.entities;

public class Payment {
    private String name;
    private Double dailyIcome;
    private Integer days;

    public Payment(String name, Double dailyIcome, Integer days) {
        this.name = name;
        this.dailyIcome = dailyIcome;
        this.days = days;
    }

    public Payment() {
    }

    public Double getTotal() {
        return days * dailyIcome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDailyIcome() {
        return dailyIcome;
    }

    public void setDailyIcome(Double dailyIcome) {
        this.dailyIcome = dailyIcome;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
