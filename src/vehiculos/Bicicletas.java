package vehiculos;

public class Bicicletas extends Vehiculos {
    
    private int rodado;
    
    public Bicicletas (String marca, String modelo, String color, int rodado ){
        super(marca, modelo, color);
        this.rodado = rodado;
    }

    @Override
    public void encender(){
        System.out.println("Comenzar a pedaliar mas fuerte que nunca");
    }

    public void encenderMotor(){
        super.encender();
    }
}
