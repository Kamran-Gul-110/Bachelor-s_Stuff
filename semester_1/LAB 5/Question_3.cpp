#include<iostream>
using namespace std;
int main(){
    int i=1,nTerms;
    float sum=0,totalSum=0;
    cout<<"Enter number of terms: ";
    cin>>nTerms;
    
    while(i<=nTerms){
                     cout<<"1/"<<i<<" ";
                     sum = 1.0/i;
                     totalSum += sum;
                     i++;
                     if(i<=nTerms)
                     cout<<"+ ";
                     }
    cout<<endl;
    cout<<"The sum of terms is: "<<totalSum;

 cout<<endl;
 system("PAUSE");
 return 0;
}
