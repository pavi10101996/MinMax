import java.util.*;

class MinMax
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//code
		 Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T--!=0){
            int i;
            long cost=0;
            int size = sc.nextInt();
            long arr[] = new long[size];
            for(i=0; i<size; i++){
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            cost = arr[0]*(size-1);
            System.out.println(cost);

        }
	}
}
