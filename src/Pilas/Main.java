package Pilas;


import javax.swing.JOptionPane;


public class Main {

    
      public static void main(String[] args) {
        boolean seguir = true;
        Pila pilita = new Pila();
        do{
        // TODO code application logic here

        //se crean los botones del menu principal
        String[] botones = {"Insertar a la pila", "Mostar pila",
                "Pop", "Mostrar cantidad archivos\n clasificados "
                + "/ no clasificados", "Salir"};

            int opcion = JOptionPane.showOptionDialog(null,
                    "Seleccione una de las siguientes opciones:",
                    "Programa Colas",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE, null,
                    botones, botones[0]);

            switch(opcion){
                case 0://{"Insertar a la pila"
                    int cantpaginasArchivo= 
                            Integer.parseInt(JOptionPane.showInputDialog
                                 ("Digite la cantidad de paginas del archivo"));
                    int selectorBoleanDeConfidencialidad= 
                            Integer.parseInt(JOptionPane.showInputDialog
                                  ("Digite si el archivo es clasificado:\n"
                            + "1: Si\n"
                            + "2: No"));
                    boolean archivoConfidencialidad = false;
                    switch(selectorBoleanDeConfidencialidad){
                        case 1:
                            archivoConfidencialidad= true;
                            break;
                        case 2:
                            archivoConfidencialidad = false;
                            break;
                        default:
                            archivoConfidencialidad = false;
                            break;
                    }
                    
                    Archivo archivito = new Archivo(cantpaginasArchivo, 
                            archivoConfidencialidad);
                    
                    pilita.push(archivito);
                    JOptionPane.showMessageDialog
                                (null, "Informacion del "+archivito.toString());

                    break;
             case 1://, "Mostar pila"
                    if (pilita.Vacia()){
                      JOptionPane.showMessageDialog(null, "La pila esta vacia");
                    }else{
                       
                        JOptionPane.showMessageDialog(null,  pilita.listar());
                       
                    } 
                    break;
             case 2://,"Pop", 
                    if (pilita.Vacia()){
                     JOptionPane.showMessageDialog(null, "La pila esta vacia");
                    }else{
                        pilita.pop();
                    } 
                    break;
              case 3://"Mostar cantidad archivos clasificados y no clasificados"
                    JOptionPane.showMessageDialog(null, "Archivos\n"
                        + "Clasificados: "+pilita.getContClasificado()
                        + "\n No clasificados: "+pilita.getContNoClasificado());
                    
                    break;
                case 4://, "Salir"};
                    seguir = false;
                    break;
            }
        }while(seguir);
    }
    }
    

