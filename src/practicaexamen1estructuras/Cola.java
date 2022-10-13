package practicaexamen1estructuras;

import javax.swing.JOptionPane;

public class Cola {
    private Nodo frente;
    private Nodo ultimo;

    public Cola() {
    }
    
    public void encola(Dispositivo dispositivo){
        
        Nodo nodito = new Nodo();
        nodito.setDispositivo(dispositivo);
        nodito.setAtras(null);
        
        if (ColaVacia()){
            //si está vacía el primer nodo lo define como primero y último
            frente = nodito;
            ultimo = nodito;
        }else{
            //si no está vacía el nuevo nodo lo manda de último
            ultimo.setAtras(nodito);
            ultimo = nodito;
        }
    }
    
    public boolean ColaVacia(){
        //para determinar si la cola está vacía
        if (frente==null){
            return true;
        }else {
            return false;
        }
    }
    
    public Nodo atiende(){
        Nodo aux = frente;
        if(frente!=null){
            if (aux.getDispositivo().getPuntuacion()>=500){
                frente=frente.getAtras();
                aux.setAtras(null);
                JOptionPane.showMessageDialog(null,"El dispositivo se envió al cliente");

            }else if(aux.getDispositivo().getPuntuacion()<500 && aux.getDispositivo().getPuntuacion()>250) {
                frente = ultimo;
                frente=frente.getAtras();

                JOptionPane.showMessageDialog(null,"El dispositivo se envio a la cola");
            }else{
                frente=frente.getAtras();
                aux.setAtras(null);
                JOptionPane.showMessageDialog(null,"El dispositivo se desecho");
            }

        }else if(frente==null){
            //Si se intenta atender a alguien, pero la cola está vacía,
            //muestra un mensaje
            JOptionPane.showMessageDialog(null,"La cola está vacía");
        }
        return aux;
    }

    public Nodo getFrente() {
        return frente;
    }

    public void setFrente(Nodo frente) {
        this.frente = frente;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }
    
    
       
    @Override
    public String toString(){
        String stringConTodalaInfodelaCola="";
        Nodo aux=frente;
        while(aux!=null){
            stringConTodalaInfodelaCola=stringConTodalaInfodelaCola
                    +aux.getDispositivo().toString()+"\n"; 
            aux=aux.getAtras();
        }
        stringConTodalaInfodelaCola="<Frente>\n"
                + stringConTodalaInfodelaCola+"<Final>"; 
        return stringConTodalaInfodelaCola;
    }
}