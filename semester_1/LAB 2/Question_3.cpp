#include <iostream>
using namespace std;
int main(){
    float initialVelocity, acceleration, finalVelocity;
    cout<<"Enter initial velocity: ";
    cin>>initialVelocity;
    cout<<"Enter acceleration: ";
    cin>>acceleration;
    finalVelocity = initialVelocity + acceleration;
    cout<<"The final velocity is: "<< finalVelocity;
    return 0;
}