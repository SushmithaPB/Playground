#include<iostream>
int main()
{
  int a=3,b=3,n,i,div,sum=0;
  std::cin>>a>>b;
  n=a+b;
  for(i=1;i<n;i++)
  {
    div=n%i;
    if(div==0)
      sum=sum+i;
  }
      if(sum==n)
      {
      std::cout<<"They can read the message";
      }
      else
      {
    std::cout<<"They can't read the message"; 
      }
  }
   
    
    