#include<stdio.h>
#include<stdlib.h> 

struct node{
    int data;
    struct node *link;
};

struct node* createnode(){
    return (struct node*)malloc(sizeof(struct node));   
}

void Traversal(struct node *ptr){
    while(ptr!=NULL){
        printf("Element-->%d \n",ptr->data);
        ptr=ptr->link;
    }
}

int Count(struct node *start){
    int count=0;
    struct node *ptr=start;
    while(ptr!=NULL){
        count++;
        ptr=ptr->link;
    }
    return count;
}

void Search(struct node *ptr,int search_item){
    int count=0;
    while(ptr!=NULL && ptr->data!=search_item){
        count++;
        ptr=ptr->link;
    }
    if(ptr==NULL){
        printf("%d not found in the list \n",search_item);
    }
    else{
        printf("%d found at %d node \n",search_item,count+1);
    }  
}

struct node *Insert_First(struct node *start,int data){
    struct node *ptr=createnode();
    ptr->link=start;
    start=ptr;
    ptr->data=data;
    return start;
}

