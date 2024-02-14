#include<iostream>
#include<string>
using namespace std;
int a,b,c,pro;
int main()
{
	cout<<" ingrese la primera nota:  ";
	cin>>a;
	cout<<" ingrese la segunda nota:  ";
	cin>>b;
	cout<<" ingrese la tercera nota:  ";
	cin>>c;
	pro=((a+b+c)/3);
	cout << "el promedio es  : "<< pro;
	cout << "\n";
	system("pause");
	return 0 ;
	
	if (pro>=30) {
	cout<<"Aprobo, puedes mejorar." <<endl;
    }else if ((pro>=35) || (pro<40)){
    	cout<<"Aprobo, felicitaciones." << endl;
	}else if ((pro>=41) || (pro<50)){
		cout<<"Excelente."<<endl;
	}else if (pro<30){
		cout<<"Reprobado"<< endl;
	}
}
