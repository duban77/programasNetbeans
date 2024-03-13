package ClasesyObjetos;
import javax.swing.*;
public class Cuadrado {
    int lado1;
    int lado2;
    int lado3;
    int lado4;
    int area;
    float perimetro;
    
    public void LeerNumeros1(){
        lado1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        lado2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        lado3=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        lado4=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        public void area(){
            area=lado1*lado2*lado3*lado4;
        }
    }
}
