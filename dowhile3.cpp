#include <iostream>
using namespace std;

int main() {
int numero;
int suma = 0;
cout << "Ingrese números (ingrese 0 para terminar):" << endl;

do {
cout << "Ingrese un número: ";
cin >> numero;
suma += numero;
} while (numero != 0);

cout << "La suma de los números ingresados es: " << suma << endl;

return 0;
}
