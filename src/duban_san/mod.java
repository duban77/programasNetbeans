package duban_san;
import java.util.Scanner;
public class mod {
    public static void main (String[] args) {
        Scanner tem = new Scanner (System.in);
        int num1;
        int num2;
        int res;
        System.out.println("Ingrese  numero 1 ");
        num1 = tem.nextInt();
        System.out.println("Ingrese  numero 2 ");
        num2 = tem.nextInt();
        res = (num1%num2);
        
        System.out.println("El resultado es:"+res);
    }
            
    
    
}