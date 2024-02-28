#include <iostream>

using namespace std;

int main() {
int numero;

do {
cout << "Ingrese un número entero (0 para salir): ";
cin >> numero;

if(numero != 0) {
cout << "Ha ingresado: " << numero << endl;
}
} while(numero != 0);

out << "Saliendo del programa." << endl;

return 0;
}
