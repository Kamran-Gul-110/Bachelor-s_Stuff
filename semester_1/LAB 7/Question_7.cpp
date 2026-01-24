#include <iostream>
#include<cmath>
using namespace std;
	void choice(double x, double y, char c){
		switch(c){
			case 's':
				cout<< pow(x,2) << " " << pow(y,2);
				break;
			case 'c':
				cout<< pow(x,3) << " " << pow(y,3);
				break;
			case '^':
				cout<< pow(x,y);
				break;
			case 'm':
				cout<< max(x,y);
				break;
			case 'n':
				cout<< min(x,y);
				break;
			case '+':
				cout<< x + y;
				break;
			case '*':
				cout<< x * y;
				break;
			
		}
	}
int main() {
	double a,b;
	char ch;
	cout<<"First Value: ";
	cin>>a;
	cout<<"Second Value: ";
	cin>>b;
	cout<<"Operation: ";
	cin>>ch;
	
	choice(a,b,ch);
	
cout<<endl;
system("PAUSE");
return 0;
}

