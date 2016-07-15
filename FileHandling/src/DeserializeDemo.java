import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		FileInputStream fi=new FileInputStream("D:\\JavaCodes\\MyWS\\FileHandling\\src\\emp.dat");
		ObjectInputStream oi=new ObjectInputStream(fi);
		
		//Another way of creating a new object.Here new keyword is not used and no constructor is called.
		//readObject returns the object of type 'Object' that's why we need to cast it to desired type.
		Employee e=(Employee)oi.readObject();	//creates an object(converts bytes into objects)
		System.out.println("Object Created-");
		e.print();
		oi.close();
		fi.close();
	}

}
//readObject() will return ClassNotFoundException when cast is done wrong.
//When we add a new field in our class and then try to create the object of that class using de-serialization-
//exception will occur because serialVersionUID of stream class and local class will not be same.