package duban_san;

import javax.swing.JOptionPane;
public class diasvividos {
    public static void main(String[] args){
        String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre");
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese su edad "));
        int resultado = numero * 365;
        if ( nombre.equals("") || numero==0 ){
            JOptionPane.showMessageDialog(null, "Ingrese valores o valores incorrectos");
        }else{
            JOptionPane.showMessageDialog(null,  "Usted se llama "  + nombre + " y tiene " + resultado +  " dias vividos ");
       
                    
        }
    }
    
}
