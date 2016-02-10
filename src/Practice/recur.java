package Practice;
import java.util.*;
public class recur {

	static int nDisks = 12;

	public static void main(String[] args) {



		//System.out.println(Fib(5));
		//doTowers(nDisks, 'A', 'B', 'C');
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("type a word to check if its a palindrome or not");
		String x = sc.nextLine();
		
		if(Palin(x))
			System.out.println(x + " is a palindrome");
		else
			System.out.println(x + " is not a palindrome");


	}
	public static int Fib(int n)
	{

		if (n <=2){
			return 1;
		}else{
			return Fib(n-2) + Fib(n-1);
		}
	}

	public static void doTowers(int topN,char src, char inter, char dest) {
		if(topN==1)
			System.out.println("Disk 1 from " + src + " to "+ dest);
		else {
			doTowers(topN-1, src, dest, inter); // src to inter
			System.out.println("Disk " + topN + // move bottom
					" from " + src + " to "+ dest);
			doTowers(topN-1, inter, src, dest); // inter to dest
		}
	}
	public static boolean Palin(String s)
	{
		if(s.length() == 0 || s.length() == 1)			// if its of length 0 or 1 return true
			return true; 
		if(s.charAt(0) == s.charAt(s.length()-1))	// if the 1st matches the last return the second and the second last		
			return Palin(s.substring(1, s.length()-1));		
		return false;
	}
}
