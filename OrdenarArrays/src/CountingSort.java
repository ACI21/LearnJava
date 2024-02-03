public class CountingSort {

	public int[] countingSort(int[] arr) {
        int max = getMax(arr);
        int[] count = new int[max + 1];
        int[] output = new int[arr.length];

        //Hacemos reecuento  de los numeros que hay
        for (int i = 0; i < arr.length; i++)
            count[arr[i]]++;

        //sumamos de forma acumulativa
        for (int i = 1; i <= max; i++)
            count[i] += count[i - 1];

        for (int i = arr.length - 1; i >= 0; i--) {
        	int arrOriginal = arr[i];
        	int arrCopia = count[ arrOriginal ] - 1;
            output[ arrCopia ] = arr[i];
            count[arr[i]]--;
        }
        
        return output;

    }

    private int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}