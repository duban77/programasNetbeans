
package com.mycompany.tercer_programa;
import java.util.Scanner;
public class tres_articulos
{
    public static void main (String []args)
    {
        Scanner tem = new Scanner (System.in);
        Scanner sc= new Scanner (System.in);
        
        int valor1,valor2,valor3;
        int res,res1;
        String cadena;
        
        System.out.println("primer articulo: ");
        cadena = sc.nextLine();
         System.out.println("valor:");
        valor1 = tem.nextInt ();
         System.out.println("segundo articulo: ");
          cadena = sc.nextLine();
         System.out.println("valor:");
        valor2 = tem.nextInt ();
         System.out.println("tercer articulo:");
         cadena = sc.nextLine();
         System.out.println("valor:");
        valor3 = tem.nextInt ();
        
        res= ((valor1+valor2+valor3)*16)/100;
        res1= ((valor1+valor2+valor3)*10)/100;
        
        if(res>15.000){
             System.out.println("el valor del IVA aplicado es:"+res);
            
        } else {
            if(res1>15.000)
            System.out.println("el valor del IVA aplicado es:"+res1);
            
        }

        
    }
    
}
