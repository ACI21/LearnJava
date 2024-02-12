package especiales;

import java.util.*;

public class DequeProgram {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Read input
		int n = scanner.nextInt(); // Total number of integers
		int k = scanner.nextInt(); // Size of the subarray
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		// Use a Deque to keep track of elements within the sliding window
		Deque<Integer> deque = new LinkedList<>();
		HashSet<Integer> set = new HashSet<>();
		int maxUnique = 0;

		// Process each element
		for (int i = 0; i < n; i++) {
			// Add the current element to the deque and set
			deque.addLast(arr[i]);
			set.add(arr[i]);

			// If the size of the deque exceeds k, remove elements from the front
			if (deque.size() > k) {
				int removed = deque.removeFirst();
				if (!deque.contains(removed)) {
					set.remove(removed);
				}
			}

			// Update maxUnique with the size of the set if it's greater
			if (deque.size() == k) {
				maxUnique = Math.max(maxUnique, set.size());
			}
		}

		// Print the result
		System.out.println(maxUnique);

		// Close the scanner
		scanner.close();

	}
}