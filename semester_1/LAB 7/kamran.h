#include<iostream>
void fibonacci(int n){
     
     int next, first = 0, second =1;
     
     cout<< first << " " << second << " ";
     for (int i = 0; i<=n; i++){
        next = first + second;
        first = second;
        second = next;
        cout<<next<<" ";
    }
     }
