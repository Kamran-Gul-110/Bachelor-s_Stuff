#include<iostream>
using namespace std;

struct student {
					 string name;
					 int age;
					 float cgpa;
					 };
student input_student(){				 
				student std;
    		   cout<<"Enter name: ";
	 				 cin>>std.name;
	 				 cout<<"Enter age: ";
	 				 cin>>std.age;
	 				 cout<<"Enter CGPA: ";
	 				 cin>>std.cgpa;
	 return std;
	 }
void print_student(student std){
		       cout<<endl;
	 				 cout<<"Name: "<<std.name<<endl;
	 				 cout<<"Age: "<<std.age<<endl;
	 				 cout<<"CGPA: "<<std.cgpa<<endl;
					 }
int main(){
		student x=input_student();
		print_student(x);

 cout<<endl;
 system("PAUSE");
 return 0;
}
