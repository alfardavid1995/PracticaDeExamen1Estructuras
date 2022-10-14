package  Pilas;

import javax.swing.JOptionPane;

public class Pila {
    private NodoPila cima;
    private int largo;
    private int contClasificado=0;
    private int contNoClasificado=0;

    public Pila() {
        this.cima = null;
        this.largo = 0;
    }

    public int getContClasificado() {
        return contClasificado;
    }

    public void setContClasificado(int contClasificado) {
        this.contClasificado = contClasificado;
    }

    public int getContNoClasificado() {
        return contNoClasificado;
    }

    public void setContNoClasificado(int contNoClasificado) {
        this.contNoClasificado = contNoClasificado;
    }
    
    public boolean Vacia(){ return cima == null;}

    public int tamanio(){ return this.largo;}
    
        public void push(Archivo archivito){
        NodoPila newNode = new NodoPila();
        newNode.setArchivoNodo(archivito);
         if (this.Vacia()){
            this.cima = newNode;
            if(archivito.isClasificado()){
                 contClasificado++;
            }else{
                contNoClasificado++;
            }
        JOptionPane.showMessageDialog(null,"Archivo ingresado con exito");

        }else if(!this.Vacia()&& archivito.isClasificado()){
   //se saca el auxiliar del siguiente a la cima para referenciarlo mas adelante
            NodoPila auxiliar = cima.getSiguiente();
    //se pone el archivo clasificado como siguiente a la cima        
            cima.setSiguiente(newNode);
    //ponemos como siguiente a los datos que ya estaban en la pila
            cima.getSiguiente().setSiguiente(auxiliar);
            contClasificado++;
            JOptionPane.showMessageDialog(null,"Archivo ingresado con exito");
        }
        else{
            newNode.setSiguiente(this.cima);
            this.cima = newNode;
            contNoClasificado++;
            JOptionPane.showMessageDialog(null,"Archivo ingresado con exito");
        }
        this.largo++;
    }
    
       //Metodo para eliminar un node
    public void pop(){
        if (!Vacia()) {
             if(cima.getArchivoNodo().isClasificado()){
                 contClasificado--;
            }else{
                contNoClasificado--;
            }
            JOptionPane.showMessageDialog(null, "POP de archivo: " 
                    + cima.getArchivoNodo().toString());
            // Asigna como primer node al siguiente de la pila.
            this.cima = this.cima.getSiguiente();
            // Decrementa el contador del tamaño de la pila
            this.largo--;
        }
    }

        public String listar(){
        // Crea una copia de la pila.
        String s="";
        
        if(!this.Vacia()){
            
        
        NodoPila aux = cima;
        // Recorre la pila hasta el ultimo node.
        while(aux != null){
            s=s+aux.getArchivoNodo().toString()+"\n-----------------\n"; 
            aux=aux.getSiguiente();
       
        }
        }
        return s;
    }
}
