#include<iostream>
using namespace std;
int main(){
    int totalAmount;
    cout<<"Enter your total amount: ";
    cin>>totalAmount;
    float zakat = (2.5/100) * totalAmount;
    cout<<"The Zakat you need to pay is: "<< zakat;
    return 0;
}