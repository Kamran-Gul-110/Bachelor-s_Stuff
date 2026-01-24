#include <iostream>
using namespace std;
float distance(float acc, float time, float initial);

int main() {
	float a,t,in;
	cout<<"Enter acceleration: ";
	cin>>a;
	cout<<"Enter time: ";
	cin>>t;
	cout<<"Enter initial velocity: ";
	cin>>in;
	
	float dis = distance(a,t,in);
	
	cout<<"Total Distance is: "<<dis;
	
cout<<endl;
system("PAUSE");
return 0;
}

float distance(float acc, float time, float initial){
	return initial+ (0.5*acc*(time*time));
}
