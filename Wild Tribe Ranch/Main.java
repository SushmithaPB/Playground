#include<iostream>
int main()
{
  int m=85,f=54;
  std::cin>>m>>f;
  if(m>f)
  {
    std::cout<<"Yes, you can enter.";
  }
  else if(m==f)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else
  {
    std::cout<<"Sorry, you can't enter";
  }
}