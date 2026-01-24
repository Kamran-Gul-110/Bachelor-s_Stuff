#include<iostream>
using namespace std;

bool search_value(int a[2][3], int input){
		 for(int i=0;i<2;i++){
		 for(int j=0;j<3;j++){
						if(a[i][j] == input){
													return true;
													}
						}
						}
		 }
int greater_than_input(int a[][3], int input){
		int count=0;
		for(int i=0;i<2;i++){
		 for(int j=0;j<3;j++){
						if(a[i][j] > input){
													count++;
													}
						}
						}
			return count;
		}
int less_than_input(int a[][3], int input){
		int count=0;
		for(int i=0;i<2;i++){
		 for(int j=0;j<3;j++){
						if(a[i][j] < input){
													count++;
													}
						}
						}
			return count;
		}
int main(){
		//Task a
		cout<<"Task A"<<endl;
		int array[][3]={{1,2,3},
		              {4,5,6}};
		
		cout<<array[0][0]<<" "<<array[0][1]<<" "<<array[0][2]<<" ";
		cout<<endl;
		cout<<array[1][0]<<" "<<array[1][1]<<" "<<array[1][2]<<" ";

		//Task b
		cout<<"\nTask B"<<endl;
		int arr2[2][3]={};
		cout<<"\nEnter 6 numbers to store: "<<endl;
		for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
						int num;
						cout<<"Enter number: ";
						cin>>num;
						arr2[i][j] = num;
						}
						}
						
		for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
						cout<<arr2[i][j]<<" ";
						}
						cout<<endl;
						}
						
		//Task c
		cout<<"\nTask C"<<endl;
		cout<<"Value at first row, third column: "<<arr2[0][2]<<endl;
		
		//Task d
		cout<<"\nTask D"<<endl;
		arr2[1][1] = 20;
		cout<<"Array Updated successfully!!!"<<endl;
		
		//Task e
	  cout<<"\nTask E"<<endl;
	  cout<<"Even Numbers in an array"<<endl;
	  for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
						if(arr2[i][j] % 2 ==0){
						cout<<arr2[i][j]<<" ";
						}}}
						
		//Task f
		cout<<"\n\nTask F"<<endl;
		cout<<"Values on ODD Columns"<<endl;
	  for(int i=0;i<2;i++){
		for(int j=0;j<3;j++){
						if(j % 2 ==0){
						cout<<arr2[i][j]<<" ";
						}
		}
		cout<<endl;
		}
		
		//Task g
		cout<<"\nTask G"<<endl;
		int input;
		cout<<"Enter value you want to search: ";
		cin>>input;
		
		if(search_value(arr2,input)){
																 cout<<"Value found"<<endl;
																 }
	  else{
	  cout<<"Value not found"<<endl;
		}
		
		//Task h
		cout<<"\nTask H"<<endl;
		int num1;
		cout<<"Enter number: ";
		cin>>num1;
		int x = greater_than_input(arr2,num1);
		cout<<"There are "<<x<<" values greater than input"<<endl;
		
		//Task i
		cout<<"\nTask I"<<endl;
		int num2;
		cout<<"Enter number: ";
		cin>>num2;
		int y = less_than_input(arr2,num2);
		cout<<"There are "<<y<<" values less than input"<<endl;
		
		
	  

 cout<<endl;
 system("PAUSE");
 return 0;
}
