#include<iostream>
using namespace std;
int main(){
    int quantity,price,total;
    cout<<"Enter Quantity of item: ";
    cin>>quantity;
    cout<<"Enter price of item: ";
    cin>>price;
    
    total = quantity * price;
    
    
    if (total> 5000){
       total -= total / 10;
       cout<<"Your Total Bill is: "<<total;
       }
    else
        cout<<"Your Total Bill is: "<<total;
         
 cout<<endl;
 system("PAUSE");
 return 0;
}
