#include "iostream"
#include "stdlib.h"
using namespace std;
int main()
{
	int contador, n;
	contador=0;
	while(n<10){
		n++;
		{
			if(n%2 == 0)
			{
				contador++;
			}
		}	
	}
	cout<<contador<<endl;
	system("PAUSE");
	return 0;
}
