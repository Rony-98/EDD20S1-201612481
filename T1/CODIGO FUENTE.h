#include <cstdlib>
#include <iostream>

using namespace std;

int main(int argc, char *argv[])

{
	int m;
	cout<<"INGRESE UN NUMERO\n";
	cin>>m;
	cout<<"MATRIZ CUADRADA "<<m<<"*"<<m<<"\n";
	int matriz [m][m];
	for(int i=0; i<m;i++){
		cout<<"\n";
		for(int j=0; j<m; j++){
			if(i==0||j==0||i==m-1||j==m-1)
			cout<<"[1]";
			else
				cout<<"[ ]";

		}
	}
	cout<<"\n";
	system("pause");
	return 0;
}
