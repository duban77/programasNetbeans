#include <iostream>

int main() {
    int acumulado = 0;
    int edad;
    int contador = 0;
    char continuar;

    do {
        std::cout << "Ingrese la edad de la persona " << contador + 1 << ": ";
        std::cin >> edad;

        if (edad >= 18 && edad <= 45) {
            acumulado += edad;
            contador++;
        } else {
            std::cout << "La edad ingresada no está en el rango permitido (18-45)." << std::endl;
        }

        std::cout << "¿Desea ingresar la edad de otra persona? (s/n): ";
        std::cin >> continuar;
    } while (continuar == 's' || continuar == 'S');

    if (contador > 0) {
        std::cout << "El acumulado de las edades de las personas ingresadas es: " << acumulado << std::endl;
    } else {
        std::cout << "No se ingresaron edades válidas." << std::endl;
    }

    return 0;
}
