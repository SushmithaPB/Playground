#include<iostream>
using namespace std;
int main()
{
  int i=200,bill;
  cin>>i;
  if(i<=200)
  {
    bill=0.5*i;
    cout<<"Rs."<<bill;
  }
  else if(i<=400)
  {
    bill=(0.65*i)+100;
  cout<<"Rs."<<bill;
  }
   else if(i<=600)
   {
    bill=(0.80*i)+200;
  cout<<"Rs."<<bill;
   }
   else if(i>600)
   {
    bill=(1.25*i)+425;
  cout<<"Rs."<<bill;
   }
  else
  {
    cout<<"nothing";
  }
  
  //Type your code here.
}