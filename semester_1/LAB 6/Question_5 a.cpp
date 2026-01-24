#include<iostream>
using namespace std;
int main(){
    int rows,cols;
    cout<<"Enter number: ";
    cin>>rows;
    
    for( int i = 1; i<=rows; i++){
         for(int j = 1; j<=i; j++){
         cout<<j<<" ";}
         cout<<endl;
         }

 cout<<endl;
 system("PAUSE");
 return 0;
}
