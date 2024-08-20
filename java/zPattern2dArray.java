
class Main{
	public static void diag(int arr[][], int n)
	{
		int i = 0, j, k;
		for (j = 0; j < n - 1; j++) {
			System.out.print(arr[i][j] + " ");
		}
		k = 1;
		for (i = 0; i < n - 1; i++) {
			for (j = 0; j < n; j++) {
				if (j == n - k) {
					System.out.print(arr[i][j] + " ");
					break;
				}
			}
			k++;
		}
		i = n - 1;
		for (j = 0; j < n; j++)
			System.out.print(arr[i][j] + " ");

		System.out.print("\n");
	}

	public static void main(String[] args)
	{
		int a[][] = { { 1,2,3 },
					{ 4,5,6},
					{ 7,8,9}};

		diag(a, 3);
	}
}
