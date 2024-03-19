
													ENUM Part- 3||enum vs constructor
												=======================================

-----------------------
  enum vs constructor	
-----------------------

 -> An enum can containe constructor.
 
 -> enum constructor will be executed separatly for every enum constants at the time of enum class loading automatically 
	

	enum Beer 													
	{														
		KF,KO,RC,FO;                                        					javac Test.java 
		                                                    						   |
		Beer()                                              						   |
		{                                                   	------------------------------------------------
			System.out.println("Constructor");              	|											   |
		}                                                   Beer.class									   Test.java 	
	}                                                       
	class Test                                              					java Test 
	{                                                       					
		public static void main(String args[])              					  Hello 	
		{                                                   					
			Beer b = Beer.RC(); //------------> Line - 1    					java Test  
			System.out.println("Hello");                    
		}                                                   					Constructor
	}                                                       					Constructor
	                                                        					Constructor
	-> If we comment line - 1 then the output is Hello.     					Constructor
	                                                        					Hello
	Constructor
	Constructor
	Constructor
	Constructor
	Hello
	
	
  -> We can't create enum object directly and hence we can't invoke enum constructor directly.


		Ex. 
		
			Beer b = new Beer() ;// invalid CE: enum type may not be instantiated.
		
  
	enum Beer 
	{											
		
	  KF(70),KO(80),RC(90),FO;	  KF    => public static final Beer b = new Beer();
								  KF(70)=> public static final Beer b = new Beer(70);
	  int price;
	  Beer(int price)
	  {
		  this.price=price;
	  }
	  Beer ()													output:
	  {                                                         
		 this.price = 65;                                       KF.....70
	  }                                                         KO.....80
	  public int getPrice()                                     RC.....90
	  {                                                         FO.....65
		  return price;                                           
	  }
	}
	class Test 
	{
		public static void main(String args[])
		{
			Beer[]b = Beer.values();
			for(Beer b1 : b)
			{
				System.out.println(b1+"....."+b1.getPrice());
			}
		}
	}
	
	
 -> Inside enum we can declare methods but should be concrete methods only and we can't declare abstract methods.


 
   case 1: 
   
	-> Every enum constants reprasents an object of the type enum hence a whatever methods we can apply on normal java 
	   objects,can be applicable on enum constants also.
	   
	   Ex. 
   
	
		Beer.KF.equals(Beer.RC)// valid 
		
		Beer.KF.hashCode()> Beer.RC hashCode()// valid 
		
		Beer.KF < Beer.RC //invalid 
		
		Beer.KF.ordinal() < Beer.RC.ordinal()//valid 
	
	
  case 2: 
  
	-> If we want use any class or interface directly from outside package then the required import is normal import.
	
	-> If we want access static members without class name then the required import is static import.
	
		Ex. 
		
			import static java.lang.Math.sqrt;-------------
														  | 	
			import java.util.ArrayList;------------------ |
														| |		
			class Test 								    | |
			{											| |	
				public static void main(String args[])  | |	
				{										| |	
					ArrayList al = new ArrayList()<-----| |
														  |		
					System.out.println(sqrt(4));<---------|
				}
			}
			
	->
	
	
		Ex. 
		
			package pack1;
			public enum Fish
			{
				STAR, GUPPY;
			}
			
			package pack2;
			public class Test1
			{
				public static void main(String args[])
				{
					Fish f = Fish.GUPPY;
					System.out.println(f);
				}
			}// The required import is import pack1.Fish or import pack1.*
	
	
			package pack3;
			public class Test2
			{
				public static void main(String args[])
				{
					System.out.println(START);
				}
			}// The required import is: import static pack1.Fish.STAR or import static pack1.Fish.*;


			package pack4;
			public cass Test3
			{
				public static void main(String args[])
				{
					Fish f = Fish.STAR;
					System.out.println(	GUPPY);
				}
			}// The required import are : import pack1.Fish; or import pack1.*; import static pack1.Fish.GUPPY; or 
			 //import static pack1.Fish.*;
			
	  
  case 3: 

	-> 
	
		Ex. 												
		                                                    	enum Color 
			enum Color                                      	{
			{                                               		RED,BLUE{
				RED,BLUE,GREE;                              			public void info()
				                                            			{
				public void info()                          				System.out.println("Dengerous Color");
				{                                           			}
					System.out.println("Universal Color");  		},GREE;
				}                                           		
			}                                               		public void info()
			class Test                                      		{
			{                                               			System.out.println("Universal Color");
				public static void main(String args[])      		}
				{                                           	}
					Color[] c = Color.values();             	class Test7 
					for(Color C1: c)                        	{
					{                                       		public static void main(String args[])
						System.out.println(C1.info());      		{
					}                                       			Color[] c = Color.values();
				}                                           			for(Color C1: c)
			}                                               			{
			output:                                         				C1.info();
			                                                			}
			Universal Color                                 		}
			Universal Color                                 	}
			Universal Color                                 output:
		                                                    
		                                                    Universal Color
		                                                    Dengerous Color
		                                                    Universal Color

  case 4: 
  
	enum 	vs 	Enum 	Vs	 Enumeration
	  |			  |				 |	
	keyword   	class 		  interface 	
	
	
	enum :- enum is a keyword in java which can be used to define a group of named constants.
	
	Enum :- Enum is a class in java prasent in java.lang package. Every Enum in java should be direct child class of 
			Enum class. Hence a this class access based class for all java enums.
			
	Enumeration :- Enumeration is an interface prasent in java.util package. We can use Enumeration object to get objects 
				   one by one from the collection 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
	
		
		
		
		
		