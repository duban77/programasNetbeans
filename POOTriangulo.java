package ClasesyObjetos;
import javax.swing.*;
public class Triangulo {
    int opuesto;
    int hipotenusa;
    int adyacente;
    
        public void LeerNumeros2(){
        opuesto=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del cateto opuesto: "));
        hipotenusa=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor de la hipotenusa: "));
        adyacente=Integer.parseInt(JOptionPane.showInputDialog("Digite el valor del cateto adyacente: "));
        System.out.println("Valor del Cateto Opuesto: "+opuesto);
        System.out.println("Valor de la Hipotenusa: "+hipotenusa);
        System.out.println("Valor del Cateto Adyacente: "+adyacente);
    }
        public void resultado(){
            if (opuesto==hipotenusa && opuesto==adyacente && hipotenusa==adyacente){
                System.out.println("El triangulo es equilatero.");
            } else if (opuesto!=hipotenusa && opuesto!=adyacente && hipotenusa!=adyacente){
                System.out.println("El triangulo es escaleno.");
            } else 
                System.out.println("El triangulo es isosceles.");
            }
}
//MAIN

package ClasesyObjetos;

public class Main {
     public static void main (String[] args){
        Triangulo op = new Triangulo();
        op.LeerNumeros2();
        op.resultado();
}
}
