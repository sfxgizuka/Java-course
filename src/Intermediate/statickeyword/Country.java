package Intermediate.statickeyword;

public class Country {
    private static int numberOfCountries;
    private final String NAME;
    private int population;
    private String capital;

    public Country(String name, int population, String capital) {
        NAME = name;
        this.population = population;
        this.capital = capital;
        numberOfCountries++;
    }

    public void getDetails() {
        System.out.println("Country name: " + NAME + " Population: " + population + " Capital: " + capital);
    }

    public static int getNumberOfCountries() {
        return numberOfCountries;
    }

    public final void increasePopulation(int population) {
        this.population += population;
    }
}
