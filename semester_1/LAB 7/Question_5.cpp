#include <iostream>
using namespace std;
int sum(int start, int end, int n){
		int s=0;
		for (int i=start+1;i<end;i++){
			if(i%n==0){
				cout<<i<<" ";
			}
		}
		
	}
int main() {
	int s,e,n;
	cout<<"Enter start value: ";
	cin>>s;
	cout<<"Enter end value: ";
	cin>>e;
	cout<<"Enter n: ";
	cin>>n;
	
	sum(s,e,n);
	
cout<<endl;
system("PAUSE");
return 0;
}
