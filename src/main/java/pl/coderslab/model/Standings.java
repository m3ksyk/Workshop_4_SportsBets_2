package pl.coderslab.model;

public class Standings {
    private String leagueName;
    private String teamName;
    private int position;

    public Standings(String leagueName, String teamName, int position) {
        this.leagueName = leagueName;
        this.teamName = teamName;
        this.position = position;
    }

    public Standings() {
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
