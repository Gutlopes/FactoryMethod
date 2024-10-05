public class Principal {
    public static void main(String[] args) {

        FabricaBolo fabricaChocolate = new FabricaBoloChocolate();
        FabricaBolo fabricaMorango = new FabricaBoloMorango();
        FabricaBolo fabricaAbacaxi = new FabricaBoloAbacaxi();
        FabricaBolo fabricaCenoura = new FabricaBoloCenoura();

        fabricaChocolate.fazerBolo();
        fabricaAbacaxi.fazerBolo();
        fabricaCenoura.fazerBolo();
        fabricaMorango.fazerBolo();
    }
}
