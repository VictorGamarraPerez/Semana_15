/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ordenamientos;
import java.util.Arrays;

/**
 *
 * VICTOR GAMARRA PEREZ
 */
public class OrdSeleccion {

	    public static void main(String[] args) {
        // El arreglo
        int[] arreglo = {30, 28, 11, 96, -5, 21, 18, 12, 22, 30, 97, -1, -40, -500};
        System.out.println("Imprimiendo arreglo antes de ordenar...");
        for (int i : arreglo) {
            System.out.printf("%d, ", i);
        }
        
        ordenarPorSeleccion(arreglo);

        System.out.println("\nImprimiendo arreglo después de ordenar...");
        for (int i : arreglo) {
            System.out.printf("%d, ", i);
        }
            }
    public static void ordenarPorSeleccion(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] > arreglo[j]) {
                    // ...intercambiarlos, es decir, mover el actual a la derecha y el de la derecha al actual
                    int temporal = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = temporal;
                }
            }
        }
    }
}
    
    