import java.util.Scanner;

//All the  methods in the StringBuffer class are synchronized.Only one user at a time can use a synchronized method.
//StringBuilder methods are non-synchronized(useful for read operations)
public class StringBuilderDemo {

	public static void main(String[] args) {
		
			Scanner scanner=new Scanner(System.in);
			
			//String sql="Select * from products where type=";	//1 object created for sql
			StringBuilder sql=new StringBuilder("Select * from products where type=");
			
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
