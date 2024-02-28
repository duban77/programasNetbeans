#include <iostream>
using namespace std;
int main() {
    int numero;
    int mayor = 0; 

    cout << "Ingrese una serie de numeros. Ingrese 0 para terminar." <<endl;

    do {
       cout << "Ingrese un numero: ";
        cin >> numero;

        if (numero > mayor) {
            mayor = numero;
        }

    } while (numero != 0);

    cout << "El mayor numero ingresado es: " << mayor <<endl;

    return 0;
}
