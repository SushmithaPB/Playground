#include<iostream>
int fact(int a)
{
  int f=1;
  if(a==0)
  {
    return 1;
  }
  else
  {
    for( int i=1;i<=a;i++)
     f=f*i;
    return f;
  }
}
int main()
{
  int n=5;
  std::cin>>n;
  std::cout<<"The factorial of "<<n<<" is "<<fact(n);

  //Type your code here.
}