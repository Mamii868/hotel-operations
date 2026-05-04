package com.pluralsight;

public class Employee {
    private int id;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int id, String name, String department, double payRate, double hoursWorked) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
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
}
