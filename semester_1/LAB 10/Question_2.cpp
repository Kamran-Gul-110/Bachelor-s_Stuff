#include<iostream>
using namespace std;
void merge(int a[],int b[]){
		 
		int merge_array[]={};
		
		for (int i = 0; i<5; i++){
				merge_array[i] = a[i];
				}
		for (int j = 0; j<5; j++){
				merge_array[j+5] = b[j];
				}
		for (int k = 0; k<10; k++){
				cout<<merge_array[k]<< " ";
				}
		}
		
		
int main(){
		int array1[] = {1,2,3,4,5};
		int array2[]={6,7,8,9,10};
		cout<<"Merge Array => "<<endl<<endl;
		merge(array1,array2);
		

 cout<<endl;
 system("PAUSE");
 return 0;
}
