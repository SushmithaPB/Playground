#include<iostream>
using namespace std;
int main()
{
  int a1=1000,d1=50,s1=50,a2=900,d2=50,s2=70,a3=800,d3=10,s3=200;
  int fl1,fl2,sn1,sn2,am1,am2;
  cin>>a1>>d1>>s1>>a2>>d2>>s2>>a3>>d3>>s3;
  float r1=(float)d1/100;
  fl1=a1*r1;
  fl2=(a1-fl1)+s1;
  float r2=(float)d2/100;
  sn1=a2*r2;
  sn2=(a2-sn1)+s2;
  float r3=(float)d3/100;
  am1=a3*r3;
  am2=(a3-am1)+s3;
  cout<<"In Flipkart Rs."<<fl2<<"\n";
   cout<<"In Snapdeal Rs."<<sn2<<"\n";
   cout<<"In Amazon Rs."<<am2<<"\n";
  if(fl2<=sn2 && fl2<=am2)
  {
    cout<<"He will prefer Flipkart";
  }
  else if(sn2<=am2)
  {
     cout<<"He will prefer Snapdeal";
  }
  else
  {
     cout<<"He will prefer Amazon";
  }
  //Type your code here.
}