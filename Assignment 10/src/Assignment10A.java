class Assignment10A
{
	public static void main (String[] args)
	{
		int [ ] points={10,2,4,7,1,13,20,3};
		int temp;
		int i,j;
		System.out.println();System.out.println("Points in order from lowest to highest");
		//points highest to lowest
		for (i=0; i<7; i++) // compare the number in the front of the list with
		{                   // every number after it                      
			for (j=i+1; j<8; j++)
			{
				if (points[i]>points[j]) //if the number at the front is 
				{//swap                  // larger, swap the numbers
					temp=points[i];
					points[i]=points[j];
					points[j]=temp;
				}//end of if
			}
		}
		for (i=0; i<8; i++)
		{
			System.out.printf("%5d",points[i]);
		}
		System.out.println();
		System.out.println();System.out.println("Points in order from highest to lowest");
		for (i=0; i<7; i++) // compare the number in the front of the list with
		{                   // every number after it                      
			for (j=i+1; j<8; j++)
			{
				if (points[i]<points[j]) //if the number at the front is 
				{//swap                  // larger, swap the numbers
					temp=points[i];
					points[i]=points[j];
					points[j]=temp;
				}//end of if
			}
		}
		for (i=0; i<8; i++)
		{
			System.out.printf("%5d",points[i]);
		}
		System.out.println();
				
	}
}
