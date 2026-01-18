#include <stdio.h>

int main()
{
    char input[100];
    int state = 0; 
    printf("enter binary string\n");
    scanf("%s",input);
    
    for(int i =0;input[i]!='\0';i++){
        if(input[i]=='1'){
            state =1-state;
        }
    }
    if(state==1){
        printf("accept\n");
         
    }else{
        printf("reject\n");
    }
    return 0;
} 