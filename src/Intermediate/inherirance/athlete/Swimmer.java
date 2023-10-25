package Intermediate.inherirance.athlete;

public class Swimmer extends Athlete implements Swimming{
    private int finaPoints;
    public Swimmer(String name, String nickName, int yearOfBorn, String team, int numberOfCompetitions, int finaPoints) {
        super(name, nickName, yearOfBorn, team, numberOfCompetitions);
        this.finaPoints = finaPoints;
    }

    @Override
    public String getBodyType() {
        return "fat and tall";
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Fina points:" + finaPoints);
    }

    @Override
    public void freestyle() {
        System.out.println("Swimming freestyle");
    }

    @Override
    public void compete() {
        super.compete();
        freestyle();
    }
}
