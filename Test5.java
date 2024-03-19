enum Beer 
	{											
		
	  KF(70),KO(80),RC(90),FO;
			
	  int price;
	  Beer(int price)
	  {
		  this.price=price;
	  }
	  Beer ()
	  {
		 this.price = 65;
	  }
	  public int getPrice()
	  {
		  return price;
	  }
	}
	class Test5 
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
	  