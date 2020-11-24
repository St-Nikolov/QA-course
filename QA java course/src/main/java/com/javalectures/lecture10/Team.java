package com.javalectures.lecture10;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

@Slf4j

public class Team {
    private String name;
    private Map<String,Player> players = new LinkedHashMap<String,Player>();

    public Team(String name) {
       if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Name of the team cannon be empty!");
       else this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(Player player){
        if (players.putIfAbsent(player.getName(), player) == null) return true;
        else {
            log.info("{} is already in the team.", player.getName());
            return false;
        }
    }

    public boolean removePlayer(String playerName) {
        if (players.remove(playerName) != null) return true;
        else {
            log.info("Player {} is not in {} team.", playerName,this.getName());
            return false;
        }
    }

    public float getRating(){
        float rating = 0;
        for (Player player: players.values()) {
            rating+=player.getOverallSkill();
        }
        return rating/players.size();
    }

    public String toString(){
        String team = "";
        for (Player player: players.values()) {
            team = team.concat(player.getName() + " : " + player.getOverallSkill() + "\n");
        }
        return team;
    }
}
