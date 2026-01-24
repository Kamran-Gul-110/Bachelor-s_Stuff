#include<iostream>
using namespace std;
int main(){
    int a,b,c;
    cout<<"Enter age of Mubashir: ";
    cin>>a;
    cout<<"Enter age of Parkash: ";
    cin>>b;
    cout<<"Enter age of Sooraj: ";
    cin>>c;
    
    if (a<b && a<c )
       cout<<"Mubashir is the Youngest...";
    else if (b<a && b<c )
       cout<<"Parkash is the Youngest...";    
    else
        cout<<"Sooraj is Youngest...";
        
 cout<<endl;
 system("PAUSE");
 return 0;
}
