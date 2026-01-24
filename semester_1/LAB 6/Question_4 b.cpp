#include<iostream>
using namespace std;
int main(){
    int rows,cols,i,j,num=1;
    cout<<"Enter rows: ";
    cin>>rows;
    cout<<"Enter columns: ";
    cin>>cols;
    
    for(i = 1; i<=rows; i++){
         for(j = 1; j<=cols; j++){
         cout<<num<<" ";
         num++;
         }
         cout<<endl;
         }

 cout<<endl;
 system("PAUSE");
 return 0;
}
