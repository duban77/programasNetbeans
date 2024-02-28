#include <iostream>
using namespace std;

int main() {
int contador=0;
float promedio, numero, suma=0;
cout << "Ingrese numeros (ingrese 0 para terminar):" << endl;

do {
cout << "Ingrese un numero: ";
cin >> numero;
suma=suma+numero;
contador ++;
} while (numero != 0);
promedio=suma/(contador-1);

cout<<"\nEl promedio de los numeros es: " << promedio << endl;

return 0;
}
