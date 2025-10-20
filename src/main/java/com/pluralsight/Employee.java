package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

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
