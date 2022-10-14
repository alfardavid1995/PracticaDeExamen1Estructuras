package  Pilas;

public class NodoPila {
    private Archivo archivoNodo;
    private NodoPila siguiente;
    
    //constructor para inicializar
    
    public NodoPila() {
        this.archivoNodo = null;
        this.siguiente = null;
    }

    public Archivo getArchivoNodo() {
        return archivoNodo;
    }

    public void setArchivoNodo(Archivo archivoNodo) {
        this.archivoNodo = archivoNodo;
    }

    public NodoPila getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPila siguiente) {
        this.siguiente = siguiente;
    }
}
