#include <iostream>
using namespace std;
int main(){
    float speed, distance, time;
    cout<<"Enter Distance (m): ";
    cin>>distance;
    cout<<"Enter time (s): ";
    cin>>time;
    speed = distance / time;
    cout<<"The speed is: "<< speed;
    return 0;
}