package Intermediate.finalkeyword;

public class Country {
    private final String NAME;
    private int population;
    private String capital;

    public Country(String name, int population, String capital) {
        NAME = name;
        this.population = population;
        this.capital = capital;
    }

    public final void increasePopulation(int population) {
        this.population += population;
    }
}
