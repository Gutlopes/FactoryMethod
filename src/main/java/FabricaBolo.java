public abstract class FabricaBolo {

    public abstract Bolo criarBolo();

    public void fazerBolo(){
        Bolo bolo = criarBolo();
        bolo.preparar();
        System.out.println("Bolo Pronto!!!");
    }
}
