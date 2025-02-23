package com.d2.d2_zone.Player;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "D2")
public class Match {
    @Id
    @Column (name = "match_id", unique = true)
    private Long matchId;

    private Integer gameMode;

    private String result;

    private Integer duration;

    private String radiantTeam;

    private String direTeam;

    public Match(Long matchId, Integer gameMode, String result, Integer duration, String radiantTeam, String direTeam) {
        this.matchId = matchId;
        this.gameMode = gameMode;
        this.result = result;
        this.duration = duration;
        this.radiantTeam = radiantTeam;
        this.direTeam = direTeam;
    }

    public Long getMatchId() {
        return matchId;
    }

    public Integer getGameMode() {
        return gameMode;
    }

    public String getResult() {
        return result;
    }

    public Integer getDuration() {
        return duration;
    }

    public String getRadiantTeam() {
        return radiantTeam;
    }

    public String getDireTeam() {
        return direTeam;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }

    public void setGameMode(Integer gameMode) {
        this.gameMode = gameMode;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setRadiantTeam(String radiantTeam) {
        this.radiantTeam = radiantTeam;
    }

    public void setDireTeam(String direTeam) {
        this.direTeam = direTeam;
    }
    

}
