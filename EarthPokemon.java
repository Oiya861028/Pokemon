public class EarthPokemon extends AbstractPokemon{
    public EarthPokemon(String name, String type){
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
