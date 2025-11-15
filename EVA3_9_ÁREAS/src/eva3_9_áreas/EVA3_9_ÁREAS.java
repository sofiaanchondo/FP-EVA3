/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_9_áreas;
import java.util.Scanner;

/**
 *
 * @author Sofia
 */
public class EVA3_9_ÁREAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int opcion;
        menu();
        System.out.println("Opcion a escoger: ");
        opcion = captu.nextInt();
        if(opcion == 1){
        double radio;
        System.out.println("Cuales es el radio: ");
       radio = captu.nextDouble();
       System.out.println("El circulo de radio " + radio + " tiene un area de:" + calcularArea2(radio));
        
        
        }else if(opcion == 2){
            datosUsuario();
            
        }else if (opcion == 3){
            double base, altura, base2;
       System.out.println("Cuales es la medida de la base: ");
       base = captu.nextDouble();
       System.out.println("Cuales es la medida de la base 2: ");
       base2 = captu.nextDouble();
       System.out.println("Cuales es la medida de la alura: ");
       altura = captu.nextDouble();
       System.out.println("El area del trapecio es: " +  calcularArea3 (base, altura,base2));
       
        }else{
            System.out.println("Opcion no valida");
        }
    }
   public static void datosUsuario(){
       Scanner captu = new Scanner(System.in);
       double base, altura;
       System.out.println("Cuales es la medida de la base: ");
       base = captu.nextDouble();
       System.out.println("Cuales es la medida de la alura: ");
       altura = captu.nextDouble();
       System.out.println("El triangulo de base " + base  + " y altura " + altura + " = " +calcularArea1(base, altura));
   }
    public static double calcularArea1(double base, double altura){
    double resu1 = 1;
    resu1 = base * altura;
    
    return resu1;
    }
    
    public static void menu(){
     System.out.println("---MENU---");
        System.out.println("Calcular area de: ");
        System.out.println("1-circulo");
        System.out.println("2-Rectangulo");
        System.out.println("3-Trapecio");
    } 
    public static double calcularArea2(double radio){
    double resu = 1;
    resu = 3.1416*radio*radio;
    
    return resu;
    }
    
    public static double calcularArea3 (double base, double altura,double base2){
    double resu = 1;
    resu = (base + base2)*altura;
    
    return resu/2;
    }
    
    
}
