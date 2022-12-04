package evaluationtask;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.util.Scanner;

public class Api {

	static void mainMenue() {

		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ********** Welcome *********** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t \t ***Please Choose One Option*** \t \t");
		System.out.println("\t \t ****************************** \t \t");
		System.out.println("\t\t 1. Consume API ");
		System.out.println("\t\t 2. Write File ");
		System.out.println("\t\t 3. Search words from File ");
		System.out.println("\t\t 4. Exite ");
		System.out.println("\t\t ******************************* \t \t");
	}

	public static void main(String[] args) throws IOException, InterruptedException {

		boolean isExit = true;

		while (isExit) {

			Scanner sc = new Scanner(System.in);
			mainMenue();

			int option = sc.nextInt();

			switch (option) {

			case 1:

//			Consume API
				ConsumeApi myConsumeApi = new ConsumeApi ();
				myConsumeApi .ConsumA();
				
				break;

			case 2:

				WriteResponse myWriteResponse = new WriteResponse();
				myWriteResponse .WriteRead();
				

				break;

			case 3:
				
				SearchWord mySearchWord = new SearchWord();
				SearchWord.SearchStringWord();
				
				break;

			case 4:
				System.out.println(" See You Soon ");
				System.exit(0);
				
				break;

			}
		}
		
		isExit = false;

	}
}
