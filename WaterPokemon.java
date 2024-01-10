public class WaterPokemon extends AbstractPokemon{

    public WaterPokemon(String name, String type){
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
