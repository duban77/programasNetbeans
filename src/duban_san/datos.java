package duban_san;
import java.util.Scanner;
public class datos {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //Arreglos para guardar los datos
        String[] nombres = new String[5];
        char[] sexos = new char[5];
        int[] edades = new int[5];
        //Contadores
        int contHombreMayor = 0;
        
       
        //Petición de datos
        for (int i = 0; i < 1; i++) {
            System.out.println("\nDatos usuario " + (i));
            System.out.print("Nombre: ");
            nombres[i] = leer.nextLine();
            System.out.print("Sexo (H-Hombre / M-Mujer: ");
            sexos[i] = leer.nextLine().toUpperCase().charAt(0);
            System.out.print("Edad: ");
            edades[i] = Integer.parseInt(leer.nextLine());
           
            //Computamos Contadores
            if (sexos[i] == 'H') {
                if (edades[i]>=18)
                    contHombreMayor++;
          
            }
        }
       
        //Datos registrados y computados. Mostramos resultados
        System.out.println("\n\n\tDATOS REGISTRADOS");
        System.out.println("\t----- -----------");
        for (int i = 0; i < 1; i++) {
            System.out.print("- " + nombres[i] + "  --  ");
            System.out.print(sexos[i]=='H'?"Hombre":"Mujer");
            System.out.println(" -- " + edades[i]);
        }
       
        System.out.println("\nHombres mayores de edad: " + contHombreMayor);
        
    }
    
}
