#include<iostream>
#include<string>
using namespace std;
int main(){
    string accountNumber;
    int numberOfMinute;
    int dayMinute,nightMinute;
    float bill,dayMinuteTotal,nightMinuteTotal,subTotal;
    char serviceType;
    
    cout<<"Enter Account Number: ";
    cin>>accountNumber;
    cout<<"Enter Service Type: "<<endl;
    cout<<" \'r\' for REGULAR and \'p\' for PREMIUM: ";
    cin>>serviceType;
    
    
    
    if (serviceType=='r' || serviceType=='R' ){
                          bill = 10;
                          cout<<"Enter Number of minutes used: ";
                          cin>>numberOfMinute;
                          cout<<endl;
                          cout<<"Your Account Number: "<<accountNumber<<endl;
                          cout<<"Your Service Type: Regular "<<endl;
                          cout<<"Number of Minutes Used: "<<numberOfMinute<<endl;
                          
                          if(numberOfMinute < 50){
                               cout<<"Your Total bill is: "<<bill<<endl;
                               }
                          else{
                               bill = bill + ((numberOfMinute - 50) * 0.20);
                               cout<<"Your Total bill is: "<< bill <<endl;
                               }
                          }
    else if (serviceType == 'p' || serviceType=='P'){
                            bill = 25;
                            
                            cout<<"Enter number of minutes used in day: ";
                            cin>>dayMinute;
                            cout<<"Enter number of minutes used at night: ";
                            cin>>nightMinute;
                            nightMinuteTotal = (nightMinute - 100) * 0.05;
                            dayMinuteTotal = (dayMinute - 75) * 0.10;
                            cout<<endl;
                            cout<<"Your Account Number: "<<accountNumber<<endl;
                            cout<<"Your Service Type: Premium "<<endl;
                            numberOfMinute = dayMinute + nightMinute;
                            cout<<"Number of Minutes Used: "<<numberOfMinute<<endl;
                            if ( (dayMinute < 75) && (nightMinute < 100) ){
                                 cout<<"Your Total bill is: "<< bill<<endl;
                                 }
                                 
                            else if ( (dayMinute >= 75) && (nightMinute <= 100) ){
                                 cout<<"Your Total bill is: "<< bill + dayMinuteTotal<<endl;
                                 }
                                 
                            else if ( (dayMinute <= 75) && (nightMinute >= 100) ){
                                 cout<<"Your Total bill is: "<< bill + nightMinuteTotal<<endl;
                                 }

                            
                            else {
                                 subTotal = nightMinuteTotal + dayMinuteTotal + bill;
                                 cout<<"Your Total bill is: "<< subTotal <<endl;
                                 }                       
                            }
     else{
          cout<<"Error!!!!!"<<endl;
          cout<<"Wrong Service type";
          }

 cout<<endl;
 system("PAUSE");
 return 0;
}
