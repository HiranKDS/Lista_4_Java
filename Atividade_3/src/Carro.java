public class Carro {

    private String marca;
    private String modelo;
    private String fabricante;
    private Motor motor;

    Carro(String marca, String modelo, String fabricante, Motor motor){
       
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.fabricante = fabricante;
    }

    @Override
    public String toString(){
        return " [Marca: " + marca + ", Modelo: " + modelo + ", Fabricante: " 
        + fabricante + ", Motor: "+ motor.getTipo() + "]";
        
    }
    
}
