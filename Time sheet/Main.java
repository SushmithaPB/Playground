#include<iostream>
using namespace std;
int main()
{
  int a=0,b=8,c=8,d=8,e=10,f=6,g=0;
  int b1,br,r1,r2,r3,r4,r5,r6,r7,r8=0;
  int ed,td,tr;
  cin>>a>>b>>c>>d>>e>>f>>g;
  r1=a*150;
  r7=g*125;
  if(b<=8)
  {
   r2=b*100;
  }
  else
  {
   b1=b-8;
    br=(b1*100)+(b1*15);
    r2=br+800;
  }
 if(c<=8)
 {
    r3=c*100;
 }
  else 
  {
    b1=c-8;
    br=(b1*100)+(b1*15);
    r3=br+800;
  }
   if(d<=8)
   {
    r4=d*100;
   }
  else 
  {
    b1=d-8;
    br=(b1*100)+(b1*15);
    r4=br+800;
  }
  if(e<=8)
  {
    r5=e*100;
  }
  else 
  {
    b1=e-8;
    br=(b1*100)+(b1*15);
    r5=br+800;
  }
   if(f<=8)
    r6=f*100;
  else 
  {
    b1=f-8;
    br=(b1*100)+(b1*15);
    r6=br+800;
  }
  td=b+c+d+e+f;
  if(td>40)
  {
    ed=td-40;
    r8=(ed*25)+(ed*100);
  }
  tr=r1+r2+r3+r4+r5+r6+r7+r8;
  cout<<tr<<"\n";
 
  
  
  //Type your code here.
}