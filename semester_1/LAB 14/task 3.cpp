#include<iostream>
using namespace std;
int main(){
	int array[10];
	int *ptr = array;
	
	for(int i=0; i<10; i++){
		cin>>*ptr;
		array[i]=*ptr;
		ptr+=1;
	}
	int search;
	bool found = false;
	int sum =0;
	cout<<"Enter value to search: ";
	cin>>search;
	for(int i =0; i<10;i++){
		if(search == array[i]){
			found = true;
		}
		if(array[i]%2==0){
			sum +=array[i];
		}
	}
	if(found)
	cout<<"Value found"<<endl;
	else
	cout<<"Value not found"<<endl;
	
	cout<<endl<<"Sum of Numbers divided by 2: "<<sum<<endl;
	cout<<endl<<"Sum of even numbers: "<<sum<<endl;
	
return 0;
}

