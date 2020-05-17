#include<iostream>
using namespace std;
int main()
{
  int tw=340,a=2,c=3;
  cin>>tw>>a>>c;
  if(tw>((a*75)+(c*30)))
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}