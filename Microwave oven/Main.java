#include<iostream>
using namespace std;
int main()
{
  int n=3;
  float h=5.0,o;
  cin>>n;
  cin>>h;
 if(n==2)
 {
  float a=n*h;
  float b= float (h*50)/100; 
      cout<<a-b;
 }
  else if(n==3)
  {
      o=(h*2); 
      cout<<o;
  }
  else
  {
    cout<<"Number of items is more";
  }
  
  //Type your code here.
}