package especiales;

import java.util.BitSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BitSetProgram {

	public static void main(String[] args) {
		/*
		 * 5 4
		 * AND 1 2
		 * SET 1 4
		 * FLIP 2 2
		 * OR 2 1
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		BitSet bs1 = new BitSet(n);
		BitSet bs2 = new BitSet(n);
		String regex = "^(AND|SET|FLIP|OR|XOR)$";
		Matcher matcher;
		String op;

		for (int i = 0; i < m; i++) {
			do {
				op = sc.next();
				op.toUpperCase();
				Pattern pattern = Pattern.compile(regex);
				matcher = pattern.matcher(op);
			} while (!matcher.matches());

			int idx1 = sc.nextInt();
			int idx2 = sc.nextInt();

			switch (op) {
			case "AND":
				if (idx1 == 1) {
					bs1.and(bs2);
				} else {
					bs2.and(bs1);
				}
				break;
			case "OR":
				if (idx1 == 1) {
					bs1.or(bs2);
				} else {
					bs2.or(bs1);
				}
				break;
			case "XOR":
				if (idx1 == 1) {
					bs1.xor(bs2);
				} else {
					bs2.xor(bs1);
				}
				break;
			case "FLIP":
				if (idx1 == 1) {
					bs1.flip(idx2);
				} else {
					bs2.flip(idx2);
				}
				break;
			case "SET":
				if (idx1 == 1) {
					bs1.set(idx2);
				} else {
					bs2.set(idx2);
				}
				break;
			default:
				break;
			}

			// Print the number of set bits in each BitSet
			System.out.println(bs1.cardinality() + " " + bs2.cardinality());
		}
		sc.close();
	}
}
