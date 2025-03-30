package src;

public class FirePokemon extends Pokemon {
    private Integer hp;
    private Integer xp;



    public FirePokemon(String name, Integer level, Integer hp, Integer xp) {
        super(name, level);
        this.hp = hp;
        this.xp = xp;
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
}
