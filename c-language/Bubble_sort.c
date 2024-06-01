#include<stdio.h>

int Bubble_sort(int arr[],int n){
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            // swaping the element of the arr
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}

int main(){
    int arr[100];
    int arr_size,arr_element;
    int i;

    // scaning the size of the array

    printf("Enter the size of array");
    scanf("%d",&arr_size);

    // creating the arr with user define

    for(i = 0; i < arr_size; i++){
        printf("Enter the element: ");
        scanf("%d", &arr[i]);
    }

    // caling the function with
    Bubble_sort(arr,arr_size);

    // printing the array which is sorted
    printf("Array after sorting ");
    for(i=0;i<arr_size;i++){
        printf("%d \n",arr[i]);
    }
    return 0;

}