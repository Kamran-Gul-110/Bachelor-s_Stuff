#include<iostream>
using namespace std;
int main(){
    int age;
    char status,gender;
    
    cout<<"Enter your Gender (m/f): ";
    cin>>gender;
    cout<<"Enter your marital status (y/n): ";
    cin>>status;
    cout<<"Enter your age: ";
    cin>>age;
    
    if ( status == 'y')
       cout<<"Congrats! \n You are Eligible"<<endl;
    else if( status == 'n' && gender == 'm' && age > 28)
       cout<<"Congrats! \n You are Eligible"<<endl;
    else if( status == 'n' && gender =='f' && age > 22)
       cout<<"Congrats! \n You are Eligible"<<endl;
    else
       cout<<"Sorry! \n You are Not Eligible...";

 cout<<endl;
 system("PAUSE");
 return 0;
}
