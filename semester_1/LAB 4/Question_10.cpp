#include<iostream>
using namespace std;
int main(){
    int percentage;
    char background;
    
    cout<<"Enter your High School Percentage: ";
    cin>>percentage;
    cout<<"Enter your Background \n(\'e\' for Engineering and \'m\' for Medical (e/m): ";
    cin>>background;
    
    cout<<"\nYou are Eligible for: "<<endl<<endl;
    
    if ( percentage > 50 && background == 'e' )
       cout<<"Computer Science"<<endl;
    if( percentage > 55 && (background == 'e' || background == 'm'))
       cout<<"Software Engineering"<<endl;
    if(percentage > 45)
       cout<<"Buisness Management"<<endl;
    else
       cout<<"Sorry! \n You are Not Eligible...";

 cout<<endl;
 system("PAUSE");
 return 0;
}
