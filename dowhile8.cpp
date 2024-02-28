#include <iostream>

int main() {
    int numero = 15;

    std::cout << "Los múltiplos de 3 a partir del número 15 hasta 30 son:\n";

    do {
        if (numero % 3 == 0) {
            std::cout << numero << " ";
        }
        numero++;
    } while (numero <= 30);

    std::cout << std::endl;

    return 0;
}
