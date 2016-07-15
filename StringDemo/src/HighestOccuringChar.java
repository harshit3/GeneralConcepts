import java.util.Arrays;
import java.util.Scanner;

public class HighestOccuringChar {

	public static void main(String[] args) {
		System.out.println("Enter the string:-");
		Scanner scanner=new Scanner(System.in);
		String str=scanner.nextLine();
		scanner.close();
		
		int highestCount=0;
		char maxChar[]=new char[str.length()];
		int current=0;
		
		char array[]=str.toCharArray();
		Arrays.sort(array);
		String str1=String.valueOf(array);
		for(int i=0;i<str.length();i++){
			char ch=str1.charAt(i);
			if(ch!=' '){
			int firstIndex=str1.indexOf(ch);
			int lastIndex=str1.lastIndexOf(ch);
			int occurenceCount=lastIndex-firstIndex+1;
			
			if(occurenceCount>highestCount){
				current=0;
				highestCount=occurenceCount;
				maxChar[current]=ch;
				current++;
			}
			else if(occurenceCount==highestCount){
				maxChar[current]=ch;
				current++;
			}
			i=str1.lastIndexOf(ch);
			}
		}
		System.out.println("Highest occuring char is/are- ");
		for(int i=0;i<current;i++){
			System.out.println(maxChar[i]);
		}
			System.out.println(" with "+highestCount+" occurences");
		
	}

}
