#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
 int a=300,b=375,c=78,d=45,ov=50,q,r;
  float of,tr;
  cin>>a>>b>>c>>d;
  cout<<50<<"\n";
  q=d/6;
  r=d%6;
   of= ((float)q+ (float)r/10);
  cout<<fixed<<setprecision(1)<<of<<"\n";
   float cr=c/of;
  cout<<cr<<"\n";
  tr=(float)b/(float)50;
  cout<<tr<<"\n";
  if(cr>tr){
    cout<<"Eligible to Win";
  }
  else
  {
    cout<<"Not Eligible to Win";
  }
  
  
  
  //Type your code here.
}