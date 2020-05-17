#include<iostream>
int main()
{
  int n=5,max,i;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  max=a[0];
  for(i=0;i<n;i++)
  {
    if(a[i]>max)
      max=a[i];
  }
  std::cout<<max;

    
  
  // Type your code here
}