import java.util.Scanner;
public class Validation {

	public static void main(String[] args) {
		//Validating username
/*username is considered valid if it (1)consists of 6-30 characters
 * (2) can contain alphanumeric characters(a-z,A-Z,0-9) & underscore(_);
 * (3)first character must be alphabetic character(a-z,A-Z)
 */
		Scanner sc =new Scanner(System.in);
                                         System.out.pritln("enter a username);
		String username=sc.next();
		String regex="\\w+";
		if(username.length()>=6 && username.length()<=30) {
			if(username.matches(regex))
				System.out.println("valid username");
			else
				System.out.println("invalid username");
		}
		else {
			System.out.println("invalid username");
			System.out.println("username should be 6-30 characters long");
		}
			
	}

}
