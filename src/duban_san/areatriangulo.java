package duban_san;
import java.util.Scanner;
public class areatriangulo {
    public static void main (String[] args){
        Scanner tem = new Scanner (System.in);
        int num1;
        int num2;
        int res;
        System.out.println("Ingrese  el valor de la base: ");
        num1 = tem.nextInt();
        System.out.println("Ingrese el valor de la altura: ");
        num2 = tem.nextInt();
        res = (num1*num2)/2;
        
        System.out.println("El area del triangulo es"+res);
               
    }
}
