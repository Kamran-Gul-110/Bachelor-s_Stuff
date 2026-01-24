#include <iostream>
using namespace std;
int main(){
    float f;
    cout<<"enter temp in ferhenhite: ";
    cin>>f;
    float c = (f - 32) * (5.0/9.0);
    cout<<"The temp in celcius is :" << c;
}