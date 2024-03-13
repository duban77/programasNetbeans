#include <iostream>
using namespace std;
int main() {
    int numero;

    // Solicitar al usuario un número del 1 al 12
    cout << "Opciones de préstamo:" << endl;
    cout << "1. Aries" << endl;
    cout << "2. Tauro" << endl;
    cout << "3. Geminis" << endl;
    cout << "4. Piscis" << endl;
    cout << "5. Cancer" << endl;
    cout << "6. Leo" << endl;
    cout << "7. Virgo" << endl;
    cout << "8. Libra" << endl;
    cout << "9. Escorpio" << endl;
    cout << "10. Sagitario" << endl;
    cout << "11. Capricornio" << endl;
    cout << "12. Acuario" << endl;
    cout << "Ingrese un numero del 1 al 12: ";
    cin >> numero;

    // Utilizar switch para determinar el día de la semana correspondiente
    switch(numero) {
        case 1:
            cout<<"Aries - Fuego\n";
            break;
        case 2:
            cout<<"Tauro - Tierra\n";
            break;
        case 3:
            cout<<"Geminis - Aire\n";
            break;
        case 4:
            cout<<"Piscis - Agua\n";
            break;
        case 5:
            cout<<"Cancer - Agua\n";
            break;
        case 6:
            cout<<"Leo - Fuego\n";
            break;
        case 7:
            cout<<"Virgo - Tierra\n";
            break;
        case 8:
            cout<<"Libra - Aire\n";
            break;
        case 9:
            cout<<"Escorpio - Agua\n";
            break;
        case 10:
            cout<<"Sagitario - Fuego\n";
            break;
        case 11:
            cout<<"Capricornio - Tierra\n";
            break;
        case 12:
            cout<<"Acuerio - Agua\n";
            break;
        default:
            cout << "Número ingresado no válido.\n";
    }

    return 0;
}
