import java.util.ArrayList;

public class PokemonTracker {
    private final ArrayList<PokemonInterface> pokemons = new ArrayList<>();
    public void addPokemon(PokemonInterface pokemon){
        pokemons.add(pokemon);
    }
    public String generateReport(){
        String report = "";
        report += pokemons;
        return report;
    }

}
