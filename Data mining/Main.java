#include<iostream>
using namespace std;
int main()
{
  int n=234,r,sum=0,sum1=0;
  cin>>n;
  while(n>0)
  {
    r=n%10;
    if(r%2==0)
    {
      sum=sum+r;
    }
    else
    {
      sum1=sum1+r;
    }
    n=n/10;
  }
  if(sum==sum1)
  {
    cout<<"Yes";
  }
  else
  {
    cout<<"No";
  }
      
  //Type your code here.
}