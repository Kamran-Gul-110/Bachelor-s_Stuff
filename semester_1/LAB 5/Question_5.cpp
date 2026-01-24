#include <iostream>
#include <cmath>
using namespace std;

int main() {
    int num,i;
    cout << endl;
    cout << "Enter number: ";
    cin >> num;
    int primes[num];
    if (num <= 1) {
            cout << "Not Prime number";
        }
    else {
            
            for (i = 2; i <= sqrt(num); i++) {
            if (num % i == 0) {
               cout << "Not Prime number";
               break;  
                }
            }

            if (i > sqrt(num)) {
                cout << "Prime number";
            }
        }
    
cout << endl;
system("PAUSE");
return 0;
}
