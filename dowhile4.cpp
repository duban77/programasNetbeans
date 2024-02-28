#include <iostream>

using namespace std;

int main() {
    int numero;
    int suma = 0;
    int contador = 0;
    float promedio;

    cout << "Ingrese una serie de numeros (ingrese 0 para terminar):" << endl;

    do {
        cin >> numero;
        suma += numero;
        contador++;
    } while (numero != 0);

    if (contador > 1) { 
        contador--; 
        promedio = static_cast<float>(suma) / contador;
        cout << "El promedio de los numeros ingresados es: " << promedio << endl;
    } else {
        cout << "No se ingresaron numeros para calcular el promedio." << endl;
    }

    return 0;
}
