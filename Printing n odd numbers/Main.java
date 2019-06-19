#include <stdio.h>
int main() {
	//Type your code
  	int i,n,f=0;
  	scanf("%d",&n);
  	for(i=1;i<=25;i+=2){
      if(f<n){
        printf("%d\n",i);
        f++;
      }
    }
	return 0;
}