public class Example {
	int[] arr = {10, 20, 30, 40, 50};
	static int binarySearch(int[] arr, int key) {
       int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) return mid;
            else if (arr[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
		
    }
	public static void main(String[] args) {
		System.out.println("index = ");
		Example e = new Example();
		int index = Example.binarySearch(e.arr , 40);
		System.out.println("index = "+index);
	}
	


}
