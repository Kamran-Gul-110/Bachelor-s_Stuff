#include<iostream>
using namespace std;
int main(){
    int i=1,nCourse,num=1;
    float average,percentage,marks,totalMarks=0;
    cout<<"Enter number of courses you have done... ";
    cin>>nCourse;
    while(i<=nCourse){
                      cout<<"Enter Marks of course "<<num<<" : ";
                      cin>>marks;
                      totalMarks+=marks;
                      num++;
                      i++;
                      }
    cout<<endl;
    average = totalMarks/nCourse; 
    cout<<"Your Average score is :"<<average<<endl; 
    percentage= (totalMarks/(nCourse*50))*100;
    cout<<"Your Percentage  is :"<<percentage<<endl;
    
    if(percentage >=60)
    cout<<"Congrats! You have passed the exam...";
    else
    cout<<"Bad Luck! You are fail...";



 cout<<endl;cout<<endl;
 system("PAUSE");
 return 0;
}
