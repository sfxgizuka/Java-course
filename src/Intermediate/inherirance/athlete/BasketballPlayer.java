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
}
