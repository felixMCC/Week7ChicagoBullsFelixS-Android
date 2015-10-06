package com.example;

/**
 * Created by Felix on 10/5/15.
 *
 * Class used to create player object holding stats
 */
public class Player {

    //player stats
    public String name;
    public int points;
    public int rebounds;
    public int steals;
    public int assists;
    public int threePts;
    public int gamesPlayed;
    public int minutes;

    //constructor
    public Player(String plyrName, int point, int rebound, int steal, int assist, int threes, int games, int min){

        name = plyrName;
        points = point;
        rebounds = rebound;
        steals = steal;
        assists = assist;
        threePts = threes;
        gamesPlayed = games;
        minutes = min;

    }

}
