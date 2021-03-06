package arrae;

public class quickysortques {
	public static void main(String[] args) {
		int[] input = {10,2,20,8,2,4};
        quicksort(input ,0 , input.length-1);
		for(int i =0;i<input.length;i++) {
        	System.out.println( input[i]);
        	}
	}
public static void quicksort(int[] input,int from ,int to) {
		if(from<to) {
			int indexofpivot = partition(input,from ,to);
			quicksort(input,from,indexofpivot-1);
			quicksort(input,indexofpivot+1,to);
		}
	}
public static int partition(int[]  input ,int  from, int  to) {
		int pivot = input[to];
		int wall = from;
		for(int i = from;i<to;i++) {
			if(input[i]>=pivot) {
				int temp = input[wall];
				input[wall] = input[i];
				input[i] = temp;
				wall++;
			}
		}
		input[to] = input[wall];
		input[wall] = pivot;
		
		return wall;
	}
}
