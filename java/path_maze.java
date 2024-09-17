class path_maze {
    public static  int count_maze(int i , int j , int n , int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1; 
        }
        int downwords = count_maze(i+1, j, n, m);
        int upword = count_maze(i, j+1, n, m);
        return downwords+upword;
    }
    public static void main(String args []){
        int n = 3 ;
        int m = 3 ; 
        int count = count_maze(0, 0, n, m);
        System.out.println(count);

    }
}
