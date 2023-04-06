public class Liquidificador {
    private boolean ligado;

    public void ligar() {
        this.ligado = true;
    }
    public void desligar() {
        this.ligado = false;
    }
    public boolean isLigado() {
        return this.ligado;
    }
    public String observar() {

        if (this.ligado) {
            return "Liquidificador esta ligado";

        } else {
            return "Liquidificador esta desligado";
            
        }
    }
}
