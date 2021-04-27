class Sorting
{
	public static void main(String[] args)
	{
		String[] teams = {"ABC", "AAA", "AAC", "ZZZ", "XAV", "ZAZ"};
		int[] sortedTeams = new int[teams.length];
		for (int i = 0; i < teams.length; i++)
		{
			String frankenstring = "";
			for (int j = 0; j < teams[i].length(); j++)
			{
				frankenstring = frankenstring + lowerchartonum(teams[i].charAt(j));
			}
			int frankenint = Integer.parseInt(frankenstring);
			sortedTeams[i] = frankenint;
		}
		for (int i = 0; i < teams.length; i++)
		{
			System.out.println(teams[i]);
		}
		for (int i = 0; i < sortedTeams.length-1; i++)
		{
			for (int k = i + 1; k < sortedTeams.length; k++)
			{
				if (sortedTeams[i] > sortedTeams[k])
				{
					/*int tempint = sortedTeams[i];
					sortedTeams[i] = sortedTeams[k];
					sortedTeams[k] = tempint;*/
					String tempstr = teams[i];
					teams[i] = teams[k];
					teams[k] = tempstr;
				}
			}
			//System.out.println(sortedTeams[i]);
		}
	
		for (int i = 0; i < teams.length; i++)
		{
			System.out.println(teams[i]);
		}
	}
	public static char inttochar(int num)
	{
		if (num >= 97 & num <= 122 || num >= 65 & num <= 90)
		{
			char retchar = (char)num;
			return retchar;
		}
		else
		{
			return (char)0;
		}
	}
	public static int chartoint(char character)
	{
		return (int)character;
	}
	public static int lowerchartonum(char character)
	{
		char lowered = Character.toLowerCase(character);
		int chartonum = (int)lowered - 96;
		return chartonum;
	}
}