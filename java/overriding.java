class overriding{
    int roll_no ;  
    String name ; 

    overriding(int roll_no , String name){

        this.roll_no = roll_no ; 
        this.name = name ; 
    }


    overriding(){
        this.roll_no = 12;
        this.name = "hello" ; 
    }

    public  void dispaly(){
        System.out.println("this is the roll" + roll_no);
        System.out.println("this is the name " + name);

    }
}


class secondMain{
    public static  void main(String args[]){
        overriding sc = new overriding(12 , "parikshit");
        overriding s = new overriding();
    }

}
