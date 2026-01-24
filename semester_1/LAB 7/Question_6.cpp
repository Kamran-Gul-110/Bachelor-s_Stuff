#include <iostream>
using namespace std;
void swap(int x, int y){
  cout<<"Before Swap"<<endl;
  cout<<x<<" "<<y<<endl;
	int a = x;
	x = y;
	y = a;
	cout<<"After Swap"<<endl;
	cout<<x<<" " <<y;
}
int main() {
	swap(2,5);

cout<<endl;
system("PAUSE");
return 0;
}
