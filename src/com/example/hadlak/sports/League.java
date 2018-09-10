package com.example.hadlak.sports;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<U extends Player, T extends Team<U>>{

    private String name;
    private List<T> teams;

    public League(String name) {
        this.name = name;
        teams = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean addTeam(T team){
        if (teams.contains(team)){
            System.out.println(team.getName() + " is already in the league: " + this.name);
            return false;
        } else {
            teams.add(team);
            System.out.println(team.getName() + " added to the league: " + this.name);
            return true;
        }
    }



    public void printLeagueRanking(){
        Collections.sort(teams);
        for (int i = 0; i < teams.size(); i++){
            System.out.println((i + 1) + ". " + teams.get(i).getName() + " " + teams.get(i).ranking() + " points");
        }
    }
}
