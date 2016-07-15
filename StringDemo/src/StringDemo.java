//String is a collection of characters.(Character Array)
//Final Class that provides predefined methods.Can't be inherited.
//Also treated as data type.
public class StringDemo {

	public static void main(String[] args) {
		
		//Creates an object in the String pool if 'Hello' is not already in the pool.
		//If already exists then it will use the same object.i.e it will create 0 or 1 object.
		String a="Hello";
		
		//Now this will not create new object,same object as 'a' will be used.
		String b="Hello";
		
		if(a==b){
			System.out.println("Same Reference");
		}
		else{
			System.out.println("Not Same Reference");
		}
		
		//Force to create a new object in the heap independent of presence of object in the String pool.
		//And if the string is not there in pool then it will create one more object in the pool with no reference.
		//i.e., it creates 2 or 1 object(1 in heap & 1 in pool)
		String c=new String("Hello");
		
		if(a==c){
			System.out.println("Same Reference");
		}
		else{
			System.out.println("Not Same Reference");
		}
		
		//2 objects
		String d=new String("Hi");
		String e=new String("Hi");
		
		if(e==d){
			System.out.println("Same Reference");
		}
		else{
			System.out.println("Not Same Reference");
		}
		
		//String is immutable-
		b="OK";	//When String is  modified,it will create new object.
	}

}
