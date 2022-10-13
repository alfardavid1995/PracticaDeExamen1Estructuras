package practicaexamen1estructuras.Proyecto2;

public class NodoPila {
    private Traste trasteNodo;
    private NodoPila siguiente;
    
    //constructor para inicializar

    public NodoPila() {
        this.trasteNodo = null;
        this.siguiente = null;
    }

    public Traste getTrasteNodo() {
        return trasteNodo;
    }

    public void setTrasteNodo(Traste trastecitoNodo) {
        this.trasteNodo = trastecitoNodo;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
}
