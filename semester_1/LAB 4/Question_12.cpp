#include<iostream>
#include<string>
using namespace std;
int main(){
    string day;
    int money;
    
    cout<<"Enter the name of the day: ";
    cin>>day;
    cout<<"How much money do you have??? ";
    cin>>money;
    
    if(money >=15){
      if(day=="monday"){
                       if(money <= 50)
                         cout<<"Deal 1";
                       else if(money <= 100)
                         cout<<"Deal 1 | Deal 2";
                       else if(money > 100)
                         cout<<"Deal 1 | Deal 2 | Deal 3 | Complementary Sweets ";
                         }
                         
      
      else if((day=="tuesday") || (day =="wednesday")){
                       if(money <= 50)
                         cout<<"Deal 1";
                       else if( money <= 100)
                         cout<<"Deal 1 | Deal 4";
                       else if(money > 100)
                         cout<<"Deal 1 | Deal 4 | Deal 5 | Complementary Shake ";
                         }
                         

      else if(day=="thursday" || day =="friday"){
                       if(money <= 50)
                         cout<<"Deal 1";
                       else if(money <= 100)
                         cout<<"Deal 1 | Deal 6";
                       else if(money > 100)
                         cout<<"Deal 1 | Deal 6 | Deal 7 | Complementary Falooda ";
                         }
                         

      else if(day=="saturday" || day =="sunday"){
                       if(money <= 50)
                         cout<<"Deal 1 | Complementary Soup";
                       else if( money >= 150)
                         cout<<"One person Buffet";
                       else
                         cout<<"You cant have any deal, buy separately! ";
                         }
                       
      else
          cout<<"Wrong Entry!!!";
          }
      else
         cout<<"You cant have any deal, buy separately! ";


 cout<<endl;
 system("PAUSE");
 return 0;
}
