package duban_san;
import java.util.Scanner;
public class datos2 {
    public static void datos2 (String nombre,String telefono, String direccion){
        System.out.println ("Tu Nombre Es: " + nombre) ;
        System.out.println ("Tu Telefono Es: " + telefono);
        System.out.println ("Tu Direccion Es: " + direccion);
    }
    

    public static void main (String[] args) {
        Scanner teclado = new Scanner (System. in) ;
        String nombre,telefono,direccion;
        System.out.println ("Dame Tu Nombre");
        nombre = teclado.nextLine ();
        System.out.println ("Introduce Tu Numero De Telefono") ;
        telefono = teclado.next ();
        System.out.println ("Dame Tu Direccion");
        direccion = teclado.next();
        datos2 ( nombre, telefono, direccion) ;
       
    }
}
