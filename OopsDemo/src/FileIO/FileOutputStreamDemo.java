package FileIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		String fname="c:/demo/data1.txt";
		try {
		
			FileOutputStream fos=new FileOutputStream(fname,true);
		
		String text="its a sunny day";
		byte[] myBytes=text.getBytes();
		fos.write(myBytes);
		System.out.println("data written in binary format");
		fos.close();
		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	
		
		
	}

}
