#include <stdio.h>
int main() {
	//Type your code
  	int n;
  	scanf("%d",&n);
  	int val=n,sum=0,i,d,val1;
  	while(val!=0){
    	d=val%10;
      	val1 = 1;
      	for(i=1;i<=d;i++) val1*=i;
      	sum+=val1;
      	val/=10;
    }
	if(sum==n) printf("Yes");
  	else printf("No");
	return 0;
}