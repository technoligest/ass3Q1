package question1;


import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
   String message = "Hello World";	
   MessageUtil messageUtil = new MessageUtil(message);

   @Test
   public int validateEmail(String email) {
      assertEquals(message,messageUtil.printMessage());
      return validateCond1(email)+validateCond2(email)+validateCond3(email)+validateCond4(email);
   }
   
   private int validateCond1(String s){
	   if(s==null)
		   return 0;
	   int count = 0;
	   for(int i=0;i<s.length(); ++i){
		   if(s.charAt(i)=='@')
			   ++count;
		   if(count>0)
			   return 0;
	   }
	   if(count==1)
		   return 1;
	   return 0;
   }
   private int validateCond2(String s){
	   if(s==null)
		   return 0;
	   for(int i=0;i<s.length(); ++i){
		   if(s.charAt(i)=='.')
			   return 1;
	   }
	   return 0;
   }
   private int validateCond3(String s){
	   if(s==null)
		   return 0;
	   if(s.length()<5)
		   return 0;
	   return 1;
   }
   
   //checks if there is characters before the @
   private int validateCond4(String s){
	   if(s==null)
		   return 0;
	   int i;
	   for(i=0;i<s.length(); ++i){
		   if(s.charAt(i)=='@')
			  break;
	   }
	   if(i>0)
		   return 1;
	   return 0;
   }  
}