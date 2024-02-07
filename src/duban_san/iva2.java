package duban_san;
import java.util.Scanner;
public class iva2 {
    public static void main (String[] args){
        Scanner tem = new Scanner (System.in);
        int pro1,pro2,pro3,pro4,res1,res2,res3,res4,to1,to2,to3,to4;
   
        System.out.println("CALCULADORA DEL IVA ");
     
        System.out.println("INGRESE EL PRIMER PRODUCTO A CALCULAR "); 
        pro1 = tem.nextInt();
        System.out.println("INGRESE EL SEGUNDO PRODUCTO A CALCULAR ");
        pro2 = tem.nextInt();
        System.out.println("INGRESE EL TERCER PRODUCTO A CALCULAR ");
        pro3 = tem.nextInt();
        System.out.println("INGRESE EL CUARTO PRODUCTO A CALCULAR ");
        pro4 = tem.nextInt();
        res1 = (pro1*19/100);
        res2 = (pro2*19/100);
        res3 = (pro3*19/100);
        res4 = (pro4*19/100);
        to1 = (res1+pro1);
        to2 = (res2+pro1);
        to3 = (res3+pro1);
        to4 = (res4+pro1);
        System.out.println("El IVA DEL PRIMER PRODUCTO ES :"+res1);
        System.out.println("El TOTAL A PAGAR DEL PRIMER PRODUCTO  ES :"+to1);
        System.out.println("El IVA DEL SEGUNDO PRODUCTO ES :"+res2);
        System.out.println("El TOTAL A PAGAR DEL SEGUNDO PRODUCTO  ES :"+to2);
        System.out.println("El IVA DEL TERCER PRODUCTO ES :"+res3);
        System.out.println("El TOTAL A PAGAR DEL TERCER PRODUCTO  ES :"+to3);
        System.out.println("El IVA DEL CUARTO PRODUCTO ES :"+res4);
        System.out.println("El TOTAL A PAGAR DEL CUARTO PRODUCTO  ES :"+to4);
               
    }
}
