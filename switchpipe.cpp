#include <iostream>
using namespace std;
int main()
{
	float cantidad, total, cuota;
	char prestamo;
	cout<<"Indique el prestamo que desea: \n"<<endl;
	cout<<"a) Prestamo a 1 año\n"<<endl;
	cout<<"b) Prestamo de 2 a 3 años\n"<<endl;
	cout<<"c) Prestamo de 4 a 5 años\n"<<endl;
	cout<<"d) Prestamo de 6 a 15 años"<<endl;
	cin>>prestamo;
	cout<<"Ingrese la cantidad del prestamo: "<<endl;
	cin>>cantidad;
	
	switch (prestamo)
	{
		case 'a': case 'A':
		cuota=cantidad*0.01;
		cout<<"El valor de la cuota es: "<<cuota<<endl;
		total=cantidad+(cuota*12);
		cout<<"El total a pagar es: "<<total<<endl;
		break;
		case 'b': case 'B':
		cuota=cantidad*0.02;
		cout<<"El valor de la cuota es: "<<cuota<<endl;
		total=cantidad+(cuota*36);
		cout<<"El total a pagar es: "<<total<<endl;
		break;
		case 'c': case 'C':
		cuota=cantidad*0.05;
		cout<<"El valor de la cuota es: "<<cuota<<endl;
		total=cantidad+(cuota*60);
		cout<<"El total a pagar es: "<<total<<endl;
		break;
		case 'd': case 'D':
		cuota=cantidad*0.010;
		cout<<"El valor de la cuota es: "<<cuota<<endl;
		total=cantidad+(cuota*180);
		cout<<"El total a pagar es: "<<total<<endl;
		break;
		default:
		cout<<"El banco no presta a mas de 15 años";
		
	}
	
	return 0;
}
