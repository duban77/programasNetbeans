package duban_san;
import java.util.Scanner;
public class edad {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese el año actual: ");
        int aniActual = sc.nextInt();
        System.out.print("Ingrese su año de nacimiento: " );
        int aniNacimiento = sc.nextInt();
        int edad = aniActual -aniNacimiento;
        System.out.print("Usted tiene " + edad+ "años.");
                
    }
}
