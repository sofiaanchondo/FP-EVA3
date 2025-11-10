/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_modificar_arreglos;

/**
 *
 * @author Sofia
 */
public class EVA3_6_MODIFICAR_ARREGLOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arreglo[] = new int[10];
        int arreglo2[] = new int[20];
        llenarArreglo(arreglo);
        imprimirArreglo(arreglo);
        llenarArreglo(arreglo2);
        imprimirArreglo(arreglo2);
        
        
    }
    public static void llenarArreglo(int arreglo[]){
     for (int i = 0; i < arreglo.length; i++) {
      arreglo[i] = (int)(Math.random() * 100);
      
     }
     
    }
     public static void imprimirArreglo (int arreglo[]){
     for (int i = 0; i< arreglo.length; i++) {
      System.out.print("[" + arreglo[i] + "]");
     }  
      System.out.println("");
     }
}
