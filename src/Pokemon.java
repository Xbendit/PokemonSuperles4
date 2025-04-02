package src;

public abstract class Pokemon {
    private String name;
    private Integer level;

    //constructor
    public Pokemon(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    // methodes
    abstract void eats();

    abstract void speaks();


    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
