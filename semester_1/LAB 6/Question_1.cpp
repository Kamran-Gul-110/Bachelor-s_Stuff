#include<iostream>
using namespace std;
int main(){
    double num1,num2;
    char ch;
    cout<<"Enter first number: ";
    cin>>num1;
    cout<<"Enter second number: ";
    cin>>num2;
    cout<<"Enter operator: ";
    cin>>ch;
    
    switch(ch){
               case '+':
                    cout<<"Sum is "<< num1+num2;
                    break;
               case '-':
                    cout<<"Difference is "<< num1-num2;
                    break;
               case '*':
                    cout<<"Product is "<< num1*num2;
                    break;
               case '/':
                    if(num2==0){
                    cout<<"Cannot divide by zero";
                    }
                    else
                    cout<<"Division is "<< num1/num2;
                    break;
                    }
               
 cout<<endl;
 system("PAUSE");
 return 0;
}
