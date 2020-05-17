#include<iostream>
using namespace std;
int main()
{
  int num=1729,sum=0;
  cin>>num;
 int n=num;
  
  while(num>0)
  {
   int r=num%10;
    sum=sum+r;
    num=num/10;
  }
  if(n%sum==0)
    cout<<"Harshad Number";
    else
      cout<<"Not Harshad Number";
    
  //Type your code here.
}