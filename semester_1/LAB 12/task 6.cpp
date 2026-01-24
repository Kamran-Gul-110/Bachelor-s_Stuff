#include<iostream>
using namespace std;
struct student{
			 string name;
			 int age;
			 float cgpa;
			 };
			 
int search_by_name(student arr[4]){
				int ind = 0;
				float high = 0.0;
				for(int i=0;i<=3;i++){
								if(arr[i].cgpa > high){
															 ind = i;
															 high=arr[i].cgpa;
								}
								}
				return ind;
										 }
void print_topper(student arr[4],int a){
		 cout<<"Name of topper: "<<arr[a].name<<endl;
		 cout<<"CGPA: "<<arr[a].cgpa;
		 }
			
int main(){
		student array[4];
		array[0].name = "kamran";
		array[0].age = 18;
		array[0].cgpa = 3.9;
		
		array[1].name = "ali";
		array[1].age = 22;
		array[1].cgpa = 3.7;
		
		array[2].name = "khan";
		array[2].age = 22;
		array[2].cgpa = 4;
		
		array[3].name = "muhammad";
		array[3].age = 22;
		array[3].cgpa = 4.6;

		int x;
	  x= search_by_name(array);
		
		print_topper(array,x);
 cout<<endl;
 system("PAUSE");
 return 0;
}
