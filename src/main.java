package src;
public class main {
    public static void  main(String[] args){

        FirePokemon charmender = new FirePokemon("Charmender", 10,200,50,"none");
        charmender.eats();
        charmender.speaks();
        WaterPokemon squirtel = new WaterPokemon("Squirtel", 10, 80, "Plankton","none");
        squirtel.surf();
        GrassPokemon balbasar = new GrassPokemon("Balbasar",11,250,80);
        balbasar.speaks();
        ElectricPokemon pikatchu = new ElectricPokemon("Pikachu", 15, 50,"Stones");
        pikatchu.thunderPunch();

        //Dubble type Pokemon
        FirePokemon lavaWhale = new FirePokemon("Lavawhale", 40,1000,1500, "Water");
        System.out.println(lavaWhale.getSecondType());



    }
}
