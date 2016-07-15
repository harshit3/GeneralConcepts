import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//serialization of any object of employee can be done, because all the properties from are inherited into employee.
//but during de-serialization instance variables from parent(Person) will not be able to get accessed because Person is not
//serializable and so its constructor will be called.
class Person{
	String gender;
	int age; 
	Person(){
		System.out.println("Person cons called");
		age=21;
		gender="Male";
	}
}

//Serialization means converting objects into bytes.
//Only instance variables are written into the file(not static variables)
//Only those classes that implements serializable interface are allowed to do serialization.
//Sensitive information should not be stored in file because file systems are less secure.
class Employee extends Person implements Serializable{
	
	//this should be mentioned when object is to be written into file or on a network(else it will throw an exception)
	//otherwise we may ignore it.
	private static final long serialVersionUID = 1L;	//explained below
	
	
	static int stat=1;
	private String city;
	private String name;
	private double salary;
	
	//transient keyword is used when we want to prevent a particular field to be stored into file.
	//So, we may use static or transient variables to prevent them from getting stored into file.
	private transient String pincode;	
	
	private double bonus=1100;	//suppose this field is added after serialization.
	//Now when bonus added and we try to create an object using de-serialization(of an old object stored)
	//then exception will occur because serialVersionUID of stream class and local class will not be same.
	//So, we freeze the serialVersionUID as above-
	//Now it will always be same whether we are changing the class or not.
	
	
	Employee(){
		System.out.println("Employee cons called");
		city="Delhi";
		name="Ram";
		salary=25000;
	}
	
	void print(){
		System.out.println("City- "+city);
		System.out.println("Name- "+name);
		System.out.println("Salary- "+salary);
		System.out.println("Pincode-"+pincode);
		System.out.println("Bonus-"+bonus);
		System.out.println("stat-"+stat);
		System.out.println("Age- "+age);
		System.out.println("Gender:- "+gender);
	}
}
public class SerializeDemo {

	public static void main(String[] args) throws IOException {
		Employee ram=new Employee();
		System.out.println("Ram object created-");
		ram.print();
		
		FileOutputStream fo=new FileOutputStream("D:\\JavaCodes\\MyWS\\FileHandling\\src\\emp.dat");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		
		oo.writeObject(ram);	//converts objects into bytes.
		System.out.println("\n\nObject ram stored in file.");
		oo.close();
		fo.close();
		
	}

}
