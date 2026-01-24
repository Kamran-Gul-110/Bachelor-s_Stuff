#include<iostream>
using namespace std;
int main(){
    int rows,cols;
    cout<<"Enter rows: ";
    cin>>rows;
    cout<<"Enter columns: ";
    cin>>cols;
    
    for( int i = 1; i<=rows; i++){
         for(int j = 1; j<=cols; j++){
         cout<<i<<" ";}
         cout<<endl;
         }

 cout<<endl;
 system("PAUSE");
 return 0;
}
