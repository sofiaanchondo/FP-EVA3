/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_3_menu;
import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class EVA3_3_MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        int opcion;
        do{
        imprimirMenu();
        opcion = captu.nextInt();
        if(opcion ==1){
            calcularPotencia();
            
        }else if(opcion == 2){
          sumaDosnumeros();  
        }
        
        }while(opcion != 3); 
     
    }
    public static void imprimirMenu(){
     System.out.println("Bienvenido al sistema");
      System.out.println("Selecciona una opcion");
      System.out.println("1-Calcular una potencia");
      System.out.println("2-Sumar dos numeros");
      System.out.println("3-Salir del sistema");
       System.out.println("Selecciona una opcion");
      
    }
public static void calcularPotencia(){
Scanner captu = new Scanner(System.in);
int base,exp;
 System.out.println("CALCULO DE UNA POTENCIA");
  System.out.println("Captura una base");
  base = captu.nextInt();
  System.out.println("Captura el exponente");
  exp = captu.nextInt();
  //Pendiente el calculo
  System.out.println(base + "elevado a " + exp + " = " + calcularpot(base, exp));
 
}
public static int calcularpot(int base, int expo){
int resu = 1; 
for(int i = 1; i <= expo; i++){
resu = resu * base;

}
return resu;

}
public static void sumaDosnumeros(){
    Scanner captu = new Scanner(System.in);
    int num1, num2;
    System.out.println("Suma de dos numeros");
    System.out.println("Numero 1: ");
    num1 = captu.nextInt();
    System.out.println("Numero 2");
    num2 = captu.nextInt();
    System.out.println(num1 + "+" + num2 + " = " + sumanumeros(num1, num2));
  
}
public static int sumanumeros(int num1, int num2){
int resu = num1 + num2;
return resu;
}

}