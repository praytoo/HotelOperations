package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(double payRate, String employeeId, String name, String department, double hoursWorked) {
        this.payRate = payRate;
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        return payRate * hoursWorked;
    }

    public double getRegularHours(){
        return hoursWorked - getOvertimeHours();
    }

    public double getOvertimeHours(){
        return hoursWorked - 40;
    }
}
