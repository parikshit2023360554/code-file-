#include <stdio.h>
#include <string.h>

int main() {
    char input[100];
    int state = 0; // q0 = 0, q1 = 1, q2 = 2

    printf("Enter a binary string: ");
    scanf("%s", input);

    for (int i = 0; i < strlen(input); i++) {
        char ch = input[i];

        if (state == 0) {          // q0
            if (ch == '0') state = 1;
            else state = 0;
        }
        else if (state == 1) {     // q1
            if (ch == '0') state = 2;
            else state = 0;
        }
        else if (state == 2) {     // q2
            if (ch == '0') state = 2;
            else state = 0;
        }
    }

    if (state == 2)
        printf("Accepted: String ends with 00\n");
    else
        printf("Rejected: String does NOT end with 00\n");

    return 0;
}