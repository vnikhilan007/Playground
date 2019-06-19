#include <stdio.h>
#include <math.h>
int main() {
	//Type your code
  	int n;
  	scanf("%d",&n);
  	int l=0,val=n;
  	while(val!=0){
    	val/=10;
      	l++;
    }
  	//l=5
  	val=(n/pow(10,l-2));
  	val = val%10;
  	printf("%d",val);
	return 0;
}