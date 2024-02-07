package duban_san;
import java.util.Scanner;
public class calculadora {
    public static void main (String[] args){
        Scanner tem = new Scanner (System.in);
        int num1;
        int num2;
        int res1,res2,res3,res4;
        System.out.println("Ingrese  numero 1 ");
        num1 = tem.nextInt();
        System.out.println("Ingrese  numero 2 ");
        num2 = tem.nextInt();
        res1 = (num1+num2);
        res2 = (num1-num2);
        res3 = (num1*num2);
        res4 = (num1/num2);
        System.out.println("El resultado es:"+res1);
         System.out.println("El resultado es:"+res2);
          System.out.println("El resultado es:"+res3);
           System.out.println("El resultado es:"+res4);
               
    }
}