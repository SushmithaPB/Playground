#include<iostream>
using namespace std;
int main()
{ 
  int n;
 float s=0.0;
  for(int i=0;i<3;)
  {
 cin>>n;
 if(n<0)
 {
  s=s-1;
   break;
 }
   else if(n%2==0)
   {
     s=s-0.5;
   }
 else
 {
 s=s+1;
   i++;
 }
  }
 cout<<s;
   
  //Type your code here.
}