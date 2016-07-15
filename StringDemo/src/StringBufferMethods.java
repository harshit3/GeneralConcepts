
public class StringBufferMethods {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		
		sb.append(" Are");	//adds in end,does not create new obj appends in same object because StringBuffer is mutable.
		System.out.println(sb);
		
		sb.insert(6,"How ");	//adds at the beginning or in between.
		System.out.println(sb);
		
		sb.append(" You");
		System.out.println(sb);
		
		sb.deleteCharAt(7);
		System.out.println(sb);
		
		sb.insert(7,"o");
		System.out.println(sb);
		
		/*sb.delete(0,6);	//MultiChar delete.
		System.out.println(sb);*/
		
		System.out.println("New Capacity:-"+sb.capacity());
		System.out.println("New Length:-"+sb.length());
		
		char c=sb.charAt(2);
		System.out.println("Char at index 2:-"+c);
		
		sb.ensureCapacity(500);
		System.out.println("Capacity is:-"+sb.capacity()+" Length is:-"+sb.length());
		
		sb.ensureCapacity(250);	//capacity will remain 500, once increased it cannot be decreased.
		System.out.println("Capacity is:-"+sb.capacity());	
		
		sb.ensureCapacity(1003);
		System.out.println("Capacity is:-"+sb.capacity()+" Length is:-"+sb.length());
		
		System.out.println("Index of first H:- "+sb.indexOf("H"));
		System.out.println("Index Of Are:- "+sb.indexOf("Are"));
		
		//System.out.println("Index of Arc:- "+sb.indexOf("Arc"));
		
		System.out.println("index of last H:-"+sb.lastIndexOf("H"));
		
		System.out.println("Reverse:-"+sb.reverse());
		
		String w=sb.toString();	//StringBuffer convert to String.
		
		//StringBuffer does not have equals() method.
		//It uses Object Class equals() method which compares the references and not the values.
		StringBuffer x=new StringBuffer("Hello");
		StringBuffer y=new StringBuffer("Hello");
		if(x.equals(y)){
			System.out.println("Same Reference");
		}
		else{
			System.out.println("Not Same Reference");
		}
	}

}
