package Intermediate.inherirance.athlete;

import java.util.Random;

public class BasketballPlayer extends Athlete {

    double freeThrowPercentage;
    double pointsPerGame;


    public BasketballPlayer(String name, String nickName, int yearOfBorn, String team, double freeThrowPercentage, double pointsPerGame, int gamesPlayed) {
        super(name, nickName, yearOfBorn, team, gamesPlayed);
        this.freeThrowPercentage = freeThrowPercentage;
        this.pointsPerGame = pointsPerGame;

    }

    public void freeThrow(){
        Random randomNumberGenerator = new Random();
        if((randomNumberGenerator.nextDouble() * 100) > freeThrowPercentage){
            System.out.println(name + " Failed to score free throw");
        }else{
            System.out.println(name + " scored free throw");
        }
    }

    @Override
    public void getBio() {
        super.getBio();
        System.out.println("Free throw percentage: "+ freeThrowPercentage);
        System.out.println("Points per game: "+ pointsPerGame);
    }

    @Override
    public void compete() {
        super.compete();
        freeThrow();
    }

    @Override
    public String getBodyType() {
        return "Short and round";
    }

    public void setFreeThrowPercentage(double freeThrowPercentage) {
        this.freeThrowPercentage = freeThrowPercentage;
    }

    public void setPointsPerGame(double pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }
}
