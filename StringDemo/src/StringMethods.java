import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String x="Hello";
		System.out.println(x.length());
		System.out.println(x.toUpperCase());
		
		String y="Hello";
		
		//== compares reference while equals() compares the value.
		if(x.equals(y)){
			System.out.println("Same Value");
		}
		else{
			System.out.println("Not Same Value");
		}
		
		String a="hi";
		String b="Hi";
		if(a.equalsIgnoreCase(b)){
			System.out.println("Same Value");
		}
		else{
			System.out.println("Not Same Value");
		}
		
		String text="Hello How Are You";
		if(text.indexOf("How")>=0){	//if 'How' not present then negative value.
			System.out.println("Found...");
		}
		else{
			System.out.println("Not found...");
		}
		
		String text1="Hello, How Are You Hello";
		int index=text1.indexOf("Hello");
		int index1=text1.lastIndexOf("Hello");
		System.out.println("index-"+index);
		System.out.println("index from last-"+index1);
		
		System.out.println("Char at index 0-"+x.charAt(0));
		String text2="     Hello    ";
		System.out.println("Before Trim-"+text2);
		text2=text2.trim();
		System.out.println("After Trim-"+text2);
		
		System.out.println("Substring-"+text.substring(2));	//will give substring from index 2.
		System.out.println("In between Substring-"+text.substring(2,4));	//2:index, 4:position
		
		//compareTo()[useful for sorting] may give positive,negative or zero while
		//equals()[useful for searching] returns True or False.
		//compare will be negative in this case
		int compare="Amit".compareTo("Anil");
		System.out.println("Compare:- "+compare);
		
		//x=x.concat(" How");	//memory allocates for hello and for how and for hello how.
		
		//x vs concat():- concat() creates more number of object than +.
		//x=x.concat(" How").concat(" Are").concat(" You");
		x=x+" How" + " Are" + " You";
		System.out.println(x);
		
		if(x.endsWith("You")){
			System.out.println("Ends With You");
		}
		if(x.startsWith("Hello")){
			System.out.println("Starts with Hello");
		}

		byte barray[]=x.getBytes();	//String converted to byte,so we can write a file,also we can transfer the bytes on network.
		
		char w[]=text.toCharArray();	//Converts String into char array.
		Arrays.sort(w);	//Arrays is a class used to sort the primitive arrays.
		String t=new String(w);	//converting char array into string.
		System.out.println("After sorting chars of text-"+t);
		
		
		System.out.println("Relaced e with i-"+x.replace('e', 'i'));
		
		String h="Hello How Are You";
		String array[]=h.split(" ");
		System.out.println("Word Count for h:- "+array.length);
		
		String prodCode="FKOD-1001";
		System.out.println("ProductCode is:- "+prodCode);
		String arr[]=prodCode.split("-");
		System.out.println("New ProductCode is:- "+arr[0]+"-"+(Integer.parseInt(arr[1])+1));
	}

}
