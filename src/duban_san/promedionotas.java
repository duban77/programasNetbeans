package duban_san;
import java.util.Scanner;
public class promedionotas {
    public static void main (String[] args){
        Scanner tem = new Scanner (System.in);
        int num1,num2,num3,res1,res2,res3,total;
   
        System.out.println("PROMEDIO DE NOTAS");
     
        System.out.println("INGRESE LA PRIMERA NOTA ");
        num1 = tem.nextInt();
        res1 = (num1*25)/100;
        System.out.println("INGRESE LA SEGUNDA NOTA ");
        num2 = tem.nextInt();
        res2 = (num2*25)/100;
        System.out.println("INGRESE LA TERCER NOTA ");
        num3 = tem.nextInt();
        res3 = (num3*50)/100;
        total = (res1+res2+res3);
         System.out.println("NOTA FINAL: "+total);
        
        
               
    }
}
