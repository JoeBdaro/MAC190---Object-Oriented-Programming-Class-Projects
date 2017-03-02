import java.util.Scanner;

public class palindrome {
	
	static boolean isPalindrome(String str){

		int i= 0, k = str.length()-1;

		while(i<k){
			if (str.charAt(i) != str.charAt(k)){
				return false;
			}
			i++;
			k--;
		}
		return true;
	}
	public static void main(String[] args){

		String myStr;
		Scanner keyboard = new Scanner (System.in);

		System.out.println("Please enter a String: ");
		myStr = keyboard.next();
		boolean res = isPalindrome(myStr);

		if(res == false){
			System.out.println(myStr + " is not a palindrome");
		}
		else{
			System.out.println(myStr + " is a palindrome");
		}
		keyboard.close();
	}

}


