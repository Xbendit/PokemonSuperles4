package src;

public class ElectricPokemon extends Pokemon{
    private Integer height;
    private String food;

    public ElectricPokemon(String name, Integer level, Integer height, String food) {
        super(name, level);
        this.height = height;
        this.food = food;
    }

    @Override
    void eats() {
        System.out.println("Een electric Pokemon eet een Bounty");
    }

    @Override
    void speaks() {
        System.out.println("Een electric Pokemon zegt 'ELECTRIC!!' ");

    }

    void thunderPunch(){
        System.out.println("Pokemon doet Thunderpunch");
    }

    void thunder() {
        System.out.println("Pokemon doet Thunder");

    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
