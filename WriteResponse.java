package evaluationtask;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class WriteResponse {
	
	
	
	public void WriteRead() throws IOException, InterruptedException {
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://official-joke-api.appspot.com/jokes/ten")).build();
		HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

		String Myfile1 = response.body();
      // System.out.println(Myfile1);
		try {
			FileWriter writerFile = new FileWriter(
					"C:\\Users\\user017\\Desktop\\evaluationtask\\evaluationfile.txt");
			writerFile.write(Myfile1);
			writerFile.close();
			
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("**************************************************");
		System.out.println("****** JSON File Was Created Successfully ********");
		System.out.println("**************************************************");

		try {
			File myObj = new File("C:\\Users\\user017\\Desktop\\evaluationtask\\evaluationfile.txt");
			Scanner myReader = new Scanner(myObj);

			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				System.out.println(data);
			}
			myReader.close();
		} 
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		
	}

}
