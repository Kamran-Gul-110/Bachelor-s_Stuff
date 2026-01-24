#include<iostream>
using namespace std;
struct student{
			 string name;
			 int age;
			 float cgpa;
			 };
int c = 4;	 
void print_student(student arr[20], int size){
		 for(int i=0; i<size; i++){
		 				 cout<<"\nName: "<<arr[i].name<<endl;
		 				 cout<<"Age: "<<arr[i].age<<endl;
		 				 cout<<"CGPA: "<<arr[i].cgpa<<endl;
						 }
		 }
		
void bubble_sort(student arr[20]){
					for (int i=c-1;i>=0;i--){
							for (int j=0;j<i;j++){
									if (arr[j].cgpa > arr[j+1].cgpa){
									student temp = arr[j];
									arr[j] = arr[j+1];
									arr[j+1] = temp;
			}
		}
	}
	
				}
int main(){
		student array[20]= {{"kamran", 18, 3.9} , {"ali", 35, 3.7} , 
										  {"khan", 12, 4}, {"muhammad", 22, 4.6}};

	 			bubble_sort(array);
	 			print_student(array,c);
	 			cout<<endl;
	 			cout<<"...Sorted by CGPA...";

		
 cout<<endl;
 system("PAUSE");
 return 0;
}
