
													ENUM Part- 2||enum vs inheritance
												=======================================


 ---------------------
  enum vs inheritance 
 ---------------------

 -> Every enum is always direct child class of java.lang.Enum and hence a our enum can not extends any other enum(because 
	java won't provide support for Multiple inheritance.)
	

 -> Every enum is always final implicitly and hence for our enum we can't create child enum.
 
 -> Because of above resions we can conclude inheritance concept not applicable for enum explicitly and we can't use 
	extends keyword for enum.
	
	Ex. 
 
	enum x				enum x extends java.lang.Enum 	class x 			enum x 
	{                   {                               {                   {
		                	                            }                   }
	}                   }//invalid                      enum y extends x    class y extends x
	enum y extends x                                    {                   {
	{                                                                       	
		                                                }//invalid          }//invalid CE: cannot inherit from final x 
	}//invalid 																 CE: enum type are not extensable			
	
 
 
 ->  Anyways an enum can implement any number of interfaces.

	

	interface x 
	{
	
	}
	enum y implements x 
	{
	
	} //valid 
	
 -----------------
  java.lang.Enum  
 -----------------

 -> Every enum in java is the direct child class java.lang.Enum and hence this class access base class for all java 
	enums.
	
 -> It is an abstract class and it is the direct child class object.
 
 -> It implements Serializable and Comparable interfaces.
 
 -----------------
  Values() method 
 -----------------

 -> Every enum implicitly containes values() method to list out all values prasent inside enum.

			---------------------------
			|Beer[] b = Beer.values();|
			---------------------------
			
	Note: 
	
	  - values() method not prasent in java.lang.Enum class and Object classes. Enum keyword implicitly provides this 
		method.
		
--------------------
  ordinal() method 
--------------------

 -> Inside enum order of constants is important and we can reprasent this order by using ordinal value.
 
 -> We can find ordinal of enum constants by using ordinal() method.
 
 
	enum Beer 
	{
		KF,KO,RC,FO;
	}
	class Test 
	{
		public static void main(String args[])
		{
			Beer[] b = Beer.values();
			
			for (Beer b1 = b)
			{
				System.out.print(b1);
			}
		}
	}
 
 
			-----------------------------
			|public final int ordinal();|
			-----------------------------
			

 -> ordinal value is 0(Zero) based like Array index.			

	Ex. 
	
	
	enum Beer 
	{
		KF,KO,RC,FO;
	}
	class Test 
	{
		public static void main(String args[])
		{
			Beer[] b = Beer.values();
			
			for (Beer b1 = b)
			{
				System.out.print(b1+"....."+b1.ordinal());
			}
		}
	}// KF...0,KO...1,RC...2,FO...3;


 -------------------------
  Speciality of java Enum 
 -------------------------

 -> In old langauges enum we can take only constants but in java enum in addition to constants we can take method,
	constructor, normal variable ect. Hence a java enum is more powerfull then old langauges enum.
	
 -> Even inside java enum we can declare main method and we can run enum class directly from command prompt.
	
	Ex. 
 
	enum Fish
	{
		STAR,GUPPY,GOLD;
		
		public static void main(String[]args)
		{
			System.out.println("ENUM MAIN METHOD");
		}
	}
	javac Fish.java
	java Fish 
	//ENUM MAIN METHOD

  Note:
  
	- In addition to constants if we are taking any extra member like method then list of constants should be in the 
	  first line and should ends with semicolne.
	  
	
		
	
	enum Fish 								enum Fish						enum Fish 
	{                                       {                               {
		STAR GUPPY;                         	START, GUPPY                	public void m1()
		                                    	                            	{
		public void m1()                    	public void m1()            		
		{                                   	{                           	}
		                                    	                            	START, GUPPY;
		}                                   	}                           	
	}// Semicolne mandatory                 }//invalid                      }//invalid 
	                                                                        	
	
	
	-> Inside enum if we are taking any extra member like a method compulsory the first line should containes list of 
	   constants at list semicolne ';'.
	
	enum Fish 				enum Fish 
	{                       {
		public void m1()    	;
		{                      public void m1()
		}                   	{
	}//invalid              
	//CE:                   	}
                            }//valid 
	
 -> Any ways empty enum is valid java syntax.


	enum Fish 
	{
		
	}// valid 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 
 


































 
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	