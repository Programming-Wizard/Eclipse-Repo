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


	void _startswith(String str)
	{
		System.out.println("Enter a alphabet to check if it starts with it : ");
		String str1 = sc.next();

		if(str.startsWith(str1))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}


	void _tolowercase(String str)
	{
		System.out.println(str.toLowerCase());
	}


	void _touppercase(String str)
	{
		System.out.println(str.toUpperCase());
	}


	void _trim(String str)
	{
		System.out.println(str.trim());
	}


	void _emptymethod(String str)
	{
		String emptystr = " ";
		String notemptystring = "this is a non empty string";
		System.out.println("The String is empty : "+emptystr.isEmpty());
		System.out.println("The string is empty : "+notemptystring.isEmpty());
	}


	void _replace(String str)
	{
		System.out.println("Enter what do you want to replace : ");
		char what = sc.next().charAt(0);

		System.out.println("enter with what do you want it to be replaced : ");
		char with = sc.next().charAt(0);

		System.out.println(str.replace(what, with));
	}


	void _length(String str)
	{
		System.out.println("The length of the entered string is : "+str.length());
	}


	void _join(String str)
	{
		System.out.println("Enter what do you want to join with :,-,+,=,etc.. : ");
		String ch = sc.next();

		System.out.println("enter another string : ");
		String str1 = sc.next();
		System.out.println("enter one more string : ");
		String str2 = sc.next();

		String str3 = String.join(ch,str, str1,str2);

		System.out.println(str3);
	}


	void _lastindex(String str)
	{
		System.out.println("Enter to check where will the character appear for the last time : ");
		String str1 = sc.next();

		System.out.println(str.lastIndexOf(str1));
	}


	void _split(String str)
	{
		String[] str1 = str.split("\\s",3);

		System.out.println("previous string : " + str);
		System.out.println("new string : ");
		for(String x : str1)
		{
			System.out.print(x);	
		}
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
							+ "9 : Compare two Strings\n"
							+"10 : To check if entered string starts with entered prefix\n"
							+"11 : Convert entered string in lowercase\n"
							+"12 : Convert entered string in uppercase\n"
							+"13 : Remove the Spaces at the starting and ending of string\n"
							+"14 : Replace a specific alphabet with another which is present in entered string\n"
							+"15 : Find the length of the entered string\n"
							+"16 : Join Strings with a letter or symbol\n"
							+"17 : To find where is a specific word going to occur for thelost time in the entered string\n"
							+"18 : Split the entered string");

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

			case 10:
				method._startswith(str);
				break;

			case 11:
				method._tolowercase(str);
				break;

			case 12:
				method._touppercase(str);
				break;

			case 13:
				method._trim(str);
				break;

			case 14:
				method._replace(str);
				break;

			case 15:
				method._length(str);;
				break;

			case 16:
				method._join(str);
				break;

			case 17:
				method._lastindex(str);
				break;

			case 18:
				System.out.println("Enter string with words and spaces (minumum three words) : ");
				str = sc.nextLine();

				method._split(str);

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
