#include<iostream>
using namespace std;
int main(){
    float grossSalary,basicSalary,rentalAllowance,dinningAllowance;
    cout<<"Enter your Basic Salary: ";
    cin>>basicSalary;
    
    if(basicSalary < 15000){
                   rentalAllowance = (30.0/100) * basicSalary;
                   dinningAllowance = (15.0/100) * basicSalary;
                   grossSalary = basicSalary + rentalAllowance + dinningAllowance;
                   cout<<"\n\tYour Gross Salary is: "<<grossSalary;
                   }
    else if(basicSalary > 15000 && basicSalary < 20000){
                   rentalAllowance = 6000;
                   dinningAllowance = (20.0/100) * basicSalary;
                   grossSalary = basicSalary + rentalAllowance + dinningAllowance;
                   cout<<"\n\tYour Gross Salary is: "<<grossSalary;
                   }
                   
 cout<<endl;
 cout<<endl;
 system("PAUSE");
 return 0;
}
