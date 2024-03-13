package ClasesyObjetos;
import javax.swing.*;
public class Operacion {
    //Atributos
    float numero1;
    float numero2;
    float suma;
    float resta;
    float multiplicacion;
    float division;
    float MOD;
    //Metodos
    public void LeerNumeros(){
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
    }
    //Suma
    public void sumar(){
        suma=numero1+numero2;
    }
    //Resta
    public void resta(){
        resta=numero1-numero2;
    }
    //Multiplicacion
    public void multiplicacion (){
        multiplicacion=numero1*numero2;
    }
    //Division
    public void division (){
        division=numero1/numero2;
    }
    //MOD
    public void MOD(){
        MOD=numero1%numero2;
    }
    public void MostrarResultado (){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
        System.out.println("MOD es: "+MOD);
    }
}

package ClasesyObjetos;
public class Main {
    public static void main(String [] args){
        Operacion op = new Operacion();
        op.LeerNumeros();
        op.sumar();
        op.resta();
        op.multiplicacion();
        op.division();
        op.MOD();
        op.MostrarResultado();
    }
}
