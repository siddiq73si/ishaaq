//Simple example of switch case
class Switch{
	public static void main(String args[])
	{
		for(int i=0;i<4;i++){	
			switch(i)
			{
			case 0:System.out.println("i is zero");
					break;
			case 1:System.out.println("i is one");
					break;
			case 2:System.out.println("i is two");
					break;
			default:System.out.println("i is greater than 2");
					
			}
		}
		
	}
}

//Break statement is optional
class MissingBreak{
	public static void main(String args[])
	{
		for(int i=0;i<4;i++){	
			switch(i)
			{
			case 0:System.out.println("i is zero");
					
			case 1:System.out.println("i is one");
					
			case 2:System.out.println("i is two");
			
			default:System.out.println("i is greater than 2");
					
			}
		}
		
	}
}

//Break statement is optional
class BreakMiss{
	public static void main(String args[])
	{
		for(int i=0;i<6;i++){	
			switch(i)
			{
			case 0:
			case 1:System.out.println("i is less than 2");
					break;
			case 2:
			case 3:System.out.println("i is less than 4");
					break;
			default:System.out.println("i is 4 or more");
					
			}
		}
		
	}
}