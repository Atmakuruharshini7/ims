package FileIO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
//writer class is used to write data or text into a text file..here the file is demo
public class WriterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Writer w=new FileWriter("c:/demo/data.txt");
			
			String content="She Sells Sea Shells In The Sea but no one dare to buy them";
			w.write(content);
			w.close();
			System.out.println("data written to a file");
				
		}
		catch(IOException e) {
			System.err.println("Error occured");
		e.printStackTrace();
		
		}
		
	}

}
