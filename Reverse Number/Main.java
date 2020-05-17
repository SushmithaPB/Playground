#include <iostream>
int main() 
{
  int n=678,rev=0,r;
  std::cin>>n;
  while(n>0)
  {
    r=n%10;
    rev=rev*10+r;
    n=n/10;
  }
  std::cout<<rev;
    
	// Type your code here
	return 0;
}