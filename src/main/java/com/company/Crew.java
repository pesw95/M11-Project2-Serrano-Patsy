package com.company;

public class Crew extends Person {

    private String crewDepartment;


    public Crew(String name, double pay, double moneyEarned, String department) {
        super(name, pay, moneyEarned);
        this.crewDepartment = department;
    }


    public double pay() {
        return pay;
    }


    public String getCrewDepartment() {
        return crewDepartment;
    }

    public void setCrewDepartment(String crewDepartment) {
        this.crewDepartment = crewDepartment;
    }

}
