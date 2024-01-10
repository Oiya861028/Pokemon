public class FirePokemon extends AbstractPokemon{
    public FirePokemon(String name, String types){
        super(name, types);

    }
    public void displayStats(){
        System.out.println(
                "Name: "+name +
                "\nType: "+type+
                "\nLevel: "+level
        );
    }
}
