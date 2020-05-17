#include<iostream>
int main()
{
  int n=4,num=n-1,i,j;
  std::cin>>num;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
      std::cout<<num;
      num++;
      std::cout<<"\n";
     }
    num--;
     for(i=n;i>=1;i--)
     {
      for(j=1;j<=i;j++) 
     std::cout<<num;
       num--;
        std::cout<<"\n";
     }
  return 0;
}