enum Beer 
	{
		KF,KO,RC,FO;
		
		Beer()
		{
			System.out.println("Constructor");
		}
	}
	class Test4 
	{
		public static void main(String args[])
		{
			Beer b = Beer.RC;
			System.out.println("Hello");
		}
	}