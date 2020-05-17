#include<iostream>
int sum(int n)
{
  int s=0;
 while(n>0 || s>9)
 {
   if(n==0)
   {
     n=s;
     s=0;
   }
   s+=n%10;
   n/=10;
 }
  return s;
}
int main()
{
  int n=887;
  std::cin>>n;
 std::cout<<sum(n);
}