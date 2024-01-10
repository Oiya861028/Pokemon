public class GrassPokemon extends AbstractPokemon{
    public GrassPokemon(String name, String type){
        super(name, type);
    }
    public void displayStats(){
        System.out.println(
                "Name: "+name +
                        "\nType: "+type+
                        "\nLevel:"+level
        );
    }
}
