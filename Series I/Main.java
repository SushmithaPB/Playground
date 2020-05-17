#include<iostream>
#include<cmath>
int main()
{
  int n=5,i;
  std::cin>>n;
  double r=0.5,x;
  for(i=0;i<n;i++)
  {
    if(i==0)
    {
      std::cout<<r<<" ";
      continue;
    }
    else
    {
      double t=pow(3,i-1);
        double x=t+r;
      r=x;
        std::cout<<x<<" ";
    }
  }
}
      

      
    