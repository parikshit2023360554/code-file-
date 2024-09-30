class practice{
    String name ; 
    int roll,no;


    //default costructor
    public practice(){
        name = "parikshit";
        roll = 2;
        no = 33443; 
    }
    //parameterized constructor 
    public practice(String name , int roll , int no){
        this.name = name ; 
        this.roll = roll; 
        this.no = no ; 
    }

    public void display(){
        System.out.println(name);
        System.out.println(roll);
        System.out.println(no);
    }
}

class Main{ 
    public static void main(String[] args) {
        practice[] sc = new practice[4] ; 
        sc[0]= new practice("harry",3,2112);
        sc[1]= new practice("hsfsfs",4,2112);
        sc[2]= new practice("sfsfsf",25,2112);
        sc[3]= new practice("afdafaf",2433,2112);
        for(int i=0 ; i<4 ;i++){
            sc[i].display();
        }
    
        


    }
}