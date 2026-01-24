#include<iostream>
#include<cstring>
using namespace std;
int main(){
	string firstname, lastname, fullname, email;
	
	cout<<"Enter your first name: ";
	cin>>firstname;
	cout<<"Enter your last name: ";
	cin>>lastname;
	
	fullname = firstname + lastname;
	
	for(int i = 0; i<fullname.length();i++){
		cout<<fullname[i]<<" ";
	}
	cout<<endl;
	for(int i = 0; i<fullname.length();i++){
		cout<<fullname[i];
		if(i==fullname.length()-1) break;
			
		cout<<"-";
	}
	cout<<endl;
	
	email = fullname + "@suk-iba.edu.pk";
	cout<<"Email Adress: "<< email;
	
return 0;
}

