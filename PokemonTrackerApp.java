public class PokemonTrackerApp {
    public static void main(String[] args){
        PokemonTracker newTracker = new PokemonTracker();
        PokemonInterface firePokemon1 = new FirePokemon("charmander", "Fire");
        newTracker.addPokemon(firePokemon1);
        firePokemon1.levelUp(100);
        PokemonInterface firePokemon2 = new FirePokemon("Moltre", "Fire, Flying");
        newTracker.addPokemon(firePokemon2);
        PokemonInterface firePokemon3 = new FirePokemon("Torchic", "Fire");
        newTracker.addPokemon(firePokemon3);
        PokemonInterface waterPokemon1 = new WaterPokemon("Turtle", "Water, Earth");
        newTracker.addPokemon(waterPokemon1);
        PokemonInterface waterPokemon2 = new WaterPokemon("Salmon", "Water");
        newTracker.addPokemon(waterPokemon2);
        PokemonInterface earthPokemon1 = new EarthPokemon("Earthworm", "Earth");
        newTracker.addPokemon(earthPokemon1);
        PokemonInterface earthPokemon2 = new EarthPokemon("Centipede", "Earth");
        newTracker.addPokemon(earthPokemon2);
        PokemonInterface grassPokemon1 = new GrassPokemon("Rabbit", "Grass");
        newTracker.addPokemon(grassPokemon1);
        PokemonInterface grassPokemon2 = new GrassPokemon("Sunflower", "Grass");
        newTracker.addPokemon(grassPokemon2);
        System.out.println(newTracker.generateReport());


    }
}
