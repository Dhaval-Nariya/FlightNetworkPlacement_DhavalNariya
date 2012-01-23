class stckDemo
{
	int[] s = new int[9];

	int init;

	stckDemo()
	{		
		init = -1;
	}

	void pushmethod(int number)
	{
	
		if(init>9)
		{
			
			System.out.println("\n\tSorry...stack is out of bound.");
		}
		else
		{		
				s[++init]=number;
				
				System.out.println("\n\t\t\tpush["+(init)+"]="+number);				
			
		}
	}

	int popmethod()
	{

		if(init<0)
		{	
			System.out.println("\n\n\tYou can Assume :");
			return 0;
		}
		else
		{
			return s[init--];
		}
	}
}


class Prog1bF
{
	
	public static void main(String s[])
	{
	
		int a[] = new int[9];
		int i,d=0;
		boolean dn = true;

		stckDemo sd = new stckDemo();
		
		try
		{
			if(s[0]==""){}
		}
		catch(Exception e)
		{
				System.out.println("\n\tSorry.. You Have Not Entered any value");
				dn=false;
		}
			
		if(dn == true)
		{	
			try
			{
				System.out.println("\n\tpush numbers are :\n");

				a[0] = Integer.parseInt(s[0]);
				sd.pushmethod(a[0]);

				for(i=1;i<=(s.length);i++)
				{
					 a[i] = Integer.parseInt(s[i]);
						
					if((a[i]==(Integer.parseInt(s[--i])+1)) || (a[0]==9))
					{
						sd.pushmethod(a[++i]);

						if((Integer.parseInt(s[i]))==9)
						{
							if((Integer.parseInt(s[++i])==0))
							{
							     if((Integer.parseInt(s[++i]))==(a[--i]+1))
							     {
									sd.pushmethod(a[i]);
									d=i;
  							     }
							     else
							     {
								sd.pushmethod(a[i]);
								System.out.println("wrong series");  								d=i; break;
							     } d=i;
							}
							else
							{
								System.out.println("wrong input"); 								d=i;break;
							}d=i;
						}		
						d=i;
					}
					else
					{	
					   d = i;
					   System.out.println("\n\t\t\tNOTE : Sorry..Wrong series");                                            dn=false;break ;
					}						
				}
					
				
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
			   System.out.println("\n\t\t\tNOTE :-> we will take only 9 elements :\n\n");
			} 

			System.out.println("\n\n\n\tpop numbers are :\n");

			for(i=0;i<(d+1);i++)
			{
				System.out.println("\n\t\t\tpop["+i+"]="+sd.popmethod());
			}
		}
	}
}

























