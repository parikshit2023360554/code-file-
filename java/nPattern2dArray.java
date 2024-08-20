
class npattern2dArray{
	static void diag(int arr[][], int n)
	{

    int h=n-1;
    int b=0;
    while(h!=0){
      System.out.println(arr[h][b]+" ");
      h--;
    }


    for(int i=0;i<n-1;i++){
      System.out.println(arr[i][i]+" ");
    }


    int z=n-1;
    int i=n-1;
    while(i!=-1){
      System.out.println(arr[i][z]+" ");
      i--;
    }
  }

  public static void main(String args [])
	{
		int a[][] = { { 1,2,3,4 },
					{ 4,5,6,7},
					{ 7,8,9,8},
          {10,11,12,13}
        };

		diag(a, 4);
	}
}
