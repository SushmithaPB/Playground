#include<iostream>
using namespace std;
int main()
{
  int i=2016;
  cin>>i;
  if(i%4==0)
  {
    if(i%100==0)
      cout<<i<<" is not a leap year";
    else
      cout<<i<<" is a leap year";
  }
  else if(i%400==0)
  {
    cout<<i<<" is a leap year";
  }
  else
  {
    cout<<i<<" is not a leap year";
  }
  //Type your code here.
}