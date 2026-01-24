#include<iostream>
using namespace std;
int main(){
    int a,b,c,volume;
    cout<<"Enter Height: ";
    cin>>a;
    cout<<"Enter Depth: ";
    cin>>b;
    cout<<"Enter width: ";
    cin>>c;
    
    volume = a * b * c;
    
    
    if (volume <= 10)
       cout<<"Extra Small";
    else if (volume <= 25)
       cout<<"Small"; 
       else if (volume <= 75)
       cout<<"Medium";
    else if (volume <= 100)
       cout<<"Large";
    else if (volume <= 250)
       cout<<"Extra Large";      
    else
        cout<<"Extra Extra Large";
        
 cout<<endl;
 system("PAUSE");
 return 0;
}
