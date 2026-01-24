#include<iostream>
using namespace std;

    void menu(){
         cout<<"1. Caluculate Distance \n2. Fancy"<<endl;
         cout<<"3. Improved Fancy \n4. Sum of all numbers in range"<<endl;
         }
         
    float distance(float acc, float time, float initial){
	  return initial + (0.5*acc*(time*time));
    }
    
    void printFancy(char x, int num){
	  int i=1;
	  while(i<= num){
		cout<<x;
		i++;
	 }
   } 
   
   void improvedFancy(char x, int num){
	 int i=1;
	 while(i<= num){
   cout<<x<<" ";
   i++;
	}
  } 
  
  int sum(int start, int end){
		int s=0;
		for (int i=start+1;i<end;i++){
			s +=i;
		}
		return s;
	}
	
	void execTask(int opr){
       
       if(opr == 1){
           float a,t,in;
	         cout<<"Enter acceleration: ";
	         cin>>a;
	         cout<<"Enter time: ";
	         cin>>t;
	         cout<<"Enter initial velocity: ";
	         cin>>in;
	
	         float dis = distance(a,t,in);
	         cout<<endl;
	         cout<<"Total Distance is: "<<dis;
           
           }
    else if(opr == 2){
         int n;
	       char x;
         cout<<"Enter character you wanna print: ";
	       cin>>x;
	       cout<<"Enter how many time you wanna print: ";
	       cin>>n;
	
	       printFancy(x,n);
         
         }
    else if(opr == 3){
         int n;
	       char x;
	       cout<<"Enter character you wanna print: ";
	       cin>>x;
	       cout<<"Enter how many time you wanna print: ";
	       cin>>n;
	
	       improvedFancy(x,n);
         
         }
    else if(opr == 4){
         int s,e;
	       cout<<"Enter start value: ";
	       cin>>s;
	       cout<<"Enter end value: ";
	       cin>>e;
	
	       int a =sum(s,e);
	       cout<<"The sum of all number between is "<<a;
         }
    else
    cout<<"Wrong Entry!!!";
       }

int main(){
    int choice;
    menu();
    
    cout<<"Enter Number of Operation you wanna perform: ";
    cin>>choice;
    cout<<endl;
    execTask(choice);
    
    
 cout<<endl;
 system("PAUSE");
 return 0;
}
