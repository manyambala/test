package files_concept;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriter {

	public void writerMethod()
	{
		try
		{
		Writer wr=new FileWriter("testinputfile.txt");
		String s="emo emo gani";
		wr.write(s);
		wr.close();
		System.out.println(wr);
		System.out.println("sucessfully written into the testinputfile.txt");
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
			System.out.println(exc);
		}
	}
	public void readerMethod()
	{
	
		try
		{
			Reader rd=new FileReader("testinputfile.txt");
			//int d=rd.read();
			int d=0;
			while((d=rd.read())!=-1)
			{
				//int a=(char)d;
				System.out.print((char)d);				
			}
			rd.close();
			
		}
		catch(Exception exp)
		{
			exp.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ReaderWriter rw=new ReaderWriter();
		//rw.writerMethod();
		rw.readerMethod();
		
	}

}
