import java.util.InputMismatchException;
import java.util.*;

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
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        int opcion_usuario = 0;

        //Obtener la priority queue de pacientes
        VectorHeap<Paciente> pacientes = new VectorHeap<>();


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
                }
                else {
                    System.out.println("\n[Por favor ingrese una opcion valida]");
                }

            }
            catch (InputMismatchException ime){
                System.out.println("\n[Por favor ingrese una opcion valida]");
                scan.nextLine();
            }
        }

    }
}
