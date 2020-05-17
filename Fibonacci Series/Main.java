#include<iostream>
int fibo(int a)
{
 if(a==0)
 {
   return 0;
 }
  else if(a==1)
  {
    return 1;
  }
  else
  {
  return (fibo(a-1)+fibo(a-2));
  }
}
int main()
{
  int n;
  std::cin>>n;
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<fibo(n-1);
  return 0;
  //Type your code here.
}