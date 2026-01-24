#include <iostream>
using namespace std;
int main(){
int angle;
   
        cout<<"Enter angle is degrees: ";
        cin>>angle;
        if (angle >= 0 && angle < 90){
            cout<<"First Quadrant";
        }
        else if(angle >=90 && angle <180){
            cout<<"Second Quadrant";
        }
        else if(angle >=180 && angle <270){
            cout<<"Third Quadrant";
        }
        else if(angle >=270 && angle <360){
            cout<<"Fourth Quadrant";
        }
        else {
            cout<<"You have entered wrong value (>360)";
        }
        return 0;
}