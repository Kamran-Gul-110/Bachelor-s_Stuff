#include<iostream>
using namespace std;
string checker(string name){
	if((name[0]=='A' || name[0]=='a') && (name[7]=='Z' || name[7]=='z')){
		return "Wow!";
	}
	else
	return "Oh!";
}
int main(){
	string firstname = "Muhammad";
											// Task 1
	cout<<"Task 1"<<endl;
	
	//Part a
	cout<<firstname[0]<<firstname[1]<<firstname[2]<<
		firstname[3]<<firstname[4]<<firstname[5]<<
		firstname[6]<<firstname[7];
	cout<<endl;
	// Part b
	cout<<firstname[0]<<" "<<firstname[1]<<" "<<firstname[2]<<" "<<
		firstname[3]<<" "<<firstname[4]<<" "<<firstname[5]<<" "<<
		firstname[6]<<" "<<firstname[7]<<endl;
	// Part c
	cout<<firstname[0]<<endl;
	cout<<firstname[1]<<endl;
	cout<<firstname[2]<<endl;
	cout<<firstname[3]<<endl;
	cout<<firstname[4]<<endl;
	cout<<firstname[5]<<endl;
	cout<<firstname[6]<<endl;
	cout<<firstname[7]<<endl;
	
	// Task d
	string check;
	check = checker(firstname);
	cout<<endl<<check<<endl;
	
	
											// Task 2
	cout<<"\n\nTask 2"<<endl;
	// Part a
	for(int i=0;i<firstname.length();i++){
		cout<<firstname[i];
	}
	cout<<endl;
	// Part b
	for(int i=0;i<firstname.length();i++){
		cout<<firstname[i]<<" ";
	}
	cout<<endl;
	// Part c
	for(int i=0;i<firstname.length();i++){
		cout<<firstname[i]<<endl;
	}
	cout<<endl;
cout<<endl;
system("PAUSE");
return 0;
}

