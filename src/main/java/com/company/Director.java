package com.company;

public class Director extends Crew{
    private double royalties;


    public Director(String name, double pay, double currentEarnings, String department) {
        super(name, pay, currentEarnings, department);
        this.royalties = 0;
    }
    public void calculateRoyalties(){
        royalties = Movie.getProfit() * .01;

    }

    public double getRoyalty() {
        return royalties;
    }

    public void setRoyalty(double royalty) {
        this. royalties = royalty;
    }
}
