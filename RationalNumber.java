import java.util.Scanner;
public class RationalNumber{
	public static void main(String[]args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter any two numbers");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int g=gcd(n1,n2);
		int m=n1/g;
		int n=n2/g;
		System.out.println("the rational number is "+m+" /"+n);
	}
	public static int gcd(int n1,int n2) {
		n1=(n1>0)?n1:-n1;
		n2=(n2>0)?n2:-n2;
		while(n1!=n2) {
		if(n1>n2)
			n1-=n2;
		else
			n2-=n1;
		}
		return n1;
	}
}