package com.example.hadlak.sports;

public class SportsApp {

    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        FootballPlayer kevin = new FootballPlayer("Kevin");
        FootballPlayer sven = new FootballPlayer("Sven");
        FootballPlayer banks = new FootballPlayer("Gordon");
        FootballPlayer neuer = new FootballPlayer("Manuel");
        FootballPlayer mueller = new FootballPlayer("Thomas");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team rawTeam = new Team("Raw Team");
        rawTeam.addPlayer(pat);
        rawTeam.addPlayer(pat);

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
        adelaideCrows.addPlayer(kevin);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        adelaideCrows.addPlayer(banks);
        adelaideCrows.addPlayer(neuer);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorn");
        hawthorn.addPlayer(mueller);

        Team<FootballPlayer> fremantle = new Team<>("Fremantle");
        fremantle.addPlayer(sven);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);

        adelaideCrows.matchResult(melbourne, 1, 0);
        adelaideCrows.matchResult(hawthorn, 2, 3);
        adelaideCrows.matchResult(fremantle, 0, 0);
        melbourne.matchResult(hawthorn, 2, 0);
        melbourne.matchResult(fremantle, 1, 1);
        hawthorn.matchResult(fremantle, 0, 4);

//        adelaideCrows.matchResult(baseballTeam, 1, 3);

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(hawthorn.compareTo(melbourne));

        League<FootballPlayer, Team<FootballPlayer>> footballLeague = new League<>("Football League");
        footballLeague.addTeam(adelaideCrows);
        footballLeague.addTeam(melbourne);
        footballLeague.addTeam(hawthorn);
        footballLeague.addTeam(fremantle);
//        footballLeague.addTeam(baseballTeam);


        footballLeague.printLeagueRanking();


    }
}
