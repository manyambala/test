package files_concept;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class StreamClass {
	
	public void inputStream()
	{
		try
		{
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Files\\testinputfile.txt");
		int i=0;
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}
	
	public void outputStream()
	{
		try
		{
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\Admin\\\\Files\\\\testoutputfile.txt");
		
		String n="jgjhgjhgjhgjgj";
		byte[] i=n.getBytes();
		fos.write(i);
		fos.close();
		System.out.println("sucess");
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StreamClass sc=new StreamClass();
		//sc.inputStream();
		sc.outputStream();
		
	}

}
