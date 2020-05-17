#include<iostream>
using namespace std;
int main()
{
  int target=100,score,attempt=0,sum=0;
  cin>>target;
  while(sum<target)
  {
    cin>>score;
    sum=sum+score;
    attempt++;
  }
  cout<<"The number of turns is "<<attempt;
  
  //Type your code here.
}