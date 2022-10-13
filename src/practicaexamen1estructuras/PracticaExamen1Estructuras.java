package practicaexamen1estructuras;

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
                        if(colita.getFrente().getDispositivo().getPuntuacion()>= 250 && colita.getFrente().getDispositivo().getPuntuacion()<= 500 ){
                            Nodo noditoRevisado=colita.atiende();
                            Dispositivo dispositivoExtraidodelNodoRevisado= noditoRevisado.getDispositivo();
                            colita.encola(dispositivoExtraidodelNodoRevisado);
                            JOptionPane.showMessageDialog(null,
                                    "Dispositivo enviado de nuevo a la cola" + dispositivoExtraidodelNodoRevisado.toString());   
                        }else if(colita.getFrente().getDispositivo().getPuntuacion()< 250){
                            Nodo noditoDesechado=colita.atiende();
                            JOptionPane.showMessageDialog(null,
                                    "Dispositivo desechado totalmente = "+ noditoDesechado.getDispositivo().toString());  
                        }else if(colita.getFrente().getDispositivo().getPuntuacion()> 500){
                            Nodo notidoEnviado=colita.atiende();
                            JOptionPane.showMessageDialog(null,
                                    "Dispositivo enviado al cliente = "+ notidoEnviado.getDispositivo().toString());
                        }  
                    }
                    break;
                    
                    
                    
                            
                            //ignorar de aca para abajo
                    /*
                    if (colita.ColaVacia()){// si la cola esta vacia no haga nada
                        JOptionPane.showMessageDialog
                                (null,"La cola está vacía");
                    }else{
                        Nodo noditoRevisado=colita.atiende();
                        Dispositivo dispositivoExtraidodelNodoRevisado=
                        noditoRevisado.getDispositivo();
                       // el codigo evalua valores entre 250 y 500 y losdevuelve a la cola         
                        if(dispositivoExtraidodelNodoRevisado.getPuntuacion()>=
                                250 && dispositivoExtraidodelNodoRevisado.getPuntuacion()<=500){
                            JOptionPane.showMessageDialog(null,
                                    "Dispositivo enviado de nuevo a la cola");
                            colita.encola(dispositivoExtraidodelNodoRevisado);
                            // el dispositivo es menor a 250 y debereia de elim 
                        }else if(dispositivoExtraidodelNodoRevisado.getPuntuacion()
                                <250){
                            colita.atiende();
                        }else if(dispositivoExtraidodelNodoRevisado.getPuntuacion()
                                >500){
                            JOptionPane.showMessageDialog(null,
                                    "Dispositivo enviado al cliente");
                            colita.atiende();
                        }
                    }

                    break;
*/
                case 3:
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