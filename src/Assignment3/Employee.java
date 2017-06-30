package Assignment3;
/*
 * In this program I've written a code in Java to implement Method 
 * Overloading in java by using “this” keyword.
 */
public class Employee {
	
	
	public int sum(int x, int y){//Two Parameterized constructor
		System.out.println("Sum with two args called");
		return x+y;		
	}
	public int sum(int x, int y, int z){ //Three Parameterized constructor
		System.out.println("Sum with three args called");
		this.sum(x, y);// "this" will call sum method
		return x+y+z;
	}

	public static void main(String[] args) {
		Employee emp = new Employee(); 
		
		System.out.println(emp.sum(10, 20));// calling Two Parameterized constructor
		System.out.println(emp.sum(10, 20,30));//calling Three Parameterized constructor
	}

}
