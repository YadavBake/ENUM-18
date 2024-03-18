enum Beer
{
	KF, RC, KO, FO; 
}

class Test 
{
	/*enum Beer
	{
	KF, RC, KO, FO; 
	}*/ // valid inside a class 
	
	
	public static void main(String args[])	
	{	                                    
		/*enum Beer
		{
			KF, RC, KO, FO; 
			}*/ // invalid until 1.7v version above this version is valid 
		
		
		
		Beer b = Beer.RC;
		               
		
		System.out.println(b); // o/p: RC 
	}
}
		