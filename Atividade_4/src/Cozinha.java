public class Cozinha {

    private Geladeira geladeira;
    private Liquidificador liquidificador;
    private Microondas microondas;

    public Cozinha(Geladeira geladeira, Liquidificador liquidificador, Microondas microondas) {
        this.geladeira = geladeira;
        this.liquidificador = liquidificador;
        this.microondas = microondas;
    }

    public void desligar() {
        this.liquidificador.desligar();
        this.microondas.desligar();
        this.geladeira.desligar();
    }

    public void ligar() {
        this.liquidificador.ligar();
        this.microondas.ligar();
        this.geladeira.ligar();
    }
}
