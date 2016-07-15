
public class MutableDemo {

	public static void main(String[] args) {
		String x="Hello";
		x=x+"Bye";	//New Object will be created for 'Bye' and for new x.

		StringBuffer sb=new StringBuffer("Hello");	//Capacity=16 + "Hello".length
		System.out.println(sb);
		System.out.println("Capacity is- "+sb.capacity());
		System.out.println("Length is:- "+sb.length());
		
		//String i appended in the same object.
		//Now length becomes 17 and capacity remains 21.
		sb.append(" How Are You");
		System.out.println(sb);
		System.out.println("New Capacity is- "+sb.capacity());
		System.out.println("New Length is:- "+sb.length());
		
		//Now length of sb becomes(27) greater than capacity(21)
		//New Capacity= Old capacity*2 + 2
		//Now new object is created(storing the whole string) according to above formula and old one is deleted.
		sb.append(" I am Fine");
		System.out.println(sb);
		System.out.println("New Capacity is- "+sb.capacity());
		System.out.println("New Length is:- "+sb.length());
		

		//Now after first execution of above formula,if  length>new capacity then new capacity becomes length.
		sb.append("sb kjsgd sdiugsjk hssisabsa jbdvdvfdvfdvdvfgvdvdgfrgfvdfvfrgrfvregrgregdfgerggrgrgreg");
		System.out.println(sb);
		System.out.println("New Capacity is- "+sb.capacity());
		System.out.println("New Length is:- "+sb.length());
	}
}
