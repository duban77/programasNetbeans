package duban_san;
import java.util.Scanner;
public class iva {
    public static void main (String[] args){
        Scanner tem = new Scanner (System.in);
        int pro1,res,total;
   
        System.out.println("CALCULADORA DEL IVA ");
     
        System.out.println("INGRESE EL PRIMER PRODUCTO A CALCULAR ");
        pro1 = tem.nextInt();
        res = (pro1*19/100);
        total = (res+pro1);
        System.out.println("El VALOR DEL IVA ES :"+res);
        System.out.println("El TOTAL A PAGAR ES :"+total);
               
    }
}
