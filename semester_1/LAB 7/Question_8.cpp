#include <iostream>
#include<cmath>
using namespace std;

float cal(float x){
	return 0.1 + cos(3*x) + 3*sin((1/0.1+pow(x-3,2))) + cos(sqrt(11)*x);
}

int main() {
	float x,a;
	
	cout<<"Enter value of x: ";
	cin>>x;
	a = cal(x);
	cout<<a;
cout<<endl;
system("PAUSE");
return 0;
}
