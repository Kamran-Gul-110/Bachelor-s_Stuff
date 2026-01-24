#include<iostream>
using namespace std;
int main(){
    
    int startValue,endValue;
    int i,k=1;
    cout<<"Enter Start Value: ";
    cin>>startValue;
    cout<<"Enter End Value: ";
    cin>>endValue;
    int j = endValue - startValue;
    if(j>0)
           cout<<"The difference between numbers is "<< j<<", Therefore, your program will run "<<j<<" times"<<endl<<endl;  
    while(k<=j){
      for(i = startValue; i<endValue; i++){
      cout<<i<<" ";
      }
      cout<<endl;
      k++;
      }

 cout<<endl;
 system("PAUSE");
 return 0;
}
