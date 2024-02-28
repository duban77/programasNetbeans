#include <iostream>

int main() {
    int cantidad;
    double precio;
    double total = 0.0;

    std::cout << "Ingrese la cantidad vendida y su precio. Ingrese 0 en la cantidad para finalizar la factura." << std::endl;

    do {
        std::cout << "Cantidad: ";
        std::cin >> cantidad;

        if (cantidad != 0) {
            std::cout << "Precio: ";
            std::cin >> precio;

            total += cantidad * precio;
        }

    } while (cantidad != 0);

    std::cout << "El total de la factura es: " << total << std::endl;

    return 0;
}
