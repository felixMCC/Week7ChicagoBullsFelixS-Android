package com.example;

/**
 * Created by Felix on 10/5/15.
 */
public class Bulls {

    public double [] points = {954, 10, 904, 109, 149, 1301, 485, 377, 595, 27, 833, 1446, 640, 435};
    public double [] reboundsByTop3PtShooters = {919, 248, 166};
    public double totalPoints = 0.0;        //total poins made by team
    public double avgPoints = 0.0;          //holds total avg points made by team
    public double totalRebounds = 0.0;      //holds total rebounds made by top 3 3pt% shooters
    public double averageRebounds = 0.0;    //holds avg rebounds by top 3 3pt% shooters
    public int seasonGames = 82;            //total games in the season
    //player objects
    Player Rose;
    Player Buckets;

    public void runBulls(){
        //run program here
        //calculate total points by team
        calculateAvgPointsByTeam();
        //calculate average rebounds by top 3 3% shooters
        calculateRebounds();
        //who is better?
        whoIsBetter();
    }

    //simple function to print to console
    public void printToUser(String toUser){
        System.out.println(toUser);
    }

    public void calculateAvgPointsByTeam(){
        printToUser("\n1. Calculating average amount of points scored by the team:\n");
        for(int cnt = 0; cnt < points.length; cnt++){
            //printToUser(""+ points[cnt]);     //for testing
            totalPoints += points[cnt];
        }
        printToUser("Total Points: " + totalPoints);  //testing
        //calculate average points in the season
        avgPoints = totalPoints / seasonGames;

        printToUser("Total average points scored by the team in 82 season games: " + avgPoints);
    }

    public void calculateRebounds(){
        printToUser("\n2. Calculating average rebounds for total rebounds made by top 3 3pt% shooters:\n");
        for(int cnt = 0; cnt < reboundsByTop3PtShooters.length; cnt++){
            totalRebounds += reboundsByTop3PtShooters[cnt];
        }
        //calculate average rebounds by top 3pt% shooters
        averageRebounds = totalRebounds / 3;

        printToUser("Total average rebounds for top 3 3pt% shooters: " + averageRebounds);
    }

    public void whoIsBetter(){
        printToUser("\n3. Who is better? Jimmy Buckets or D-Rose?: \n");
        createPlayers();    //Instantiate player objects w data
        printToUser("Player: \t" + Rose.name + "\t\t" + Buckets.name + "\n");
        printToUser("Points: \t" + Rose.points + "\t\t\t" + Buckets.points);
        printToUser("Rebounds: \t" + Rose.rebounds + "\t\t\t" + Buckets.rebounds);
        printToUser("Steals: \t" + Rose.steals + "\t\t\t" + Buckets.steals);
        printToUser("Assists: \t" + Rose.assists + "\t\t\t" + Buckets.assists);
        printToUser("3-Pts: \t\t" + Rose.threePts + "\t\t\t" + Buckets.threePts);
        printToUser("Games: " + "\t\t" + Rose.gamesPlayed + "\t\t\t" + Buckets.gamesPlayed);
        printToUser("Minutes: \t" + Rose.minutes + "\t\t" + Buckets.minutes);
        printToUser("\N**** YOU DECIDE!!! ****");
    }

    public void createPlayers(){
        //String plyrName, int point, int rebound, int steal, int assist, int threes, int games, int min
        Rose = new Player("D-Rose", 904, 161, 36, 251, 76, 51, 1530 );
        Buckets = new Player("Jimmy Buckets", 1301, 379, 114, 212, 73, 65, 2513 );
    }
}

