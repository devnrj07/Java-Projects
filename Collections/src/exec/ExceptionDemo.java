package exec;

import java.io.IOException;

import Client.AgeException;

public class ExceptionDemo {

	
	
	public void meth1() throws NullPointerException {
		
		
		try {
		String message=null;
		System.out.println(message.length());
		}
		finally {
		System.out.println(" Thanks for visiting method 1 ");
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		ExceptionDemo demo= new ExceptionDemo();
		try {
		demo.meth1();
		System.out.println(" Exception demo ");
		
		int num=12;
		String str=null;
		System.out.println(str.length());
		
		System.out.println("Sum is "+num);
		
		
		}
		
		catch(NullPointerException e) {
			System.out.println("Null pointer Exeption ");
		e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" array exception "+e);
		}
		catch(ArithmeticException e) {
			System.out.println("Arithematic exception ");
		}
		
		System.out.println(" End of Program");

		
		
		
	}

}
