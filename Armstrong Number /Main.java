#include <stdio.h>
int main() {
	//Type your code
  	int n;	
  	scanf("%d",&n);
  	int sum=0,val=n,d;
  	while(val!=0){
    	sum+= pow(val%10,3);
      	val/=10;
    }
  	if(sum!=n) printf("Not an ");
  	printf("Armstrong Number");
	return 0;
}