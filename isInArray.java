public class Main {
	
	public static void main(String[] args) {
		
		int[] arr1 = new int []{2, 2, 2};
		int[] arr2 = new int []{2, 2, 5, 8};
		
		System.out.println("12 is true  :  " + isInArray(arr2, 12));	
		System.out.println("6 is true  :  " + isInArray(arr1, 6));	
		System.out.println("12 is false  :  " + isInArray(new int[] {}, 12));	
	}
	
	public static boolean isInArray(int[]arr, int x) {
		for (int mask = 0; mask < Math.pow(2, arr.length); mask++) {// amount of sub-arrays is 2 to power of n
			int temp = 0;
			for (int j = 0; j < arr.length; j++) {
				if ((mask & (1 << j)) != 0)
							temp += arr[j];
			}
			if (temp == x) {
				return true;
			}
		}
		return false;
	}
}
