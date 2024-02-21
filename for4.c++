#include "iostream"
#include "stdlib.h"
using namespace std;
int main()
{
	int contador=0;
	for(int i=0; i<10; i++)
	{
		if(i%2 == 0)
		{
			contador++;
		}
	}
	cout<<contador<<endl;
	system("PAUSE");
	return 0;
}
