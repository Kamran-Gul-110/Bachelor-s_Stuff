#include<iostream>
using namespace std;
int main(){
    char nationality;
    int age,education;
    
    cout<<"Enter your Nationality - Pakistan/Kashmir: (p/k) ";
    cin>>nationality;
    cout<<"Enter your age: ";
    cin>>age;
    cout<<"Enter your education in years: ";
    cin>>education;
    
    if (
       (nationality == 'p' || nationality == 'k') &&
       (age>=18 && age <=22) &&
       (education >= 12)
       )
           
           cout<<"Congrats! \nYou are Eligible to Apply";
    else
           cout<<"Huuuh! \nYou are not eligible to apply ";                                          
                                           
 cout<<endl;
 system("PAUSE");
 return 0;
}
