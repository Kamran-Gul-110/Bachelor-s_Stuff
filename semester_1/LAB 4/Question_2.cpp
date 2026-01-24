#include<iostream>
using namespace std;
int main(){
    char ch;
    cout<<"Enter a character to check: ";
    cin>>ch;
    
    
    if (ch=='0'  || ch =='1' || ch =='2' || ch =='3'  || ch =='4' || ch =='5'
     || ch =='6'  || ch =='7'  || ch =='8' || ch =='9')
       cout<<"it is a number";
    else if( ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u')
       cout<<"it is a vowel";
    else
       cout<<"it is a consonent";



 cout<<endl;
 system("PAUSE");
 return 0;
}
