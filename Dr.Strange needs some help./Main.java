#include<iostream>
int expo(int,int);
  int main()
{
  int a,b;
  int req;
  std::cin>>a>>b;
  std::cin>>req;
  int s=expo(a,b);
  if(s>=req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}
int expo(int x,int y)
{
  int w=1;
  for(int i=1;i<=y;i++)
   w=w*x ;
  return w;
}