#include<iostream>
int main()
{
  int n,id,i,flag=0;
  int a[20];
  std::cin>>n;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
    std::cin>>id;
  for(i=0;i<n;i++)
  {
    if(a[i]==id)
    {
    flag=1;
      break;
     }
  }
  if(flag==1)
  {
   std::cout<<"She passed her exam";
  }
  else
  {
  std::cout<<"She failed";
  }
  // Type your code here
}