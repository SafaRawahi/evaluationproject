package evaluationtask;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;




public class SearchWord {
	
	public void SearchStringWord() throws IOException {

		
		try {
		Scanner sc1 = new Scanner(System.in);
	      System.out.println("Enter the word to be found");
	      String word = sc1.next();
	      boolean flag = false;
	      int count = word.split("\\s").length;
	      System.out.println("Contents of the line");
	      //Reading the contents of the file
	      Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\user017\\Desktop\\evaluationtask\\evaluationfile.txt"));
	      while(sc2.hasNextLine()) {
	         String line = sc2.nextLine();
	         System.out.println(line);
	         if(line.indexOf(word)!=-1) {
	            flag = true;
	       
	         }
	      }
	      
	      if(flag) {
	         System.out.println("File contains the specified word: " + word);
	         System.out.println("Number of occurrences is: "+count);
	         System.out.println("the word is dupplicate: "+ word);
	      } else {
	         System.out.println("File does not contain the specified word");
	      }
		}
		catch (IOException e) {
			e.printStackTrace();
		}	
	}}
  
//Scanner sc1 = new Scanner(System.in);
//System.out.println("how many words want to search");
// int num = sc1.nextInt();
// 
// for(Integer i=0;i<=num ; i++) {
//  
// System.out.println("Please enter the Word that you want to search for: ");
//Scanner kb = new Scanner(System.in);
//String name = kb.nextLine();
//
//List<String> lines = Files.readAllLines(Paths.get("evaluationfile.txt"));
//for (String line : lines) 
//{
//if(line.contains(name)) {
//   System.out.println("word is here!!");
//}
//else {
//System.out.println("word not here!");
//     }
//}
//}}}
	   
	

