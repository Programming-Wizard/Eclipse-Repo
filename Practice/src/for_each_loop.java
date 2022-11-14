import java.util.Scanner;

public class for_each_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 5 numbers for the array : ");
		int[] data = new int[5];
		for(int x = 0; x < 5; x++)
		{
			data[x] = sc.nextInt();
		}
		for(int y : data)
		{
			System.out.println("the data entered : ");
			System.out.println(y);
		}
		sc.close();
		
	}
}
