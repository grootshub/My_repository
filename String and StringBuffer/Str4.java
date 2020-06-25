
import java.util.Scanner;
public class Str4 {
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String");
		String s1=sc.next();
		int n=s1.length();
		if(n%2==0)
		{
			System.out.println(s1.substring(0,n/2));
		}
	
		else 
		{
			System.out.println("NULL");
		}
		}

	}

