
package Colas;

public class Nodo {
    public Nodo() {
    }
    
    public Nodo(Dispositivo dispositivo, Nodo atras) {
        this.dispositivo = dispositivo;
        this.atras = atras;
    }

    private Dispositivo dispositivo;
    private Nodo atras;

    public Dispositivo getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public Nodo getAtras() {
        return atras;
    }

    public void setAtras(Nodo atras) {
        this.atras = atras;
    }

    @Override
    public String toString() {
        return "Nodo{" + "dispositivo=" + dispositivo + ", atras=" + atras + '}';
    }
    

}
