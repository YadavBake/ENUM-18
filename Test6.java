enum Color 
			{
				RED,BLUE,GREE;
				
				public void info()
				{
					System.out.println("Universal Color");
				}
			}
			class Test6 
			{
				public static void main(String args[])
				{
					Color[] c = Color.values();
					for(Color c1: c)
					{
						c1.info();
					}
				}
			}