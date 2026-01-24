#include <iostream>
using namespace std;

int main() {
    int n;
    bool found= false;
    cout << "Enter number: ";
    cin >> n;

    int fib[n+5];

    fib[0] = 0;
    fib[1] = 1;

    for (int i = 2; i < (n+5); i++) {
        fib[i] = fib[i - 1] + fib[i - 2];
    }
    for (int i = 0; i < (n+5); i++) {
        if(fib[i]==n){
        found = true;
    }}
    if(found==true)
    cout<<"This number is INCLUDED in fibancci series";
    else
    cout<<"This number is NOT INCLUDED in fibancci series";
    



 cout<<endl;
 system("PAUSE");
 return 0;
}
