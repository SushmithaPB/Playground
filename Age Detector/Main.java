#include<iostream>
using namespace std;
int main()
{
  int b=62,c=00;
  cin>>b>>c;
  if(b>c)
  {
    int x=1900+b;
    int y=2000+c;
    cout<<y-x;
  }
  else
  {
     int x=2000+b;
    int y=2000+c;
    cout<<y-x;
  }
  
  //Type your code here.
}