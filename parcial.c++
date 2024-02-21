#include <iostream>
#include <stdio.h>
using namespace std;
int efectivo, debito, credito, valor, descuento1, descuento2, credito1;
int main (int argc, char** argv)
{
    cout<<"Introduzca el valor del celular: "; cin>>valor; //declaramos el valor del celular
    while (efectivo==valor)
    {
          cout<<"Ingrese el monto del efectivo: "; cin>>efectivo;
          descuento1=efectivo%10;
          }
          while(debito==valor)
          {
               cout<<"Ingrese el monto del debito: "; cin>>debito;
               descuento2=debito%5;
               }
               while(credito==valor)
               {
                    cout<<"Ingrese el monto del credito: "; cin>>credito
}
