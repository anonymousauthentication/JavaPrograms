import java.util.Scanner;

public class PalindromNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number");
		int num = sc.nextInt();
		PalindromCheck check = new PalindromCheck();
		check.palindromNumberCheck(num);
	}
}
class PalindromCheck{
	public void palindromNumberCheck(int num) {
		int num2 = num;
		int sum = 0 ;
		  while(num>0){    
			 int   r=num%10;  //getting remainder  
			    sum=(sum*10)+r;    
			   num=num/10;    
			  }
		  if(sum == num2) {
			  System.out.println("Palindrom Number");
		  }
		  else {
			  System.out.println("Not a palindrom Number");
		  }
		
	}
}
