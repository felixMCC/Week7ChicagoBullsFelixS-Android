package com.example;

public class MainClass {
    public static void main(String [] args){

        System.out.println("Week 7: Chicago Bulls \nBy: Nestor (Felix) Sotres");
        System.out.println("\nThis program will use the Chicago Bulls statistics (from nba.com) from the 2014-2015 season to present some info:");
        //create new object to run Bulls class
        Bulls run = new Bulls();
        //run program
        run.runBulls();
    }
}
