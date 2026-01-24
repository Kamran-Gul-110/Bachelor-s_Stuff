#include<iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter any number: "<<endl;
    cin>>num;
    if (num > 0){
        cout<<"The number "<<num<<" is a positive number";
    }
    else if (num == 0 ){
        cout<<"The number "<<num<<" is a equal to zero";
    }
    else if (num < 0){
        cout<<"The number " <<num<<" is negative number";
    }
 cout<<endl;
 system("PAUSE");
 return 0;
}


