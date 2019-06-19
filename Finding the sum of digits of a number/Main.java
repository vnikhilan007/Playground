#include <stdio.h>
int main() {
	//Type your code
  	int n;
  	scanf("%d",&n);
  	int sum=0,val=n;
  	while(val!=0){
    	sum+= val%10;
      	val/=10;
    }
  	printf("%d",sum);
	return 0;
}