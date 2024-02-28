#include <iostream>

int main() {
    int num = 15;
    
    std::cout << "Múltiplos de 3 y 5 simultáneamente entre 15 y 45:\n";
    
    do {
        if (num % 3 == 0 && num % 5 == 0) {
            std::cout << num << " ";
        }
        num++;
    } while (num <= 45);

    std::cout << std::endl;

    return 0;
}
