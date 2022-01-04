package selenium;

import java.io.FileWriter;
import java.io.IOException;

public class FilewritingExamples {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String Location="UsingFileWritter.txt";
		String Content="Learning java concepts ";
		
		FileWriter filewriter=new FileWriter(Location);
		filewriter.write(Content);
		
		filewriter.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
