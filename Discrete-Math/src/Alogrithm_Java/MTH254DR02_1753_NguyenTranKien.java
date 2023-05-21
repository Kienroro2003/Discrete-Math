package Alogrithm_Java;

public class MTH254DR02_1753_NguyenTranKien {
	/**
	 * Liệt kê các hoán vị của 6 bạn:
	 * Lan, Hoa, Dai, Long, Quoc, Hung
	 */
	static int total = 0;
	public static void display(String[] arr, int[] arrInt) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[arrInt[i]] + " ");
		}
		System.out.println();
	}
	
	public static void swap(int arrInt[], int n, int m) {
		int temp = arrInt[n];
		arrInt[n] = arrInt[m];
		arrInt[m] = temp;
	}
	
	public static void permutation(String[] arr, int[] arrInt) {
		int n = arr.length;
        int i;
        do {
        	display(arr, arrInt);
			total++;
            i = n - 1;
            for (; i > 0 && arrInt[i - 1] > arrInt[i]; i--) ;
            int a = i;
            if (i > 0) {
                int k = n - 1;
                int b = k;
                for (; arrInt[k] < arrInt[i - 1]; k--) ;
                swap(arrInt, i - 1, k);
                for (a = i; i < b; a++) {
                    swap(arrInt, a, b);
                    b--;
                }
            }
        } while (i != 0);
    }
	public static void main(String[] args) {
		String[] arr  = {"Lan", "Hoa", "Dai", "Long", "Quoc", "Hung"};
		int[] arrInt = {0,1,2,3,4,5};
		permutation(arr, arrInt);
		System.out.println(total);
	}
}
