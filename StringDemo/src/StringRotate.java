import java.util.Scanner;

public class StringRotate {

	public static void main(String[] args) {
		System.out.println("Enter the String:-");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		scanner.close();
		System.out.println(str);
		for(int i=str.length()-1;i>=0;i--){
			str=str.substring(1,str.length())+String.valueOf(str.charAt(0));
			System.out.println(str);
		}

	}

}
