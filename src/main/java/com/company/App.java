package com.company;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        Actor actor1 = new Actor("Patsy", 900000,500000, "main actor");
        Actor actor2 = new Actor("Alondra", 600000, 400000,"supporting actor");
        Actor actor3 = new Actor("Jerimiah", 500000,230000, "supporting actor");
        Actor actor4 = new Actor("Genesis", 500000, 230000, "supporting actor");
        Crew crew1 = new Crew("Leo",120000, 60000, "camera crew");
        Crew crew2 = new Crew("Edna", 90000, 40000, "costume department");
        Crew crew3 = new Crew("Maria", 80000,4000, "makeup department");
        PA pa = new PA("Ryan", 3000, 1500,"assistant", 80);
        Director director = new Director("Racmel", 2000000,1000000 , "Director");


        List<Actor> actors= new ArrayList();
        actors.add(actor1);
        actors.add(actor2);

        List<Crew> crews = new ArrayList();
        crews.add(crew1);
        crews.add(crew2);
        director.calculateRoyalties();

        Movie movie =new Movie("Science Fiction", director , actors, crews ,10000000);

        movie.MoneyEarned(5000000);

        movie.Payday();

        pa.addHours(40);


        System.out.println("The PA has earned " + pa.pay());

        System.out.println("The movie has spent " + movie.getMoneySpent() +" out of the movie budget of " + movie.getBudget());

        System.out.println("The movie's profits were "+ movie.Profit());

        System.out.println("The director made in royalties "+ director.getRoyalty());



    }
}
