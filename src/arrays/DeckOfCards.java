package arrays;

public class DeckOfCards {

	public static void main(String[] args) {
		int ar[] = new int[] { 1,2,3,4, };
		shuffle(ar);

	}

	public static void shuffle(int[] arr) {

		int N = arr.length;
		for (int i = 0; i < N; i++) { 
			int index = i + (int)Math.random() * (N - i);
			System.out.println(index);
			int t = arr[index];
			arr[index] = arr[i];
			arr[i] = t;
		}
	
	}
	
	public static void shuffle2(int[] arr) {

		int N = arr.length;
		for ( int i = N-1; i > 0; i-- ) {
            int rand = (int)(Math.random()*(i+1));
            System.out.println(rand);
            int temp = arr[i];
            arr[i] = arr[rand];
            arr[rand] = temp;
        }

	}
}
