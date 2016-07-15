import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string:-");
		/*String str=scanner.nextLine();
		scanner.close();
		String str1="";
		char w[]=str.toCharArray();
		for(int i=w.length-1;i>=0;i--){
			str1=str1+w[i];
		}
		
		System.out.println("Original String:- "+str);
		System.out.println("Reversed String:-"+str1);
		if(str.equals(str1)){
			System.out.println("String is pallindrome");
		}
		else{
			System.out.println("String not pallindrome");
		}*/
		
		StringBuffer str=new StringBuffer(scanner.next());
		StringBuffer str1=new StringBuffer(str);
		str1.reverse();
		String w=str.toString();
		String w1=str1.toString();
		if(w.equals(w1)){
			System.out.println("Pallindrome");
		}
		else{
			System.out.println("Not Pallindrome");
		}
	}
	
	

}
