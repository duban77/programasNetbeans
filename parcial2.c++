#include <iostream>
using namespace std;
float calcularSalarioDiario(float salarioMensual, int diasTrabajados) {
    return salarioMensual / diasTrabajados;
}
bool tieneAuxilioTransporte(float salarioMensual, float smlv) {
    return salarioMensual <= (2 * smlv);
}
int main() {
    float salarioMensual, smlv;
    int diasTrabajados = 30;
    cout << "Ingrese el salario mensual del trabajador: ";
    cin >> salarioMensual;
    cout << "Ingrese el valor del salario mínimo legal vigente: ";
    cin >> smlv;
    float salarioDiario = calcularSalarioDiario(salarioMensual, diasTrabajados);
    bool auxilioTransporte = tieneAuxilioTransporte(salarioMensual, smlv);
    cout << "El salario diario del trabajador es: " << salarioDiario << endl;
    if (auxilioTransporte) {
        cout << "El trabajador tiene derecho a auxilio de transporte." << endl;
    } else {
        cout << "El trabajador no tiene derecho a auxilio de transporte." << endl;
    }
    return 0;
}
