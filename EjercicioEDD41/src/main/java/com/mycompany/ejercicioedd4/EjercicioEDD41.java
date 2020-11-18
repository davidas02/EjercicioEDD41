/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd4;
import java.util.Scanner;
/**
 *
 * @author David Aparicio Sir
 * In this program we are going to try the conditional if and the loop for
 */
public class EjercicioEDD41 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Here it's the definition of the variables
        Scanner reader=new Scanner(System.in);
   int cinco;
   //Here is where I define the variable cinco
        System.out.println("Introduce el numero que quieras");
        cinco=reader.nextInt();
        //Here it's the conditional if
   if (cinco==5){
       System.out.println("Ha salido el 5");
   }
   else{System.out.println("No ha salido el 5");
   }
   
    
}
}