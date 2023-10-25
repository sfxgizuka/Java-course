package Intermediate.inherirance.athlete;

public abstract class Athlete {
    String name;
    String nickName;
    int yearOfBorn;
    String team;
    int numberOfCompetitions;

    public Athlete(String name, String nickName, int yearOfBorn, String team, int numberOfCompetitions) {
        this.name = name;
        this.nickName = nickName;
        this.yearOfBorn = yearOfBorn;
        this.team = team;
        this.numberOfCompetitions = numberOfCompetitions;
    }

    public String getName() {
        return name;
    }
    public void getBio(){
        System.out.println(name + " (" + nickName +")");
        System.out.println("Born in " + yearOfBorn);
        System.out.println("Last team is " + team + " and played " + numberOfCompetitions + " games");
    }

    public void compete(){
        System.out.println(name + " took part in a competition");
        numberOfCompetitions++;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public abstract String getBodyType();
}
