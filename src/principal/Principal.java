package principal;

import elementos.Semaforos;
import vehiculos.Autos;
import vehiculos.Bicicletas;
import vehiculos.Camiones;

public class Principal {

    public static void main(String args[]){
        Autos miAuto = new Autos("ford","fiesta", "rojo", 4,0, 300,"ab677mo");
        Camiones miCamion = new Camiones("Scania","A1","Blanco", 2,150,"ABB89",150); 
        Bicicletas miBici = new Bicicletas("Aurora", "Aurorita", "rosa", 14);
        miAuto.encender();
        miCamion.encender();
        miBici.encender();
        miBici.encenderMotor();
    }
}
   