package com.pluralsight;

import java.time.Duration;
import java.time.LocalDateTime;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private int startTime;
    private LocalDateTime localStartDateTime;

    public Employee(int id, String name, String department, double payRate) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

    public double getRegularHours() {
        if (this.hoursWorked >= 40) {
            return 40;
        }
        return this.hoursWorked;
    }

    public double getOvertimeHours() {
        return this.hoursWorked - 40;
    }

    public double getTotalPay() {
        double totalPay = this.payRate * this.getRegularHours();

        if (this.getOvertimeHours() > 0) {
            totalPay = this.payRate * this.getRegularHours();
            double grossOvertimePay = (this.payRate * 1.5) * this.getOvertimeHours();
            totalPay += grossOvertimePay;
        }
        return totalPay;
    }

    public void punchIn(int time) {
        startTime = time;
    }

    public void punchOut(int time) {
        this.hoursWorked = time - this.startTime;
        System.out.println("The employee worked " + this.hoursWorked + "hours");
        this.startTime = 0;
    }

    public void punchIn() {
        this.localStartDateTime = LocalDateTime.now();
    }

    public void punchOut() {
        LocalDateTime endTime = LocalDateTime.now();

        Duration totalDuration = Duration.between(localStartDateTime, endTime);
        this.hoursWorked = totalDuration.toMinutes() / 60.0;
        System.out.println("The employee worked " + this.hoursWorked + " hours");
    }

}
