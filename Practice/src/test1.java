import java.util.ArrayList;
import java.util.Scanner;

public class test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the numbers : ");

		int T = sc.nextInt();
		int num = 0;
		int S = 0;
		int x = 0;

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int k = 0; k < T; k++) {
			while (sc.hasNextInt() || x == T) 
			{
				arr.add(sc.nextInt());
			}
			
		}

		if (arr.isEmpty() == true) {
			System.out.println("NO");
			System.exit(0);
		}

		arr.remove(0);
		if (arr.isEmpty() == true) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
		int L = arr.size();
		for (int i = 0; i < L; i++) {
			S = S + arr.get(i);
		}
		System.out.println(L);
		System.out.println(S);

		sc.close();
	}
}
