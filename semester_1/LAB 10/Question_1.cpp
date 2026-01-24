#include<iostream>
using namespace std;

bool searchVal(int input);
int greaterThanValue(int inp);
int lessThanValue(int inp);

int main(){
					 								 //Task A

     int array[] = {55, 63, 78, 98, 10, 24, 32, 55, 20, 47};
     cout<<array[0]<<endl;
     cout<<array[1]<<endl;
     cout<<array[2]<<endl;
     cout<<array[3]<<endl;
     cout<<array[4]<<endl;
     cout<<array[5]<<endl;
     cout<<array[6]<<endl;
     cout<<array[7]<<endl;
     cout<<array[8]<<endl;
     cout<<array[9]<<endl;
     
		 											// Task B
     
     int num;
     cout<<"Enter number N: ";
     cin>>num;
     int b[num];
     for (int i =0; i<num;i++){
		 		  int user_value;
		 		  cout<<"Enter value "<<i+1<<" "; 
		 		  cin>>user_value;
					b[i] = user_value;
				 }
     for (int i =0; i<num;i++){
		 		 cout<<b[i]<<" ";
				 } 
				 
				 	 						 	 			 // Task C
     
     cout<<endl<<array[4]<<endl;;
     
				 												 // Task D
     									 
     array[3] = 20;
     
     							 		 //Task E
	 		 
	 		 cout<<"Odd Elements in Array"<<endl;
     for (int i=0;i<sizeof(array)/sizeof(array[0]);i++){
		 		 if(array[i]%2!=0){
				 									 cout<<array[i]<<" ";
				 }}
     cout<<endl;
     
     											  //Task F
	 		 cout<<"Elements on Odd indices in Array"<<endl;

     for( int i = 1; i<sizeof(array)/sizeof(array[0]); i+=2){
		 			cout<<array[i]<<" ";
					}
					
					 										// Task G
     int n;
		 cout<<" \n Enter number to search: ";
		 cin>>n;
		 int x = searchVal(n);
		 if(x){
		 							 cout<<"Value Found"<<endl;
									 }
		 else
		 cout<<"Value not found"<<endl;
     
     
     															 //Task H
     															 
     int c;
		 cout<<" \n Enter number: ";
		 cin>>c;
		 int y = greaterThanValue(c);
		 cout<<"There are "<< y << " greater numbers then input"<<endl;
     
     
     													 	 // Task I
     
		 cout<<" \n Enter number: ";
		 cin>>c;
		 int z = lessThanValue(c);
		 cout<<"There are "<< z << " less numbers then input";
		 
 cout<<endl;
 system("PAUSE");
 return 0;
}

bool searchVal(int input){
		 int array[] = {55, 63, 78, 98, 10, 24, 32, 55, 20, 47};
		 for(int i=0; i<sizeof(array)/sizeof(array[0]);i++){
		 				 if(array[i]==input) {
							return true;
							}
		 				 else 
							return false;
						 }
}

int greaterThanValue(int inp){
     int count=0;
     int array[] = {55, 63, 78, 98, 10, 24, 32, 55, 20, 47};
		 for(int i=0; i<sizeof(array)/sizeof(array[0]);i++){
		 				 if(array[i]>inp) {
							count++;
							}
						 }
						 return count;
						 }
						 
int lessThanValue(int inp){
     int count=0;
     int array[] = {55, 63, 78, 98, 10, 24, 32, 55, 20, 47};
		 for(int i=0; i<sizeof(array)/sizeof(array[0]);i++){
		 				 if(array[i]<inp) {
							count++;
							}
						 }
						 return count;
						 }
