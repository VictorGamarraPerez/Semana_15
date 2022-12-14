
package ordenamientos;
import java.util.Arrays;
/**
 *
 * @author
 */
public class OrdIntercambio {
// VICTOR GAMARRA PEREZ
public static void main(String[] args) {
        int numeros[] = {1, 9, 23, 4, 55, 100, 1, 1, 23};
        System.out.println("Antes del metodo del intercambio: " + Arrays.toString(numeros));
        burbuja(numeros);
        System.out.println("Despues del metodo del intercambio: " + Arrays.toString(numeros));
        String[] nombres = {"Leon", "Chris", "Jill", "Wesker", "Ada"};
        System.out.println("Antes del metodo del intercambio: " + Arrays.toString(nombres));
        burbuja(nombres);
        System.out.println("Despues del metodo del intercambio: " + Arrays.toString(nombres));
    }
private static void burbuja(int[] arreglo) {
        for (int x = 0; x < arreglo.length; x++) {
            // Aquí "y" se detiene antes de llegar
            // a length - 1 porque dentro del for, accedemos
            // al siguiente elemento con el índice actual + 1
            for (int y = 0; y < arreglo.length - 1; y++) {
                int elementoActual = arreglo[y],
                        elementoSiguiente = arreglo[y + 1];
                if (elementoActual > elementoSiguiente) {
                    // Intercambiar
                    arreglo[y] = elementoSiguiente;
                    arreglo[y + 1] = elementoActual;
                }
            }
        }
    }
private static void burbuja(String[] arreglo) {
        for (int x = 0; x < arreglo.length; x++) {
            // Aquí "y" se detiene antes de llegar
            // a length - 1 porque dentro del for, accedemos
            // al siguiente elemento con el índice actual + 1
            for (int y = 0; y < arreglo.length - 1; y++) {
                String elementoActual = arreglo[y],
                        elementoSiguiente = arreglo[y + 1];
                if (elementoActual.compareTo(elementoSiguiente) > 0) {
                    // Intercambiar
                    arreglo[y] = elementoSiguiente;
                    arreglo[y + 1] = elementoActual;
                }
            }
        }
    }
}