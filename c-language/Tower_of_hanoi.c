#include<stdio.h>

void Tower(int n,char from,char to,char help){
    if(n==1){
        printf("%c > %c",from,to);
    }
    else{
        // calling the tower in its own function
        Tower(n-1,from,help,to);
        printf("%c > %c",from,to);
        Tower(n-1,help,to,from);
    }
}

int main(){
    int n;
    char from='A';
    char to='C';
    char help='B';
    printf("enter the no of disks: ");
    scanf("%d", &n);
    Tower(n,from,to,help);
    return 0;
}