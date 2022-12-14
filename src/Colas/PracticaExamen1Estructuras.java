package Colas;

import javax.swing.JOptionPane;

public class PracticaExamen1Estructuras {

    public static void main(String[] args) {
        
        boolean seguir = true;
        Cola colita = new Cola();
        //se crean los botones del menu principal
        String[] botones = {"Insertar dispositivo", "Mostar cola",
                "Atender dispositivo", "Salir"};

        do{
            int opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione una de las siguientes opciones:",
                    "Programa Colas",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    botones, botones[0]);

            switch(opcion){
                case 0:
                    //se crea un dispostivo con todos los parametros
                    Dispositivo dispositivo= crearDispositivo();
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
                case 2://este case es de atender al primer valor de la cola      
                  if (colita.ColaVacia()){// si la cola esta vacia no haga nada
                        JOptionPane.showMessageDialog
                                (null,"La cola está vacía");
                   }else{
          //si el dispositivo esta entre 250 y 500 lo envia de nuevo a la cola
                      if(colita.getFrente().getDispositivo().getPuntuacion()>= 
                              250 && colita.getFrente().getDispositivo()
                                             .getPuntuacion()<= 500 ){
                          
                            Nodo noditoRevisado=colita.atiende();
                            
                            Dispositivo dispositivoExtraidodelNodoRevisado= 
                                    noditoRevisado.getDispositivo();
                            
                            colita.encola(dispositivoExtraidodelNodoRevisado);
                            
                            JOptionPane.showMessageDialog(null,
                                   "Dispositivo enviado de nuevo a la cola" + 
                                dispositivoExtraidodelNodoRevisado.toString());
                     //si el dispositivo es menor que 250 lo elimina totalmente
                       }else if(colita.getFrente().getDispositivo()
                             .getPuntuacion()< 250){
                            Nodo noditoDesechado=colita.atiende();
                            
                            JOptionPane.showMessageDialog(null,
                                "Dispositivo desechado totalmente = "+ 
                                   noditoDesechado.getDispositivo().toString());
                    //si el dispositivo es mayor que 500 lo envia al cliente        
                      }else if(colita.getFrente().getDispositivo().
                              getPuntuacion()> 500){
                            Nodo notidoEnviado=colita.atiende();
                            
                            JOptionPane.showMessageDialog(null,
                                    "Dispositivo enviado al cliente = "+ 
                                    notidoEnviado.getDispositivo().toString());
                        }  
                    }
                    break;
                case 3:
                    seguir=false;
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