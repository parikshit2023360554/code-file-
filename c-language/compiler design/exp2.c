#include <stdio.h>
#include <string.h>

int main() {
    char input[100];
    int state = 0;   // 0 -> even 0's (q0), 1 -> odd 0's (q1)

    printf("Enter binary string: ");
    scanf("%s", input);

    for (int i = 0; i < strlen(input); i++) {
        if (input[i] == '0') {
            state = 1 - state;   // toggle state on '0'
        }
    }

    if (state == 0) {
        printf("Accepted (Even number of 0's)\n");
    } else {
        printf("Rejected (Odd number of 0's)\n");
    }

    return 0;
}