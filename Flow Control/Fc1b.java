public class Fc1b{
public static void main(String args[]){
	int n1=Integer.parseInt(args[0]);
	int n2=Integer.parseInt(args[1]);
	int num1=n1%10;
	int num2=n2%10;
	boolean cond=false;
	if(num1==num2)
		{
			cond=true;
			System.out.println(cond);
		}
	else
		{
			System.out.println(cond);
		}
	}
}