package src;

public class WaterPokemon extends Pokemon implements DoubleType{
    private Integer height;
    private String food;
    private String secondType;


    public WaterPokemon(String name, Integer level, Integer height, String food, String secondType) {
        super(name, level);
        this.height = height;
        this.food = food;
        this.secondType = secondType;
    }

    @Override
    void eats() {
        System.out.println("Een water Pokemon eet een Mars");
    }

    @Override
    void speaks() {
        System.out.println("Een water Pokemon zegt 'WATER!!' ");

    }

    // methodes
    void hydroCanon(){
        System.out.println("Pokemon doet hydrocanon");
    }
    void surf(){
        System.out.println("Pokemon doet surf");
    }

    // getters and setters
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

    @Override
    public String getSecondType() {
        return secondType;
    }
}
