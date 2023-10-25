package Intermediate.inherirance.athlete;

public class FootballPlayer extends Athlete{
    private int passingYards;
    private int completions;
    public FootballPlayer(String name, String nickName, int yearOfBorn, String team, int gamesPlayed, int passingYards, int completions) {
        super(name, nickName, yearOfBorn, team, gamesPlayed);
        this.completions = completions;
        this.passingYards = passingYards;
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Completions: " + completions);
        System.out.println("Passing yards: "+ passingYards);
    }

    @Override
    public String getBodyType() {
        return "Tall dark and handsome";
    }

    public void increaseCompletions(int completions){
        this.completions += completions;
    }

    public void increasePassingYards(int passingYards){
        this.passingYards += passingYards;
    }
}
