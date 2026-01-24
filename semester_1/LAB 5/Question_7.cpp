#include<iostream>
using namespace std;
int main(){
    int num;
    cout<<"Enter number: ";
    cin>>num;
    
    for( int i = 1; i<=num; i++){
                 for (int j = 1; j <= i; j++) {
                 cout << j << "   ";
         }
         cout<<endl;
         }
    int i=1;
    while(i<=num){
                  for (int j =65; j<65+i;j++){
                      cout<<(char)j << "   ";
                      }
                      i++;
                      cout<<endl;
                      }
 cout<<endl;
 system("PAUSE");
 return 0;
}
