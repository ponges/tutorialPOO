package vehiculos;

public class Autos extends Vehiculos{

    private int puertas;
    private int velocidadMaxima;
    private String patente;
    private  boolean sillaDeBebe;

    public void ponerSillaBebe(){sillaDeBebe = true;}
    public void sacarSillaBebe(){sillaDeBebe = false;}
    public boolean getSilla(){return sillaDeBebe;}

    public Autos(String marca, String modelo, String color, int puertas, int velocidadActual, int velocidadMaxima, String patente){
        super(marca, modelo, color);
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.patente = patente;
    }
    public int getPuertas(){
        return puertas;
    }
    public void setPuertas(int puertas){
        this.puertas = puertas;
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
    public void acelerar(int velocidad){
        if(this.velocidadActual+velocidad <= this.velocidadMaxima){
        this.velocidadActual += velocidad;
        }
        else this.velocidadActual = this.velocidadMaxima;
    }
}
