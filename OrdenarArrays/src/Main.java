/**
 * 
 */
import java.util.Arrays;

/**
 * 
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7,4,9,7,3,2,6,9,0,5};
		int[] arr2 = {7,4,9,7,3,2,6,9,0,5};

		CountingSort nombreVariable = new CountingSort();
		arr = nombreVariable.countingSort(arr);
		imprimir(arr);
		
		Arrays.sort(arr2);
		imprimir(arr2);
		
	}
	
	public static void imprimir(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
