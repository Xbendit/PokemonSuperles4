package src;

public class FirePokemon extends Pokemon implements DoubleType {
    private Integer hp;
    private Integer xp;
    private String secondType;



    public FirePokemon(String name, Integer level, Integer hp, Integer xp, String secondType) {
        super(name, level);
        this.hp = hp;
        this.xp = xp;
        this.secondType = secondType;
    }

    @Override
    void eats() {
        System.out.println("Een vuur Pokemon eet een Snikker");

    }

    @Override
    void speaks() {
        System.out.println("Een vuur Pokemon zegt 'FIRE!!' ");

    }

    void fireLash() {
        System.out.println("Pokemon doet fireslash");
    }
    void flameTrower(){
        System.out.println("Pokemon doet flametrower");

    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }

    @Override
    public String getSecondType() {
        System.out.println(secondType);
        return "";
    }
}
