#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int d1=n%10,d2=n/100;
  printf("%d",(d1+d2));
  return 0;
}