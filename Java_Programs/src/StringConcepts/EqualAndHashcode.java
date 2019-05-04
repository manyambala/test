package StringConcepts;

public class EqualAndHashcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="bala naresh";
		String b="BALA NARESH";
		String c="bala naresh";
		String d="bala Naresh";
		
		int len=d.length();
		System.out.println(len);
		
		System.out.println(a.equals(b));
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		System.out.println(a.equals(c));
		System.out.println(d.hashCode());
		System.out.println(a.equals(d));

		EqualAndHashcode e=new EqualAndHashcode();
		System.out.println(e.hashCode());

	}

}
