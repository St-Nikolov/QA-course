package com.javalectures.lecture10;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

@Getter
@Slf4j
public class Player {
    private String name;

    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Name cannon be empty!");
        else this.name = name;
    }

    private void setEndurance(int endurance) {
        if (endurance >= 0 && endurance <= 100) this.endurance = endurance;
        else log.error("Endurance should be between 0 and 100.");
    }

    private void setSprint(int sprint) {
        if (sprint >= 0 && sprint <= 100) this.sprint = sprint;
        else log.error("Sprint should be between 0 and 100.");
    }

    private void setDribble(int dribble) {
        if (dribble >= 0 && dribble <= 100) this.dribble = dribble;
        else log.error("Dribble should be between 0 and 100.");
    }

    private void setPassing(int passing) {
        if (passing >= 0 && passing <= 100) this.passing = passing;
        else log.error("Passing should be between 0 and 100.");
    }

    private void setShooting(int shooting) {
        if (shooting >= 0 && shooting <= 100) this.shooting = shooting;
        else  log.error("Shooting should be between 0 and 100.");
    }

    public float getOverallSkill(){
        return (endurance + sprint + dribble + passing + shooting)/5;
    }


}
