import java.util.Scanner;

class StringOperations {

	Scanner sc = new Scanner(System.in);

	void _compareTo(String str)
	{
		System.out.println("enter another string to compare : ");
		String str1 = sc.next();

		System.out.println(str.compareTo(str1));
	}

	void _concat(String str) 
	{
		System.out.println("enter the String to be concatinated");
		String str1 = sc.next();

		System.out.println(str1.concat(str + str1));
	}

	void _charat(String str) 
	{
		int length = str.length();

		System.out.println("Enter the letter which is to be checked if it is in string or not : ");
		String input = sc.next();
		char check = input.charAt(0);

		for (int i = 0; i < length; i++) 
		{
			char ch = str.charAt(i);			

			if(check == ch)
			{
				System.out.println("True");
				break;
			}
			if(i+1 == length && check != ch)
			{
				System.out.println("False");
				break;
			}
		}
	}


	void _contains(String str) 
	{
		System.out.println("enter the char sequence to be found");
		String check = sc.next();

		boolean determine = str.contains(check);

		System.out.println(determine);
	}


	void _endswith(String str) 
	{
		System.out.println("enter the letter to check of it is the suffix of the string : ");
		String check = sc.next();

		boolean determine = str.endsWith(check);

		System.out.println(determine);
	}


	void _equals(String str) 
	{
		System.out.println("enter another string to check whether they both are idnetical : ");
		String check = sc.next();

		if (check.equals(str)) 
		{
			System.out.println("they are identical");
		}
		else 
		{
			System.out.println("they are not identical");
		}

	}


	void _equalscaseignore(String str) 
	{
		System.out.println("enter another string in lowercase");
		String check = sc.next();

		if (str.equalsIgnoreCase(check))
		{
			System.out.println("they are identical");
		} 
		else 
		{
			System.out.println("they are not identical");
		}

	}


	void _getchars(String str) 
	{
		int length = str.length();

		char ch[] = new char[length + 1];

		System.out.println("enter the starting index which should be less than : " + (length - 1));
		int startin = sc.nextInt();

		System.out.println("enter the ending index which should be less than : " + (length - 1));
		int endin = sc.nextInt();

		str.getChars(startin, endin, ch, 0);

		System.out.println(ch);
	}


	void _indexof(String str) 
	{
		System.out.println("enter the letter to know its index : ");
		String check = sc.next();

		System.out.println(str.indexOf(check));

	}

}



public class string_methods {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		StringOperations method = new StringOperations();

		while(true)
		{
			System.out.println("what operation do you want to do : ");
			System.out.println(
					"1 : Concat two strings\n"
							+ "2 : Check if the given character is in entered string\n"
							+ "3 : Determine if given character sequence is present in the string\n"
							+ "4 : Check the suffix of the string\n"
							+ "5 : Check two strings are identical\n"
							+ "6 : Check two strings are identical **uppercase or lowercase will be ignored\n"
							+ "7 : Get specific part of the string\n"
							+ "8 : Get index of a specific character\n"
							+ "9 : Compare two Strings");

			int option = sc.nextInt();

			System.out.println("enter the string : ");

			String str = sc.next();

			switch (option) 
			{
			case 1:
				method._concat(str);
				break;

			case 2 : 
				method._charat(str);
				break;

			case 3:
				method._contains(str);
				break;

			case 4:
				method._endswith(str);
				break;

			case 5:
				method._equals(str);
				break;

			case 6:
				method._equalscaseignore(str);
				break;

			case 7:
				method._getchars(str);
				break;

			case 8:
				method._indexof(str);
				break;

			case 9:
				method._compareTo(str);
				break;

			default:
				System.out.println("you have entered invalid option");
				break;
			}

			System.out.println("do you want to continue Enter yes/no :");

			String yn = sc.next();

			if(yn.equals("yes"))
			{
				continue;
			}

			if(yn.equals("no"))
			{
				break;
			}
		}
		sc.close();

	}
}
