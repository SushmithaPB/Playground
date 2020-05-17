 #include<iostream>
int main()
{
int n=4,i,num=121,b=11,c;
  std::cin>>n;
    if(n==1)
    {
      std::cout<<"121"<<" ";
    }
    else
    {
       std::cout<<"121"<<" ";
      for(i=2;i<=n;i++)
      {
        b=b+4;
        c=b*b;
        std::cout<<c<<" ";
      }
    }
}