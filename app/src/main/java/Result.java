package com.example.desportivos;

public class Result {



    private String Team1;
    private String Team2;
    private String Team1points;
    private String Team2points;
    private String Round;

    public Result(){
    }

    public Result(String team1,String team2,String team1points,String team2points,String round){
        Team1 = team1;
        Team2 = team2;
        Team1points = team1points;
        Team2points = team2points;
        Round = round;
    }

    public void setTeam1(String team1) {
        Team1 = team1;
    }

    public void setTeam2(String team2) {
        Team2 = team2;
    }

    public void setTeam1points(String team1points) {
        Team1points = team1points;
    }

    public void setTeam2points(String team2points) {
        Team2points = team2points;
    }

    public void setRound(String round) {
        Round = round;
    }

    public String getTeam1() {
        return Team1;
    }

    public String getTeam2() {
        return Team2;
    }

    public String getTeam1points() {
        return Team1points;
    }

    public String getTeam2points() {
        return Team2points;
    }

    public String getRound() {
        return Round;
    }
}
