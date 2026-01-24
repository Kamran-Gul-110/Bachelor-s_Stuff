#include<iostream>
#include<cstring>
using namespace std;
void comparison(char a[20], char b[20]){
	if(strcmp(a,b) == 0)
	cout<<"Strings are equal";
	else
	cout<<"Strings are not equal";
}
int main(){
	char first[20], second[20];
	cout<<"Enter first string: ";
	cin>>first;
	cout<<"Enter second string: ";
	cin>>second;
	comparison(first,second);

return 0;
}

