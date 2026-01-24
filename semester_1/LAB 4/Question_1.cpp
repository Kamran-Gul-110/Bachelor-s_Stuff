#include<iostream>
using namespace std;
int main(){
    int number1,number2;
    cout<<"Enter value of A: ";
    cin>>number1;
    cout<<"Enter value of B: ";
    cin>>number2;
    
    if(number1 % number2 == 0)
        cout<<number1<<" is divisible by "<<number2;
    else
        cout<<number1<<" is not divisible by "<<number2;


 cout<<endl;
 system("PAUSE");
 return 0;
}
