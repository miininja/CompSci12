class Assignment2B
{
	public static void main (String[]args)
	{
		int n1=1,n2=2,n3=3,n4=4,n5=5,average,sum,product;
		double fraction;
		average = (n1+n2+n3+n4+n5)/5;
		sum = n2+n3;
		product = n2 * n2;
		fraction = (double)n1 / n2;
		//System.out.println(fraction);
		System.out.printf("average of %s,%s,%s,%s, and %s is %s%nthe sum of %s and %s is %s%nthe product of %s and %s is %s%nthe fraction %s divided by %s is %s", n1,n2,n3,n4,n5,average,n2,n3,sum,n2,n2,product,n1,n2,(double)fraction);
	}
}