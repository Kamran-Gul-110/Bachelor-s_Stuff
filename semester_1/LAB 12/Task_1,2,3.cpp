#include<iostream>
using namespace std;
struct student {
					 string name;
					 int age;
					 float cgpa;
					 };
int main(){
		
		// Task 1
		student s1 = {"kamran",15,3.2};
		cout<<s1.name<<endl;
		cout<<s1.age<<endl;
		cout<<s1.cgpa<<endl;
		
		// Task 2
		cout<<endl<<".....Task 2....."<<endl;
		student s2;
		cout<<"\nenter name: ";
		cin>>s2.name;
		cout<<"enter age: ";
		cin>>s2.age;
		cout<<"enter cgpa: ";
		cin>>s2.cgpa;
		
		cout<<s2.name<<endl;
		cout<<s2.age<<endl;
		cout<<s2.cgpa<<endl;
					 
	 // Task 3
	 cout<<endl<<".....Task 3....."<<endl;
	 student std[3];
	 for(int i=0;i<3;i++){
	 				 cout<<"Enter name: ";
	 				 cin>>std[i].name;
	 				 cout<<"Enter age: ";
	 				 cin>>std[i].age;
	 				 cout<<"Enter cgpa: ";
	 				 cin>>std[i].cgpa;
					 }
	 for(int i=0;i<3;i++){
	 				 cout<<std[i].name<<" ";
	 				 cout<<std[i].age<<" ";
	 				 cout<<std[i].cgpa<<" ";
	 				 cout<<endl;
					 }
 cout<<endl;
 system("PAUSE");
 return 0;
}
