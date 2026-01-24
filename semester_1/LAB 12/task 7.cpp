#include<iostream>
using namespace std;
struct student{
			 string name;
			 int age;
			 float cgpa;
			 };
int c = 4;
void add_student(student array[20]){
		 cout<<"Enter name of student: ";
		 cin>>array[c].name;
		 cout<<"Enter age of student: ";
		 cin>>array[c].age;
		 cout<<"Enter cgpa of student: ";
		 cin>>array[c].cgpa;
		 cout<<"Student added..."<<endl;
		 c++;
		 }
			 
void print_student(student arr[20], int size){
		 for(int i=0; i<size; i++){
		 				 cout<<"\nName: "<<arr[i].name<<endl;
		 				 cout<<"Age: "<<arr[i].age<<endl;
		 				 cout<<"CGPA: "<<arr[i].cgpa<<endl;
						 }
		 }
		 
int search_student(student arr[20], string key){
		int ind = -1;
		for(int i=0; i<20; i++){
		 				 if(arr[i].name == key){
						 								ind = i;
														}
						 }
	 return ind;
		
		}
		
void update_cgpa(student arr[20], string key){
		int ind = -1;
		float new_cgpa;
		bool updated = false;
		for(int i=0; i<20; i++){
		 				 if(arr[i].name == key){
						 								cout<<"Enter new cgpa: ";
						 								cin>>new_cgpa;
						 								arr[i].cgpa = new_cgpa;
						 								cout<<"gpa updated...";
						 								updated = true;
						 								break;
														}
								if(!updated){
														 cout<<"student not found";
														 }
														
	 					}
		}

	
				
int main(){
		student array[20]= {{"kamran", 18, 3.9} , {"ali", 35, 3.7} , 
										  {"khan", 12, 4}, {"muhammad", 22, 4.6}};
		while(true){
		
		
		
		cout<<"\n\n\tMENU"<<endl<<endl;
		cout<<"1. Add new student"<<endl;
		cout<<"2. Print all students"<<endl;
		cout<<"3. Search student by name"<<endl;
		cout<<"4. update CPGA"<<endl;
		cout<<"5. EXIT"<<endl;
		
		int choice;
		cout<<endl<<"Enter your choice: ";
		cin>>choice;
		
		if(choice == 1){
							add_student(array);
							cout<<endl;
							}
		else if(choice ==2){
				 print_student(array, c);
				 }
	 else if(choice ==3){
				 string key1;
				 cout<<endl<<"Enter name of student to search: ";
				 cin>>key1;
		
	 			 int x = search_student(array,key1);
				 if(x==-1){
					cout<<"Student not found";
					}
					else
					cout<<"student found at "<< x<<" index";
				 }
	 else if(choice ==4){
	 			string key2;
				 cout<<endl<<"Enter name of student: ";
				 cin>>key2;
				 update_cgpa(array,key2);
				 }
	 else if(choice ==5){
	 			cout<<"T H A N K   Y O U !";
	 			break;
				 }
	 
		 
		
		
		}
		
 cout<<endl;
 system("PAUSE");
 return 0;
}
