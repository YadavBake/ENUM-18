enum Color 
			{
				RED,BLUE{
					public void info()
					{
						System.out.println("Dengerous Color");
					}
				},GREE;
				
				public void info()
				{
					System.out.println("Universal Color");
				}
			}
			class Test7 
			{
				public static void main(String args[])
				{
					Color[] c = Color.values();
					for(Color C1: c)
					{
						C1.info();
					}
				}
			}
		