#include<iostream>
using namespace std;
int main(){
    int a,b,c;
    cout<<"enter first side length ";
    cin>>a;
    cout<<"enter second side length ";
    cin>>b;
    cout<<"enter third side length ";
    cin>>c;
    
    if ( a*a == ((b*b) + (c*c))){
         cout<<"it is a right angle triangle";
         }
    else if ( b*b == ((a*a) + (c*c))){
         cout<<"it is a right angle triangle";
         }
    else if ( c*c == ((b*b) + (a*a))){
         cout<<"it is a right angle triangle";
         }
    else{
         cout<<"it is NOT a right angle triangle";
         }
    



 cout<<endl;
 system("PAUSE");
 return 0;
}
