import java.util.Scanner;

public class SentenceCaseDemo {

	public static void main(String[] args) {
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string:-");
		String s=scanner.nextLine();
		System.out.println("Entered String:- "+s);
		
		/*Using String:-
		String w[]=s.split(" ");
		String fullStr="";
		scanner.close();
		for(String x:w){
			fullStr=fullStr + String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1).toLowerCase() + " ";
		}
		
		System.out.println("Result:- "+fullStr);
		 */
		
		//Using StringBuffer:-
		StringBuffer sb=new StringBuffer(s);
		String str=String.valueOf(sb).toLowerCase();
		str=String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1);
		for(int i=0;i<sb.length();i++){
			if(sb.charAt(i)==' '){
				str=str.substring(0,i+1)+String.valueOf(str.charAt(i+1)).toUpperCase()+str.substring(i+2);
			}
		}
	
		System.out.println(str);	}

}
