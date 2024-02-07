package duban_san;
import java.util.Scanner;
public class perimetrocuadrado {
    public static void main(String[] args) {
        int lado, resultado;        
        Scanner obj = new Scanner(System.in);
 
        System.out.print("Ingrese lado:\t");
        lado = obj.nextInt();
 
        resultado = (lado*lado);
 
        System.out.println("El perimetro del Cuadrado es:\t"+resultado);
    }
    
}
