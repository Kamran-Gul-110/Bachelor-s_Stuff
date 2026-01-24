#include<iostream>
using namespace std;
struct student{
			 string name;
			 int age;
			 float cgpa;
			 };
			 
int search_by_name(student arr[2],string key){
				bool found = false;
				int ind = -3;
				for(int i=0;i<2;i++){
								if(arr[i].name == key){
															 found=true;
															 ind = i;
								}
				}
				if(found){
									return ind;
									}
				else 
				return -1;
				}
int main(){
		student array[2];
		array[0].name = "kamran";
		array[0].age = 18;
		array[0].cgpa = 3.2;
		
		array[1].name = "ali";
		array[1].age = 22;
		array[1].cgpa = 3.8;

		string n;
		cout<<"Enter name to search: ";
		cin>>n;
		int x;
	  x= search_by_name(array,n);
		
		if(x==-1){
							cout<<"Name not found";
							}
		else
		cout<<"Name found at "<<x<<" index";
 cout<<endl;
 cout<<endl;
 system("PAUSE");
 return 0;
}
