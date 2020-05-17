#include<iostream>
int main()
{
  int n,i,num,sum=0;
  int mn=1,mx=10;
  std::cin>>mn>>mx;
  for(n=mn;n<mx;n++)
  {
    i=1;
    sum=0;
    while(i<n)
    {
      if(n%i==0)
        sum=sum+i;
      i++;
    }
    if(sum==n)
      std::cout<<n<<" ";
  }

}
      