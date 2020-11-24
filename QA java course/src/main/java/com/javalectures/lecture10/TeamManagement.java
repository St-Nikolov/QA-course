package com.javalectures.lecture10;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class TeamManagement {

    public static void main(String[] args) throws IOException {
        Map<String, Team> teams = new HashMap<String, Team>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] lineTokens;
        boolean continueReading = true;
        while(continueReading) {
            lineTokens = reader.readLine().split(";");
            switch (lineTokens[0].toLowerCase()) {
                case "team": {
                    if (lineTokens.length != 2) {
                        log.error("Command {} should have 1 parameter!",lineTokens[0]);
                        break;
                    }
                    if (lineTokens[1] != null && !lineTokens[1].isEmpty())
                        teams.putIfAbsent(lineTokens[1], new Team(lineTokens[1]));
                    else log.error("Name of the team cannon be empty!");
                    break;
                }
                case "add": {
                    if (lineTokens.length != 8) {
                        log.error("Command {} should have 7 parameters!",lineTokens[0]);
                        break;
                    }

                    if (teams.containsKey(lineTokens[1])) {
                        boolean success =  teams.get(lineTokens[1]).addPlayer(new Player(lineTokens[2], Integer.parseInt(lineTokens[3]),
                                Integer.parseInt(lineTokens[4]),
                                Integer.parseInt(lineTokens[5]),
                                Integer.parseInt(lineTokens[6]),
                                Integer.parseInt(lineTokens[7])));
                        if (success) log.info("{} successfully added to {}",lineTokens[2],lineTokens[1]);
                        else log.info("{} not added to {}",lineTokens[2],lineTokens[1]);
                    } else log.error("(addPlayer) Team {} does not exist.",lineTokens[1]);
                    break;
                }
                case "remove": {
                    if (lineTokens.length != 3) {
                        log.error("Command {} should have 2 parameters!",lineTokens[0]);
                        break;
                    }

                    if (teams.containsKey(lineTokens[1])) {
                        boolean success = teams.get(lineTokens[1]).removePlayer(lineTokens[2]);
                        if (success) log.info("{} successfully removed from {}",lineTokens[2],lineTokens[1]);
                        else log.info("{} not removed from {}",lineTokens[2],lineTokens[1]);
                    } else log.error("(removePlayer) Team {} does not exist.",lineTokens[1]);
                    break;
                }

                case "rating": {
                    if (lineTokens.length != 2) {
                        log.error("Command {} should have 1 parameter!",lineTokens[0]);
                        break;
                    }

                    if (teams.containsKey(lineTokens[1])) {
                        log.info("Team rating of {} is : {}", lineTokens[1], teams.get(lineTokens[1]).getRating());
                    } else log.error("(rating) Team {} does not exist.",lineTokens[1]);
                    break;
                }
                case "showteam" : {
                    if (lineTokens.length != 2) {
                        log.error("Command {} should have 1 parameter!",lineTokens[0]);
                        break;
                    }

                    if (teams.containsKey(lineTokens[1])) {
                        log.info("Players in {} \n {}", lineTokens[1],teams.get(lineTokens[1]).toString());
                    } else log.error("(showTeam) Team {} does not exist.",lineTokens[1]);
                    break;

                }

                case "end" : {
                    continueReading = false;
                    break;
                }
                default: {
                    log.error("{} Unrecognized command", lineTokens[0]);
                    break;
                }
            }
        }

    }
}
