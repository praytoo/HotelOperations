package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double startTime;
    private double punchIn;
    private double punchOut;
    //private double punchTimeCard;

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

    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
    }

    public void punchIn(double time) {
        startTime = time;
        hoursWorked += (punchOut - punchIn);
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        hoursWorked += (punchOut - punchIn);
    }

    public void punchOut(double time) {
        hoursWorked += (time - startTime);
    }

    /*
    public double punchTimeCard(double time) {
        double punchtimecard = 0;
        if (punchIn == 0) {
            this.punchIn = time;
        } else if (punchIn > 0) {
            this.punchOut = time;
            punchtimecard = (punchOut - punchIn);
            punchtimecard += hoursWorked;
            punchIn = 0;
        }
        return punchtimecard;
    }
     */
}
