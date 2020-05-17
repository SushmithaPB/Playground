#include<iostream>
int gcd(int a,int b)
{
  int small=0,g;
  if(a<b)
    small=a;
  else
    small=b;
  while(small>0)
  {
  if(a%small==0 && b%small==0)
  {
    g=small;
    return g;
  }
  small--;
  }
 
} 
int main()
{
  int a=36,b=27;
  std::cin>>a>>b;
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd(a,b);
  //Type your code here.
}