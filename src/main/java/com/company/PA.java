package com.company;

public class PA extends Crew {
    protected int hoursWorked;
    protected double payRate;

    public PA(String name, double pay, double moneyEarned, String department, double rate) {
        super(name, pay, moneyEarned, department);
        this.hoursWorked = 0;
        this.payRate = rate;

    }
    public void addHours (int moreHours){
        hoursWorked += moreHours;
    }

    public double pay(){
        double payment = payRate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }


    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
