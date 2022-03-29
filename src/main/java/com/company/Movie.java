package com.company;

import java.util.List;

public class Movie {
    protected String genre;
    protected Director director;
    protected double budget;
    protected double moneySpent;
    protected double moneyEarned;
    protected  static double profit;
    protected List<Actor> actors;
    protected List<Crew> crews;


    public Movie(String genre, Director director,List<Actor> actors, List<Crew> crews, double budget){
        this.genre = genre;
        this.director = director;
        this.budget = budget;
        this.moneySpent = 0;
        this.moneyEarned = 0;
        this.profit = 0;
        this.crews = crews;
        this.actors =actors;
    }


    public void MoneySpent(double moreMoneySpent){
        this.moneySpent += moreMoneySpent;
    }


    public void MoneyEarned( double moreMoneyEarned){
        this.moneyEarned+= moreMoneyEarned;
    }


    public double Profit (){
        double moneyEarned = getMoneyEarned();
        double moneySpent = getMoneySpent();
        double budget = getBudget();
        this.profit = (budget - moneySpent) + moneyEarned;
        director.calculateRoyalties();
        return (budget - moneySpent) + moneyEarned;

    }


    public void Payday( ) {

        for (Actor i : actors) {
            MoneySpent(i.getPay());
        }

        for (Crew i : crews) {
            MoneySpent(i.getPay());
        }

        MoneySpent(director.getPay());

    }

//        Getters and Setters

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public double getMoneySpent() {
        return moneySpent;
    }

    public void setMoneySpent(double moneySpent) {
        this.moneySpent = moneySpent;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {
        this.moneyEarned = moneyEarned;
    }

    public static double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public List<Actor> getActor() {
        return actors;
    }

    public void setActor(List<Actor> actor) {
        this.actors = actor;
    }

    public List<Crew> getCrew() {
        return crews;
    }

    public void setCrew(List<Crew> crew) {
        this.crews = crew;
    }
}
