package Intermediate.inherirance.athlete;

public class AthleteApp {
    public static void main(String[] args) {
        BasketballPlayer kobe = new BasketballPlayer("Kobe Bryant", "Black Mamba", 1978, "Lakers", 83.7, 25.0, 1346);
        BasketballPlayer jordan = new BasketballPlayer("Michael Jordan", "MJ", 1963, "Chicago Bulls", 83.5, 30.1, 1072);
        BasketballPlayer magic = new BasketballPlayer("Earvin Johnson", "Magic", 1959, "Lakers", 84.8, 19.5, 906);
        kobe.setTeam("MAn u");
        kobe.setPointsPerGame(160);
        BasketballPlayer[] basketballPlayers = new BasketballPlayer[3];
        basketballPlayers[0] = kobe;
        basketballPlayers[1] = jordan;
        basketballPlayers[2] = magic;

        for(BasketballPlayer basketballPlayer: basketballPlayers){
            System.out.println("--------------------------");
            basketballPlayer.compete();
            System.out.println("--------------------------");
            basketballPlayer.getBio();
        }
        FootballPlayer gregovic = new FootballPlayer("Gregory", "Grogovic", 1960, "Eyimba", 1000, 1200, 400);
        FootballPlayer emma = new FootballPlayer("Emma", "Emma-1", 1962, "Rangers", 1000, 1200, 400);
        emma.setTeam("Shooting stars");
        FootballPlayer[] players = new FootballPlayer[2];
        players[0] = gregovic;
        players[1] = emma;

        for(FootballPlayer player: players){
            System.out.println("--------------------------");
            player.compete();
            System.out.println("--------------------------");
            player.getBio();
        }
    }
}
