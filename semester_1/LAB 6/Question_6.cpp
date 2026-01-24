#include<iostream>
using namespace std;
int main(){
    int rows,cols;
    cout<<"Enter number: ";
    cin>>rows;
    
    for( int i = 0; i<=rows; i++){
         
         for(int s = 0; s<=i; s++){
                 cout<<"  ";
                 }
         for(int j = 1; j<=rows-i; j++){
         cout<<j<<" ";}
         cout<<endl;
         }

 cout<<endl;
 system("PAUSE");
 return 0;
}
