import java.util.Scanner;
public class Str1 {
public static void main(String[] args) {
		System.out.println("ENTER THE STRING");
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
        StringBuffer sb=new StringBuffer(a);
        String b=sb.reverse().toString();
        if(b.contentEquals(a)) {
        	System.out.println("ITS A PALINDROME");
        }
        else
        {
        	System.out.println("ITS NOT A PALINDROME");
        }
        
	}

}
