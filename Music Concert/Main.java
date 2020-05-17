#include<iostream>
int main(){
  int *a;
  int n,i,j=0,k=0;
  std::cin>>n;
  a=(int*)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    std::cin>>*(a+i);
  }
  for(i=0;i<n;i++)
  {
  if(a[i]%2==0)
  {
    j++;
  }
  else
  {
    k++;
  }
  }
  std::cout<<k<<"\n"<<j;
  
  // Type your code here
  return 0;
}