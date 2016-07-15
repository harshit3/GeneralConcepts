import java.util.Scanner;

//String Bad For Modification.

public class BadUseOfString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		//String sql="Select * from products where type=";	//1 object created for sql
		StringBuffer sql=new StringBuffer("Select * from products where type=");
		
		System.out.println("Enter the product type-");
		String itemName=scanner.next();
		
		//sql=sql+"'"+itemName+"'";	//objects created for ' and for new sql. 
		sql.append("'").append(itemName).append("'");
		
		System.out.println(sql);
		System.out.println("Enter the price to search-");
		double price=scanner.nextDouble();
		
		//sql=sql+" and price>"+price;	//again objects will be created for 'and price' and for new sql.
		sql.append(" and price>").append(price);
		
		System.out.println(sql);
	}

}
