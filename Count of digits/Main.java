#include<iostream>
int main()
{ 
  int n=4567,i=0,r,rev=0;
  std::cin>>n;
  do
  {
    r=n%10;
    rev=rev*10+r;
    n=n/10;
    i++;
  }while(n>0);
  std::cout<<i;
  // Type your code here
}