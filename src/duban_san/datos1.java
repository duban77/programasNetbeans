package duban_san;
import java.util.Scanner;
public class datos1 {
    public static void datos1 (String nombre,String edad){
        System.out.println ("Tu Nombre Es: " + nombre) ;
        System.out.println ("Tu edad Es: " + edad);
        
    }
    

    public static void main (String[] args) {
        Scanner teclado = new Scanner (System. in) ;
        String nombre,edad;
        System.out.println ("Dame Tu Nombre");
        nombre = teclado.nextLine ();
        System.out.println ("Introduce Tu edad") ;
        edad = teclado.next ();
        
        datos1 ( nombre, edad ) ;
       
    }
}
