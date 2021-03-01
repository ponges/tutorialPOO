package vehiculos;

public class Camiones extends Vehiculos {
    private int cargaMaxima;
    private int cargaActual;
    private int puertas;
    private int velocidadMaxima;
    private String patente;

    public Camiones(String marca, String modelo, String color, int puertas, int velocidadMaxima, String patente, int cargaMaxima){
        super(marca, modelo, color);
        this.cargaActual = 0;
        this.cargaMaxima = cargaMaxima;
        this.patente = patente;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
    }
    public void acelerar(int velocidad){
        if(this.velocidadActual+velocidad <= this.velocidadMaxima){
            this.velocidadActual += velocidad;
        }
        else this.velocidadActual = this.velocidadMaxima;
    }
    public String getPatente(){
        return patente;
    }
    public void setPatente(String patente){
        this.patente = patente;
    }
    public int getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public void setVelocidadMaxima (int velocidad){
        this.velocidadMaxima = velocidad;
    }
    public int getCargaMaxima(){
        return cargaMaxima;
    }
    public void setCargaMaxima (int cargaMaxima){
        this.cargaMaxima = cargaMaxima;
    }
    public int getCargaActual(){
        return cargaActual;
    }
    public void setCargaActual (int cargaActual){
        this.cargaActual = cargaActual;
    }
    public int getPuertas(){
        return puertas;
    }
    public void setPuertas(int puertas){
        this.puertas = puertas;
    }
}
