#include <iostream>
using namespace std;
void printFancy(char x, int num);
int main() {
	int n;
	char x;
	cout<<"Enter character you wanna print: ";
	cin>>x;
	cout<<"Enter how many time you wanna print: ";
	cin>>n;
	
	printFancy(x,n);
	
cout<<endl;
system("PAUSE");
return 0;
}
void printFancy(char x, int num){
	int i=1;
	while(i<= num){
		cout<<x;
		i++;
	}
} 

