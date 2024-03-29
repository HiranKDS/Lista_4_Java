public class App {
    public static void main(String[] args) throws Exception {
        Liquidificador liquidificador = new Liquidificador();
        Microondas microondas = new Microondas();
        Geladeira geladeira = new Geladeira();
        
        Cozinha cozinha = new Cozinha(geladeira, liquidificador, microondas);
    
        System.out.println(liquidificador.observar());
        System.out.println(microondas.observar());
        System.out.println(geladeira.observar());
        cozinha.ligar();

        System.out.println(liquidificador.observar()); 
        System.out.println(microondas.observar()); 
        System.out.println(geladeira.observar());
        cozinha.desligar();

        System.out.println(liquidificador.observar()); 
        System.out.println(microondas.observar()); 
        System.out.println(geladeira.observar());
}
    }