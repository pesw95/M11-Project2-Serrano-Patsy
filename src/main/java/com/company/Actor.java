package com.company;

public class Actor extends Person {
    protected String actorRole;


    public Actor(String name, double pay, double moneyEarned, String role) {
        super(name, pay, moneyEarned);
        this.actorRole = role;
    }


    public double pay() {
        return pay;
    }


    public String getActorRole() {
        return actorRole;
    }

    public void setActorRole(String actorRole) {
        this.actorRole = actorRole;
    }
}

