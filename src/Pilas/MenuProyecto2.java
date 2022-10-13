
package  Pilas;

import javax.swing.JOptionPane;
import practicaexamen1estructuras.Cola;
import practicaexamen1estructuras.Dispositivo;


public class MenuProyecto2 {
    boolean seguir = true;
        Cola colita = new Cola();
        Pila pilita = new Pila();
        //se crean los botones del menu principal
        String[] botones = {"Insertar a la pila", "Mostar cola",
                "Atender dispositivo", "Buscar Persona", "Salir"};

        
        
        
            int opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione una de las siguientes opciones:",
                    "Programa Colas",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    botones, botones[0]);

            switch(opcion){
                case 0:
                    Dispositivo dispositivo= crearDispositivo();// se crea un dispostivo 
                    //con todos los parametros
                    colita.encola(dispositivo);//se encola la persona
                    break;
                case 1:
                    if(pi()){
                        //si la cola está vacía, muestra un mensaje
                           JOptionPane.showMessageDialog
                                (null,"La cola está vacía");
                    }else{
                        //muestra la cola actual
                        JOptionPane.showMessageDialog(null, colita.toString());
                    }
                    
                    break;
                case 2:
                    colita.atiende();
                    break;
                case 3:
                   
                    break;
                case 4:
                    seguir = false;
                    break;
            }
    }        
  


