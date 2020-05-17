#include <iostream>
using namespace std;
int main() {
  int n=5,i,j;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n;j++)
    {
      if(i%2!=0)
      {
    if(j<n)
    {
      cout<<i;
    }
    else
    {
      cout<<i+1<<"\n";
    }
    }
      else
      {
        if(j==1)
        {
          cout<<i+1;
        }
        else
        {
          cout<<i;
          if(j==n)
            cout<<"\n";
        }
      }
    }
  }
      
  
    // Type your code here
    return 0;
}