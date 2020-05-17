#include<iostream>
using namespace std;
int main()
{
  int n1=0,n2=1,n=7,s=0,i;
  cin>>n;
  for(i=2;i<n;++i)
  {
    s=n1+n2;
    n1=n2;
    n2=s;
  }
    cout<<s;
  //Type your code here.
}