enum Beer
	{
		KF,KO,RC,FO;
	}
	class Test2 
	{
		public static void main(String args[])
		{
			Beer b = Beer.RC;
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
		