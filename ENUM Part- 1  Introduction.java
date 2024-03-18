
												ENUM Part- 1|| Introduction
											=================================

 
 --------------------
  ENUM(Enumeration)
 --------------------

 -> If we want to reprasent group of named constants then we shuold go for enum.
 
	Ex.

	enum Month					enum Beer 
	{                           {
		JAN,FEB,MAR....DEC;     	KF,LP,KO,RC,FO;
	}                           }
	
	- Semicolane is opetion.

 -> The main objective of enum is to define our own Data types(Enumarated datatypes).

 -> Enum concept introduced in 1.5v version.
 
 -> When compared with old languages Enum java Enum is more powerfull.
 
 -----------------------------------
  Internall implementation of Enum 
 -----------------------------------
 
   -> Every Enum is internally implemented by using class concept.
   
   -> Every Enum constants is always public static final.
   
   -> Every Enum constants reprasents an object of the type Enum.
 
 
	Enum Beer								 class Beer 
	{                                        {
		KF, RC; -- Internally converted--->   public static final Beer KF = new Beer();	
	}                                         public static final Beer RC = new Beer();	
											}
	
			  -------		  -------
		KF--->|		|   RC--->|		|
			  |		|   	  |		|
			  -------		  -------
	
--------------------------- 
 Enum declaration and uses 
---------------------------

 -> Every Enum constants is always public static final and hence we can access Enum constants by using Enum name.

	Enum Beer
	{
		KF, RC, KO, FO;
	}
	
	class Test 
	{
		public static void main(String args[])		
		{	                                        	  -------
			-------------------                     RC--->|	RC 	|
			|Beer b = Beer.RC;|                     b---->|		|
			-------------------                     	  -------
			
			System.out.println(b); // o/p: RC 
		}
	}
			
 Note: 

	-> Inside Enum toString() method is internally implemented to return name of the constants. 
	
	-> We can declare enum either within the class or outside of the class but not inside a method.
	
	-> If we are trying to declare inside a method then we will get compile time error saying enum types must not be 
	   local.
	   
	
		enum x		class x    					class x     
		{           {                           {
			        	enum y                  	public void m1()
		}           	{                       	{
		class y     	}                       		enum y 
		{           } // valid                  		{
		                                        		}// CE: enum types must not be local 
		} //valid                               	}
		                                        } // invalid 
		
		
 -> If we declare enum outside of the class the applicable modifiers are public default strictfp.

 -> If we declare enum inside a class the applicable modifiers are 	public default strictfp+ private protected static.
	
----------------
 enum vs switch 
----------------

 -> Until 1.4v version the allowed argument types for the switch statement are byte short char int but from 1.5v version
	onwords currosponding wrapper classes and enum type are allowed.
	
-> From 1.7v version onwords String types allowed.


						-------------------------------
						|1.4v  |  1.5v		|  1.7v   |  	
						|------|------------|---------|
						|byte  |  Byte      |         |
						|------|------------|---------|
						|short |  Short 	| String  |
						|------|------------|---------|
						|int   |  Integer   |         |
						|------|------------|---------|
						|char  |  Character |         |
						|------|------------|---------|
						|	   |   +        |         |
						|	   | enum       |         |
						-------------------------------	
						
 -> Hence a from 1.5v version onwords we can pass enum type as argument to switch statement.


	enum Beer
	{
		KF,KO,RC,FO;
	}
	class Test 
	{
		public static void main(String args[])
		{
			Beer b = Beer.KF;
			switch(b)
			{
				case KF:
					System.out.println("It is childrens brand");
					break;
				case KO:
					System.out.println("It is to light ");
					break;	
				case RC:
					System.out.println("It is not that much kick");
					break;
				case FO:
					System.out.println("Buy one get one Free ");
					break;
				default:
					System.out.println("Other brand are not recomonded ");	
					
			}
		}
	}

 -> If we pass enum type as switch statement then every case lable should be valid enum constants otherwise we will 
	get compile time error.
	
	Ex. 
		
		
	switch(b)
	{
		case KF;
		case KO;
		case RC;
		case FO;
		case KALYANI;// CE: unqualified enumaration constants name required.
	}
		

	
    
    
    