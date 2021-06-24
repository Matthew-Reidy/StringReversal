import java.util.Scanner;
import java.util.Stack;

public class StringReverse {


	public static void main(String[] args) 
	{
		Stack<Character> s1 = new Stack<Character>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("please enter a word: ");
		
		String str = sc.nextLine();

		Reverse(s1, str);
	}	
	public static void Reverse (Stack<Character> s1, String str) 
	{
		for (int i= 0; i< str.length(); i++) 
		{
			s1.push(str.charAt(i));
		}
	
		for ( int j = 0; j<s1.size(); j--)
		{
			System.out.print(s1.pop());
		}

	}
}
