import java.util.InputMismatchException;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Universidad del Valle de Gautemala
 * Facultad de Ingeniería
 * Departamento de Ciencias de la Computación
 * Algoritmos y Estructuras de datos
 * Profesor. Douglas Barrios
 * @author Maria Isabel Solano 20504
 * @version 1
 */

public class Main {
    public static void main (String[] args) throws FileNotFoundException{

        Scanner scan = new Scanner(System.in);
        int opcion_usuario = 0;

        //Obtener la priority queue de pacientes
        VectorHeap<Paciente> pacientes = new VectorHeap<>();
        pacientes = lectorArchivo();


        //Iniciar el programa
        while (opcion_usuario != 2){
            try {
                System.out.println("______________________________________");
                System.out.println("Qué desea realizar a continuación?\n");
                System.out.println("1) Obtener al siguiente paciente");
                System.out.println("2) Salir del programa\n");

                opcion_usuario = scan.nextInt();

                if (opcion_usuario == 1 ){
                    //obtener al paciente que urge más
                    Paciente actual = pacientes.getFirst();

                    //Imprimir datos del paciente
                    System.out.println("___________");
                    System.out.println("Nombre:\t"+actual.getNombre());
                    System.out.println("Razon:\t"+actual.getRazon());
                    System.out.println("Prioridad:\t"+actual.getPrioridad());
                }

                else if (opcion_usuario == 2){
                    System.out.println("Gracias por utilizar el programa");
                }

                else {
                    System.out.println("\n[Por favor ingrese una opcion valida]");
                }

            }
            catch (InputMismatchException ime){
                System.out.println("\n[Por favor ingrese una opcion valida]");
                scan.nextLine();
            }

            catch (NoSuchElementException nsee){
                System.out.println("<<Ya no hay más pacientes en la lista>>");
                scan.nextLine();
                opcion_usuario = 2;
            }
        }

    }

    /**
     *
     * @return Un vector heap formado por pacientes
     * @throws FileNotFoundException
     */
    public static VectorHeap<Paciente> lectorArchivo() throws FileNotFoundException{
        VectorHeap<Paciente> ListadoPacientes = new VectorHeap<>();
        File pacientes = new File("pacientes.txt");
        Scanner lector = new Scanner(pacientes);
        //inicio del ciclo
        while (lector.hasNextLine()){
            String data = lector.nextLine();
            String[] data_s = data.split(","); //Data separada
            Paciente nuevo = new Paciente(data_s[0],data_s[1],data_s[2]); //Nombre, problema, prioridad
            ListadoPacientes.add(nuevo);
        }
        return ListadoPacientes;
    }
}
