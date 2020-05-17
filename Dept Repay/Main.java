#include<iostream>
using namespace std;
int main()
{
  int p=100,r=1,y=10;
  float s=0.00,a=0.0,di=0.00,set=0.00;
  cin>>p>>r>>y;
  s=(p*y*r)/100;
  a=p+s;
  di=(0.02*s);
  set=a-di;
  cout<<s<<"\n"<<a<<"\n"<<di<<"\n"<<set;
  
  //Type your code here.
}