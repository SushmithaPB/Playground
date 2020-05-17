#include<iostream>
int main()
{
  int r=2,c=2;
  int sum[10][10];
  std::cin>>r>>c;
  int a[r][c],b[r][c];
  for(int i=0;i<r;i++)
  {
     for(int j=0;j<c;j++)
      std::cin>>a[i][j];
  }
   for(int i=0;i<r;i++)
  {
     for(int j=0;j<c;j++)
      std::cin>>b[i][j];
  }
   for(int i=0;i<r;i++)
   {
      for(int j=0;j<c;j++)
      {
       sum[i][j]=a[i][j]+b[i][j];
       std::cout<<sum[i][j]<<" ";
   }
     std::cout<<"\n";
   }
    
    // Type your code here
}