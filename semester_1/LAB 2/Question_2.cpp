#include <iostream>
using namespace std;
int main(){
    float f;
    cout<<"Enter temp in ferhenhite: ";
    cin>>f; // Taking value from user
    float C = (f - 32) * (5.0/9.0);
    cout<<"The temp in celcius is :" << C;
    return 0;
}