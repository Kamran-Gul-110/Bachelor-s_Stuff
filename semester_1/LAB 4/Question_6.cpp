#include<iostream>
using namespace std;
int main(){
    char ch;
    int costPrice,sellingPrice;
    cout<<"Enter Cost Price: ";
    cin>>costPrice;
    cout<<"Enter Selling Price: ";
    cin>>sellingPrice;
    
    if ( costPrice > sellingPrice){
       cout<<"Your are at loss"<<endl;
       cout<<"Do you want to know how much is the loss?? ";
       cout<<"Press \'c\' to check... ";
       cin>>ch;
       if (ch == 'c' || ch == 'C')
       cout<<"Your Total loss is: "<< costPrice - sellingPrice;
               }
    else{
       cout<<"Your are at Profit"<<endl;
       cout<<"Do you want to know how much is the profit?? ";
       cout<<"Press \'c\' to check... ";
       cin>>ch;
       if (ch == 'c' || ch == 'C')
          cout<<"Your Total profit is: "<< sellingPrice - costPrice;
          }
    
 cout<<endl;
 system("PAUSE");
 return 0;
}
