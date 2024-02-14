#include<iostream>
using namespace std;
int main ()
{
	int numero;
	cout<<"Introduzca el valor entero: ";
	cin>>numero;
	
	if (numero == 0){
		cout<<"CERO";
	}else if (numero>0){
		cout<<"POSITIVO";
	}else cout<<"NEGATIVO";
	
	
	return 0;
}
