package FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter writer=new FileWriter("c:/demo/names.txt",true);
			BufferedWriter bwr=new BufferedWriter(writer);

			bwr.write("\n");
			bwr.write("ramya");
			bwr.write("\n");
			bwr.write("mary");
			bwr.close();
			System.out.println("successfully written");
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}
}



