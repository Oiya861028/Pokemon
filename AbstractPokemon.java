public abstract class AbstractPokemon implements PokemonInterface{
    protected String name;
    protected String type;
    protected int level=1;
    public AbstractPokemon(String n, String t){
        name = n;
        type = t;
    }
    public String getPokemonName(){
        return name;
    }
    public void setPokemonName(String n){
        name= n;
    }
    public String getType(){
        return type;
    }
    public void setType(String t){
        type = t;
    }
    public int getLevel(){
        return level;
    }
    public void levelUp(){
        level++;
    }
    public void levelUp(int l){
        level += l;
    }
    public String toString(){
        return name +" is type "+type+" and level "+level+"\n";
    }
    public abstract void displayStats();


}
