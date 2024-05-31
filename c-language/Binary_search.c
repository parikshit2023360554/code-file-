#include<stdio.h>

int Binary_search(int arr[],int arr_size,int target){
    int low=0;
    int high=arr_size-1;
    while(low<=high){
        // find the mid of the array as in binary search
        int mid=low+(high-low)/2;
        // finding the index of the target
        if(arr[mid]=target){
            return mid;
        }
        else if(arr[mid]<target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return -1;
}

int main(){
    int target;
    int arr[100];
    int arr_size,arr_element;

    // scaning the size of the array

    printf("Enter the size of array");
    scanf("%d",&arr_size);

    // creating the arr with user define

    for(int i=0;i<arr_size;i++){
        printf("enter the element");
        scanf("%d",&arr_element);
        arr[i]=arr[arr_element];
    }

    // scaning the element to search

    printf("enter the number to search");
    scanf("%d",&target);

    // storing the index found in the get_index 


    int get_index=Binary_search(arr,arr_size,target);
    if(get_index!=-1){
        printf("the %d found at the index %d",target,get_index+1);
    }
    else{
        printf("the element not found");
    }

}