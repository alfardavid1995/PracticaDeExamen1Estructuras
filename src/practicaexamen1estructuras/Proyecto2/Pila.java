package practicaexamen1estructuras.Proyecto2;

public class Pila {
    private NodoPila cima;
    private int largo;

    public Pila() {
        this.cima = null;
        this.largo = 0;
    }
    public boolean Vacia(){ return cima == null;}

    public int tamanio(){ return this.largo;}

    public void push(Traste trastecito){
        NodoPila newNode = new NodoPila();
        newNode.setTrasteNodo(trastecito);

        if (this.Vacia()){
            this.cima = newNode;
        }
        else{
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
            acomodarCubiertos();
        }
        this.largo++;
    }

    //Metodo para eliminar un node
    public void pop(){
        if (!Vacia()) {
            // Asigna como primer node al siguiente de la pila.
            this.cima = this.cima.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            this.largo--;
        }
    }

    public void acomodarCubiertos(){
        cima.getTrasteNodo().setCantidadCubiertos
                (cima.getTrasteNodo().getCantidadCubiertos()
                        +cima.getSiguiente().getTrasteNodo().getCantidadCubiertos());
        cima.getSiguiente().getTrasteNodo().setCantidadCubiertos(0);
    }

    /*
    public boolean search(int reference) {
        // Crea una copia de la pila.
        Node aux = cima;
        // Bandera para verificar si exist el elemento a search.
        boolean exist = false;
        // Recorre la pila hasta llegar encontrar el node o llegar al final
        // de la pila.
        while (exist != true && aux != null) {
            // Compara si el value del node es igual que al de reference.
            if (reference == aux.getValor) {
                // Cambia el value de la bandera.
                exist = true;
            } else {
                // Avanza al siguiente node.
                aux = aux.getSiguiente();
            }
        }
        // Retorna el value de la bandera.
        return exist;
    }
    */

    /*
        public void popModificado(int reference){
        // Consulta si el value exist en la pila.
        if (search(reference)) {
            // Crea una pila auxiliar para guardar los valuees que se 
            // vayan desapilando de la pila original.
            Node cimapPilaAux = null;
            // Recoore la pila hasta llegar al node que tenga el value
            // igual que el de reference.
            while(reference != cima.getValor()){
                // Crea un node temporal para agregarlos a la pila auxiliar.
                Node temp = new Node();
                // Ingresa el value al node temporal.
                temp.setValor(cima.getValor());
                // Consulta si la pila auxiliar no a sido inicializada.
                if(cimapPilaAux == null){
                    // Inicializa la pila auxiliar.
                    cimapPilaAux = temp;
                }
                // Caso contrario si la pila auxiliar ya contiene elementos
                // los agrega al start.
                else{
                    temp.setSiguiente(cimapPilaAux);
                    cimapPilaAux = temp;
                }
                // Elimina el node del tope de la pila hasta llegar al node
                // que se desea eliminar.
                pop();
            }
            // Elimina el node que coincide con el de reference.
            pop();
            // Regresa los valuees de la pila auxiliar a la pila original
            // mientras la pila auxiliar tenga elementos.
            while(cimapPilaAux != null){
                // Utiliza el metodo push para regresar los elementos a 
                // la pila original.
                push(cimapPilaAux.getValor());
                // Avansa al siguiente node de la pila auxiliar.
                cimapPilaAux = cimapPilaAux.getSiguiente();
            }
            // Libera la memoria utilizada por la pila auxiliar.
            cimapPilaAux = null;
        }
        else{
            System.out.println("El nodo indicado no existe");
        }
    }
    */
        public void listar(){
        // Crea una copia de la pila.
        NodoPila aux = cima;
        // Recorre la pila hasta el ultimo node.
        while(aux != null){
            System.out.println("|\t" + aux.getTrasteNodo().toString()+ "\t|");
            System.out.println("-----------------");
            aux = aux.getSiguiente();
        }
    }
}
