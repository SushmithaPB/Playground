#include<iostream>
using namespace std;
int main()
{
  int n=16,d,c=50;
  float sqroot=1;
  cin>>n;
  while(c>0)
  {
    sqroot=(sqroot+(n/sqroot))/2;
   --c;
  }
  d=n+(int(sqroot)+1);
  cout<<int(d);
  
  //Type your code here.
}