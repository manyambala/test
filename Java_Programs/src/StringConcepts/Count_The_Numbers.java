package StringConcepts;

public class Count_The_Numbers {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I am Bala Naresh... <b> Yeah! is it?.";
		
		//it will remove empty space
		String v1=s.replaceAll("\\s", "");
		
		//except these characters everyone will be removed
		String v=s.replaceAll("[^a-zA-Z0-9 - ]", "");
		System.out.println(v+v1);
		
	}

}
