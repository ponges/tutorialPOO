package elementos;

public class Semaforos {

    private String color = "verde";
    private String colorPrevio = "amarillo";

    public String getColor() {
        return color;
    }
    public void setColor(String color){
        this.colorPrevio = this.color;
        this.color = color;
    }
    public  void setColor(int color) {
        this.colorPrevio = this.color;
        switch (color) {
            case 1:
                this.color = "verde";
                break;
            case 2:
                this.color = "amarillo";
                break;
            case 3:
                this.color = "rojo";
                break;
        }
    }
    public void setColor(){
        if(color == "verde" || color == "rojo"){
            colorPrevio = color;
            color = "amarillo";
        }else{
            if(colorPrevio == "verde"){
                colorPrevio = "amarillo";
                color = "rojo";
            }else{
                colorPrevio = "amarillo";
                color = "verde";
            }
        }
    }
}
