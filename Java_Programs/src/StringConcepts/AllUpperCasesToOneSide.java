package StringConcepts;

public class AllUpperCasesToOneSide {

	public String add()
	{
			String s="I am Manaym Bala Naresh Happy New year";
			int len=s.length();
			System.out.println(len);
			char[] ch=s.toCharArray();
			String low="";
			String upp="";
			for(char c:ch)
			{
				if(c>='A' && c<='Z')
				{
					upp=upp+c;
				}
				else
				{
					low=low+c;
				}
				
			}
			return low+upp;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AllUpperCasesToOneSide ast=new AllUpperCasesToOneSide();
		ast.add();
		String name=ast.add();
		System.out.println(name);
	}

}
