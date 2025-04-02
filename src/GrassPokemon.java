package src;

public class GrassPokemon extends Pokemon{
    private Integer hp;
    private Integer xp;

    public GrassPokemon(String name, Integer level, Integer hp, Integer xp) {
        super(name, level);
        this.hp = hp;
        this.xp = xp;
    }

    @Override
    void eats() {
        System.out.println("Een grass Pokemon eet een Twixs");
    }

    @Override
    void speaks() {
        System.out.println("Een grass Pokemon zegt 'GRASS!!' ");

    }

    void scratch(){
        System.out.println("Pokemon doet scratch");
    }
    void leaveBlade(){
        System.out.println("Pokemon doet leaveblade");

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
