package com.example.desportivos;

public class Fixture {



    private String Team1;
    private String Team2;
    private String Time;
    private String Round;

    public Fixture(){
    }

    public Fixture(String team1,String team2,String time,String round){
        Team1 = team1;
        Team1 = team2;
        Time = time;
        Round = round;
    }

    public String getTeam1() {
        return Team1;
    }

    public String getTeam2() {
        return Team2;
    }

    public String getTime() {
        return Time;
    }

    public String getRound() {
        return Round;
    }

    public void setTeam1(String team1) {
        Team1 = team1;
    }

    public void setTeam2(String team2) {
        Team2 = team2;
    }

    public void setTime(String time) {
        Time = time;
    }

    public void setRound(String round) {
        Round = round;
    }
}
