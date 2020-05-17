#include<iostream>
using namespace std;
int power( int a, int n)
{
  if(a==0)
  {
    return 0;
  }
  else if(n==0)
  {
    return 1;
  }
  else
  {
    return (a*power(a,n-1));
  }
}
int main()
{
  int a=3,n=1;
  cin>>a>>n;
  cout<<"Enter the value of a"<<"\n";
  cout<<"Enter the value of n"<<"\n"; 
  cout<<"The value of "<<a<<" power "<<n<<" is "<<power(a,n);
  //Type your code here.
}