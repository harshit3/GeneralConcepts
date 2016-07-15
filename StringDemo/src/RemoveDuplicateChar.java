import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		System.out.println("Enter the string:-");
		Scanner scanner=new Scanner(System.in);
		StringBuffer sb=new StringBuffer(scanner.nextLine());
		scanner.close();
		
		int firstIndex=0;
		int lastIndex=0;
		char array[]=sb.toString().toCharArray();
		Arrays.sort(array);
		String str1=String.valueOf(array);
		str1=str1.trim();
		
		for(int i=0;i<str1.length();i++){
			char ch=str1.charAt(i);
			if(ch!=' '){
			firstIndex=str1.indexOf(ch);
			lastIndex=str1.lastIndexOf(ch);
			int occurenceCount=lastIndex-firstIndex+1;
			
			if(occurenceCount>1){
				str1=str1.substring(0,firstIndex)+str1.substring(lastIndex+1,str1.length());
			}
			
			}
		}
			
		System.out.println(str1);
		}
		
	}


	


