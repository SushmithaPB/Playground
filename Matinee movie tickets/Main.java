#include<iostream>
using namespace std;
int main()
{
  int age;
  float time,b=13.30,c=18.00;
  cin>>age>>time;
   if(age<=13)
  {
    if(time==b || time==c)
   cout<<"$2.00";
  else
    cout<<"$4.00";
  }
  else if(age>13)
  {
    if(time==b ||time==c)
     cout<<"$5.00";
    else
      cout<<"$8.00";
  }
     
 
  

  //Type your code here.
}