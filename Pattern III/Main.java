#include<iostream>
int main()
{
  int n=5,i,j;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
      if(j<i)
      {
        std::cout<<i<<"*";
      }
        else
        {
          std::cout<<i<<"\n";
        }
  }
   for(i=n;i>=0;i--)
   {
     for(j=1;j<=i;j++)
        if(j<i)
        {
        std::cout<<i<<"*";
        }
        else
        {
          std::cout<<i<<"\n";
        }
   }
  }
     
       