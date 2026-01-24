#include <iostream>
using namespace std;
int main(){
    int chocolatePrice = 20;
    int icecreamPrice = 150;
    int frenchFries = 100;

    int choc_q;
    int ice_q;
    int fries_q;

    cout<<"The price of chocolate is: " << chocolatePrice<<endl;
    cout<<"The price of ice cream is: " << icecreamPrice<<endl;
    cout<<"The price of french fries is: " << frenchFries<<endl;
    cout<<"Enter quantities of items you want: "<<endl;
    cout<<"Chocolates: ";
    cin>>choc_q;
    cout<<"Icecream: ";
    cin>>ice_q;
    cout<<"French Fries: ";
    cin>>fries_q;

    int total_bill = (chocolatePrice * choc_q ) + (icecreamPrice * ice_q) + (frenchFries * fries_q);
    cout<<"Your Total Bill is: "<< total_bill;
    return 0;

}