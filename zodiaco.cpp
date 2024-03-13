#include <iostream>
using namespace std;

int main() {
  
    string signos[12] = {"Aries", "Tauro", "Géminis", "Cáncer", "Leo", "Virgo",
    "Libra", "Escorpio", "Sagitario", "Capricornio", "Acuario", "Piscis"};

	string categorias [12] = {"Fuego", "tierra", "aire", "agua", "Fuego", "tierra", "aire", "agua","Fuego", "tierra", "aire", "agua",};
	
    cout << "Listado de signos del zodiaco con sus numeros asociados:" << endl;
    for (int i = 0; i < 12; ++i) {
        cout << i + 1 << ". " << signos[i] << endl;
    }

    int numero;
    cout << "Ingrese un numero asociado a un signo del zodiaco: ";
    cin >> numero;

    if (numero >= 1 && numero <= 12) {
     
        cout << "la catergoria del zodiaco asociado al numero " << numero << " es: " << categorias [numero - 1]<< endl;
    } else {
     
        cout << "ERROR: " << numero << " no esta asociado a ningun signo." << endl;
    }

    return 0;
}
