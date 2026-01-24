#include<iostream>
#include<string>
using namespace std;
int main(){
    string name;
    char decision;
    while(true){
                cout<<"Enter your name: ";
                cin>>name;
                cout<<"Welcome dear "<<name<<endl;
                cout<<"Do you want to continue (y/n): ";
                cin>>decision;
                if (decision=='n')
                break;
                }

 cout<<endl;
 system("PAUSE");
 return 0;
}
