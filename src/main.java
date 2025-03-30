package src;
public class main {
    public static void  main(String[] args){

        FirePokemon charmender = new FirePokemon("Charmender", 10,200,50);
        charmender.eats();
        charmender.speaks();
        WaterPokemon squirtel = new WaterPokemon("Squirtel", 10, 80, "Plankton");
        squirtel.surf();
        GrassPokemon balbasar = new GrassPokemon("Balbasar",11,250,80);
        balbasar.speaks();
        ElectricPokemon pikatchu = new ElectricPokemon("Pikachu", 15, 50,"Stones");
        pikatchu.thunderPunch();

    }
}
