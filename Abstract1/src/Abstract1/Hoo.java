package Abstract1;

 class Shaadidotcom throws ShaadiException
 {
	 static void Submit()
	 {
		 int age=17;
		 if(age>=21)
		 {
			 System.out.println("sukha jeevana");
		 }
		 else
		 {
			 throw new ShaadiException("invalid age");
		 }
		 public static void main(String[]args)
		 {
			 try
			 {
				 submit();
				 
			 }
			 catch(ShaadiException e)
			 {
				 System.out.println(e.getMessage());
				 
			 }
		 }
		 class ShaadiException extends Excpetion
		 {
			 String msg;
			 ShaadiException(String msg)
			 {
				 this.msg=msg;
				 
			 }
		 public String get Message()
		 {
			 return msg;
		 }
      
}
	 
