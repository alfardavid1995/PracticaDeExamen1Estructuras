
package practicaexamen1estructuras;

import javax.swing.JOptionPane;

public class PracticaExamen1Estructuras {

    public static void main(String[] args) {
        
        boolean seguir = true;
        Cola colita = new Cola();
        //se crean los botones del menu principal
        String[] botones = {"Insertar dispositivo", "Mostar cola",
                "Atender dispositivo", "Buscar Persona", "Salir"};

        do{
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
                    if(colita.ColaVacia()){
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
           
        }while(seguir);
    }        
  
    public static Dispositivo crearDispositivo(){
        int numeroSerie;
        int puntuacion = 0;
      
        numeroSerie = Integer.parseInt(JOptionPane.showInputDialog("Digite el"
                + " numero de serie del dospositivo"));
        
            puntuacion = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite la puntuacion"));
        
        Dispositivo dispositivo = new Dispositivo(numeroSerie, puntuacion);
        return dispositivo;
    }         
        
    }
    

