package vehiculos;

public class Vehiculos {

    protected String marca;
    protected String modelo;
    protected String color;
    protected int velocidadActual;
    protected boolean encendido;

    public Vehiculos(String marca, String modelo, String color){

        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadActual = 0;
        this.encendido = false;
    }

    public void encender(){
        System.out.println("Encendiendo el motor...");
        this.encendido = true;
        System.out.println("Motor en marcha.");
    }

    public int getVelocidadActual(){ return this.velocidadActual; }
    public String getColor(){ return this.color; }
    public String getMarca(){ return this.marca; }
    public String getModelo(){ return this.modelo; }
    public void pintar(String color){ this.color = color; }
    public void frenar(int velocidad){
        if(this.velocidadActual-velocidad >= 0){
            this.velocidadActual -= velocidad; }
        else this.velocidadActual = 0;
    }
}
