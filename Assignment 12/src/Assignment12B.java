class Assignment12B
{
	public static void main(String args[])
	{
		Bank login = new Bank(12345);
		boolean loggedIn = login.checkStatus();
		System.out.println("Logged in? " + loggedIn);
		int accnum = login.getAccNum();
		System.out.println("Account number: " + accnum);
		String bal = login.getBalance();
		System.out.println("Balance: " + bal);
	}
}