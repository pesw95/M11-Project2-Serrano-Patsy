package com.company;

public abstract class Person {
    protected String name;
    protected double pay;
    protected double moneyEarned;

    public Person(String name, double pay, double moneyEarned){
        this.name = name;
        this.pay = pay;
        this.moneyEarned = moneyEarned;
    }
    public abstract double pay();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getEarned() {
        return moneyEarned;
    }

    public void setEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }
}
