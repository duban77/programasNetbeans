
package com.mycompany.parciales;
import java.util.Scanner;
public class parcial_1 
        
{   
    public static void main (String []args )
    {
        Scanner tem = new Scanner(System.in);
        int  peso,estatura,edad;
        System.out.println("--INSCRIPCCIONES PARA BALONCESTO--");
        System.out.print("");
        System.out.print("Ingrese su nombre:  ");
        String nombre = tem.nextLine();
        System.out.print("");
        System.out.print("Ingrese su peso:  ");
        peso = tem.nextInt();
        System.out.print("");
        System.out.print("Ingrese su estatura: ");
        estatura = tem.nextInt();
        if(peso<=70&&estatura>=180){
            System.out.print("Estimado "+nombre+" Usted a sido admitido en el equipo de basquetbol");
        } else {
            System.out.print("Estimado "+nombre+" Lamentamos informale que no fue admitido al equipo de basquetbol");
        }        
    }
}
