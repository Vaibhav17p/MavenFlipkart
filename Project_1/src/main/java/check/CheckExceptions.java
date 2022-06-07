package check;

public class CheckExceptions {
	
	public static void main(String[] args) {
		
		int a= 10;
		int b=0;
		int c=55 ;
		int d[]= {5,6,6,7,8};
		
		try {
			c=a/b;
		  
		}
		
		
	   catch (ArithmeticException e){
		   
		   System.out.println("Cant divide by zero");
		   b=1;
		   c=a/b;
		   //e.printStackTrace();	 
//
//			  try {
//				  System.out.println(d[9]);
//				  }
//			  catch(ArrayIndexOutOfBoundsException h){
//				  System.out.println("Lenght of array is "+d.length);
//			       }
	   }
		try {
			System.out.println(d[10]);
		}
		catch (ArrayIndexOutOfBoundsException e){
			   
			  // System.out.println("Index of array out of bound");
			   System.out.println("Lenght of array is "+d.length);
			   e.printStackTrace();
		 }			   
//		System.out.println(c);
//		System.out.println("Execution done");
//	
	   finally {
		   System.out.println("Hie Fianlly");
	   }
	
	}}
