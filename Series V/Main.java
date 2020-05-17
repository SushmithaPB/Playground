#include<iostream>
using namespace std;
int main()
{
  int n=4,b=11,i;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i==1)
    {
      cout<<"121"<<" ";
    continue;
    }
    else
    {
      b=b+4;
      cout<<b*b<<" ";
    }
  }
      
    
  //Type your code here.
}