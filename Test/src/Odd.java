
public class Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = oddNumbers(80, 99);

		for (int i : a) {
			System.out.println(i);
		}
	}

	static int[] oddNumbers(int l, int r) {

		// int arrLength = 0;
		// int diff = r - l;
		// if (l % 2 > 0 && r % 2 > 0){
		// arrLength = diff%2>0 ?(diff-1)/2 :diff/2+1;
		// } else {
		// arrLength = 0;
		//
		// }

		int[] myArr = new int[r];
		int idx = 0;

		if ((l % 2) > 0) {

			for (int i = l; i <= r; i++) {
				if (i % 2 > 0) {
					myArr[idx] = i;
					++idx;
				}
			}
		} else {

			myArr[0] = l + 1;

			for (int i = l + 2; i <= r; i++) {
				if (i % 2 > 0) {
					++idx;
					myArr[idx] = i;
				}
			}
		}

		int counter = 0;
		for (int j = 0; j < myArr.length; j++) {

			if (myArr[j] != 0) {
				counter++;
			}

		}
		int[] out = new int[counter];

		for (int h = 0; h < myArr.length; h++) {

			if (myArr[h] != 0) {
				out[h] = myArr[h];
			}
		}

		return out;
	}

}
