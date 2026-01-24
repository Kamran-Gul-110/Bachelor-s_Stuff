#include<iostream>
using namespace std;

void swap(int x, int y);
void execTask(int taskNo);
int main(){
    
    int num;
    cout<<"Enter number: ";
    cin>>num;
    
    execTask(num);
    
 cout<<endl;
 system("PAUSE");
 return 0;
}
void swap(int x, int y){
                      int a = x;
	                    x = y;
	                    y = a;
	
	                    cout<<x<<" " <<y;
                     }
void execTask(int taskNo){
     int x,y;
     
     for(int i=1;i<=taskNo;i++){
             cout<<"Enter x: ";
             cin>>x;
             cout<<"Enter y: ";
             cin>>y;
             swap(x,y);
             cout<<endl;
             }}
