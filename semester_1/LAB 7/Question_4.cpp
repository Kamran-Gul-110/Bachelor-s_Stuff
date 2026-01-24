#include <iostream>
using namespace std;
int sum(int start, int end){
		int s=0;
		for (int i=start+1;i<end;i++){
			s +=i;
		}
		return s;
	}
int main() {
	int s,e;
	cout<<"Enter start value: ";
	cin>>s;
	cout<<"Enter end value: ";
	cin>>e;
	
	int a =sum(s,e);
	cout<<"The sum of all number between is "<<a;
	
cout<<endl;
system("PAUSE");
return 0;
}
