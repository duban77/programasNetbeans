package com.mycompany.piper;
import java.util.Scanner;
public class while3 {
    public static void main (String[] args){
        Scanner teclado=new Scanner(System.in);
        int n;
        System.out.print("Ingrese el numero: ");
        n=teclado.nextInt();
        int r=n+30;
        while (n<=r){
            System.out.println(n);
            n+=10;
        }
    }
}
