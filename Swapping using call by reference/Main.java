#include<iostream>
void swap(int &x, int &y)
{
  int temp;
  temp=x;
  x=y;
  y=temp;
}
int main()
{
  int a=6,b=5;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
   std::cout<<"After swapping a= "<<a<<" and b="<<b;
}