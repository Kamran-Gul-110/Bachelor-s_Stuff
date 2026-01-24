#include<iostream>
using namespace std;
int main(){
    int account_number,min_balance,current_balance,interest;
    char account_type;
    
    cout<<"Enter account number: ";
    cin>>account_number;
    cout<<"Enter account type"<<endl;
    cout<<"\'s\' for SAVING ACCOUNT and \'c\' for CHECKING ACCOUNT"<<endl;
    cin>>account_type;
    cout<<"Enter minimum balance to maintain: ";
    cin>>min_balance;
    cout<<"Enter current amount: ";
    cin>>current_balance;
    
    if (current_balance < min_balance && account_type == 's'){
                       cout<<"\nyour balance is low!!!"<<endl;
                       cout<<"we have deducted 10$"<<endl;
                       
                       cout<<"\n\t Account Number: "<<account_number<<endl;
                       cout<<"\t Account Type: "<<"Saving Account"<<endl;
                       cout<<"\t Current Balance: "<<current_balance<<endl;
                       cout<<"\t Total after deduction: "<< current_balance - 10 <<endl;
    }
    
    else if(current_balance < min_balance && account_type == 'c'){
                       cout<<"\nyour balance is low!!!"<<endl;
                       cout<<"we have deducted 25$"<<endl;
                       
                       cout<<"\n\t Account Number: "<<account_number<<endl;
                       cout<<"\t Account Type: "<<"Checking Account"<<endl;
                       cout<<"\t Current Balance: "<<current_balance<<endl;
                       cout<<"\t Total after deduction: "<< current_balance - 25<<endl;
    
    }
    
    else if (account_type == 's'){
                     
                     interest = (4.0/100) * current_balance;
                     
                     cout<<"\n\t Account Number: "<<account_number<<endl;
                     cout<<"\t Account Type: "<<" Saving account"<<endl;
                     cout<<"\t Current Balance: "<<current_balance<<endl;
                     cout<<"\t Interest: "<<interest<<endl;
                     cout<<"\t Total: "<< interest + current_balance<<endl;
                                        
                          
}
    else if (account_type == 'c'){
                     
                     if( current_balance <= (min_balance + 5000)){
                            interest = (3.0/100) * current_balance;
                                        }
                     else{
                           interest = (5.0/100) * current_balance;
                                        }
                     
                     cout<<"\n\t Account Number: "<<account_number<<endl;
                     cout<<"\t Account Type: "<<" Checking Account"<<endl;
                     cout<<"\t Current Balance: "<<current_balance<<endl;
                     cout<<"\t Interest: "<<interest<<endl;
                     cout<<"\t Total: "<< interest + current_balance<<endl;
    
}


    

 cout<<endl;
 system("PAUSE");
 return 0;
}
