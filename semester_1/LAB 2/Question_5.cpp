#include <iostream>
using namespace std;
int main(){
    float kineticEnergy, mass, velocity;
    cout<<"Enter mass : ";
    cin>>mass;
    cout<<"Enter velocity : ";
    cin>>velocity;
    kineticEnergy = (1 * mass * (velocity * velocity)) / 2.0;
    cout<<"The Kinetic energy is: "<< kineticEnergy;
    return 0;
}