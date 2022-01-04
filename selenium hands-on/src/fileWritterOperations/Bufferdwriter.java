package fileWritterOperations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Bufferdwriter {

	public Bufferdwriter(FileWriter filewriter) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		String location="Bufferdwriter.txt";
		String content="Winter is coming";
		
	FileWriter filewriter=new FileWriter(location);
	
	BufferedWriter bufferedwriter=new BufferedWriter(filewriter);
	
	bufferedwriter.Write(content);
	
	bufferedwriter.close();
	
	
		
		
		
		

	}

	private void write(String content) {
		// TODO Auto-generated method stub
		
	}

}
