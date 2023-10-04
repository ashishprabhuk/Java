#include<stdio.h>
int main() {
char str[]="MalayalaM";
char *s;
s = str+8;
while( s > str) {
printf("%c" , *s);
s--; 
}
return 0;
}
