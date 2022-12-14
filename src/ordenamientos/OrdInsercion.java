
package ordenamientos;

/**
 *
 * @author 
 */
public class OrdInsercion {
//VICTOR GAMARRA PEREZ
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int A[]={5,2,4,6,1,3};
        mostrarArreglo(A);
        ordenarPorInsercion(A);
        mostrarArreglo(A);
        }
    public static void ordenarPorInsercion(int a[]){
        int clave,i,N=a.length;
        for (int j=1;j<N;j++){
            clave=a[j];
            i=j-1;
            while (i>-1 && a[i]>clave){
                a[i+1]=a[i];
                i=i-1;
            }
            a[i+1]=clave;
        }
    }
    public static void mostrarArreglo(int a[]){
        for(int i=1; i<=a.length;i++){
            System.out.print(a[i-1]+" ");
        }
        System.out.print("\n");
    }
}
