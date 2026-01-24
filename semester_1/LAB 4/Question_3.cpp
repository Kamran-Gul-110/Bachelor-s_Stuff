#include<iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter Number: ";
    cin>>num;
    if(num==0)
       cout<<"The number is zero";
    else if(num > 0)
       if(num % 2 == 0)
          cout<<"The number is POSITIVE and EVEN";
       else
          cout<<"The number is POSITIVE and ODD";
    else if( num < 0)
       if(num % 2 == 0)
          cout<<"The number is NEGATIVE and EVEN";
       else
          cout<<"The number is NEGATIVE and ODD";
         
 cout<<endl;
 system("PAUSE");
 return 0;
}
