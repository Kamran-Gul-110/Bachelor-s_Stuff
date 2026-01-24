#include<iostream>
#include<string>
using namespace std;
// 28/12/2000
void extract_info_ask(string a, string b, string c){
	string d = a.substr(0,2);
	int day = stoi(d);
	cout<<"\nDay: "<<day<<endl;
	string m = a.substr(3,2);
	int month = stoi(m);
	cout<<"Month: "<<month<<endl;
	string y = a.substr(6,4);
	int year = stoi(y);
	cout<<"Year: "<<year<<endl;
	
	cout<<endl;
	
	string depart = b.substr(0,3);
	if(depart== "021"){
		cout<<"Media Department";
	}
	else if(depart== "022"){
		cout<<"Buisness Department";
	}
	else if(depart== "023"){
		cout<<"CS Department";
	}
	else
	cout<<"Wrong CMS entered...";
	
	int ad_year = stoi(b.substr(4,2));
	cout<<endl<<"Year of Admission: 20" << ad_year<<endl;
	
	cout<<endl;
	
	string op = c.substr(0,3);
	if(op == "033"){
		cout<<"Ufone operator";
	}
	else if(op == "031"){
		cout<<"Jazz operator";
	}
	else if(op =="034"){
		cout<<"Zong operator";
	}
	else
	cout<<"Wrong number entered...";
}
int main(){
	// Part a
	string date;
	cout<<"Enter Date (dd/mm/yyyy): ";
	cin>>date;
	
	// Part b
	string id;
	cout<<"Enter your CMS id (000-00-0000): ";
	cin>>id;
	
	// Part c
	string phone;
	cout<<"Enter your phone number (0000-0000000): ";
	cin>>phone;
	extract_info_ask(date,id,phone);
	
return 0;
}

