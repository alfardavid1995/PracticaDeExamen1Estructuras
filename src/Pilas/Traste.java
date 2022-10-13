package  Pilas;

public class Traste {
    private String tipotraste = "";
    private int cantidadCubiertos=0;

    public Traste() {
    }
    
    public Traste(String tipotraste, int cantidadCubiertos){
        this.tipotraste=tipotraste;
        this.cantidadCubiertos=cantidadCubiertos;
    }

    public String getTipotraste() {
        return tipotraste;
    }

    public void setTipotraste(String tipotraste) {
        this.tipotraste = tipotraste;
    }

    public int getCantidadCubiertos() {
        return cantidadCubiertos;
    }

    public void setCantidadCubiertos(int cantidadCubiertos) {
        this.cantidadCubiertos = cantidadCubiertos;
    }

    @Override
    public String toString() {
        return "Traste{" + "tipotraste=" + tipotraste 
                + ", cantidadCubiertos=" + cantidadCubiertos + '}';
    }
    
    
    
}
