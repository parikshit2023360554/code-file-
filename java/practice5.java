class practice5 {



    String name ;
    int no,id;
    //default 
    practice5(   ){
        name = "parikshit";
        no = 2;
    }

    //parameterised 

    practice5(String name , int no , int id){
        this.name = name ; 
        this.no = no ; 
        this.id = id ; 
    }

    public void display(){
        System.out.println(name);
        System.out.println(no);
        System.out.println(id);
    }
}

class parikshit{
    public static void main(String[] args) {
        practice5 sc = new practice5();
        sc.display();
        practice5 s = new practice5("shivansh" , 23 , 2023);
        s.display();
    }
    
}
