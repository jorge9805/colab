/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static double calcularsalario(int horas, double valor){
        double a;
        if (horas<=40){
        a = horas*valor;  
        }else if(horas<=48){
            a=(40*valor)+((horas-40)*(2*valor));
        }else{
            a=(40*valor)+(8*(2*valor))+((horas-48)*(3*valor));
        }
        return a;
        }
    
           
    public static void main(String[] args) {
        Scanner flujoent= new Scanner(System.in);
        // TODO code application logic here
        String nombre = null;
        int numhoras=0;
        double valorhora =0;
        double valorpagar=0;
        System.out.println("nombre?");
        nombre= flujoent.next();
        System.out.println("horas trabajadas");
        numhoras = flujoent.nextInt();
        System.out.println("valor por hora");
        valorhora=flujoent.nextDouble();
        valorpagar=calcularsalario(numhoras, valorhora);
        System.out.println("nombre"+nombre+"pago"+valorpagar);
    }
    
}
