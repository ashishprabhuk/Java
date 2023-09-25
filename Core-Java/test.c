#include <stdio.h>


void Qn_16() {
    float a = 0.7;
    if (a < 0.7) printf("Stoned");
    else printf(" Avenged");
}

void Qn_17() {
    float a = 0.5, b = 0.9;
    if (a && b > 0.9) printf("tce-cse-a\n");
    else printf("tce-cse-b\n");
}

void Qn_18() { 
	int i;
	for(i=1;i++<=5;printf("%d ",i)); 
}

void Qn_19() {  //loop starts with an empty initialization section (;), meaning there are no initializations.
	int i = 1 , j = 1; // loop condition is j, which means the loop will continue as long as j is true (non-zero).
	for(;j;printf("%d %d\n",i,j)) //i starts at 1, so in the first iteration, it's used as 1 in the comparison.
	j=i++<=5; //1 <= 5 is true, so j is set to 1, which keeps the loop going.
}//When i reaches 6, the condition 6 <= 5 becomes false, and j is set to 0, which causes the loop to exit.

void Qn_20() {
    int x=3,y,z;
    z=y=x;
    z*=y=x*x;
    printf("x=%d y=%d z=%d\n",x,y,z);
}

int main() {
    // Qn_16();
	// Qn_17();
	// Qn_18();
	// Qn_19();
	Qn_20();
    return 0;
}