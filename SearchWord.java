package evaluationtask;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;




public class SearchWord {

		public static void SearchStringWord() throws IOException {
			boolean isExit2 = true;
			boolean isExitSmallMenue = true;
			
			Scanner sc = new Scanner(System.in);
			
			
			while(isExitSmallMenue) {
		System.out.println(" ********************************* ");
		System.out.println(" !!!! Please Choose One Option !!!!  ");
		System.out.println(" 1. Search Words From Text File ");
		System.out.println(" 2. Search Words From PDF File ");
		System.out.println(" 3. Back To The Main Menue ");
		
		
		int option2 = sc.nextInt();
		
		switch (option2) {

		case 1:
		// Scanner sc = new Scanner(System.in);
        String[] words=null;  
     
        System.out.println("Enter the number of words:");
        Integer n = sc.nextInt();
        
        List<String> wordsList=new ArrayList<>();
        String wordsArray[] = new String[n];
        System.out.println("Enter words:");
       
        
        for(int i=0; i<n; i++)  
        {
            String wordss=sc.next();
           wordsList.add(wordss); 
        }

         System.out.println( wordsList);
      for(String list:  wordsList) {
    	   FileReader fileread = new FileReader("C:\\Users\\user017\\Desktop\\evaluationtask\\evaluationfile.txt");  
           BufferedReader bufferread = new BufferedReader(fileread );
           
           String s;     
           int count=0;   //Intialize the word to zero
            while((s=bufferread.readLine())!=null)   //Reading Content from the file
        {
          {
           words=s.split(" ");  //Split the word using space
           
            for (String word : words) 
            {
                   if (word.contains(list))   //Search for the given word
                   {
                     count++;    //If Present increase the count by one
                   }
            }
            
        if(count == 1)
        {
        	System.out.println(list + " is unique in file ");
        }
        
        else if (count == 0)
        {
           System.out.println(list+ "  " + "The word is not present in the file");
        }
        else
        {
           System.out.println(list +"  "+"The word is present in the file "+ count +" times");
        }
        }
          
           }
            fileread .close();
      }    
      
	
		break;
		
		
		
		case 2 :
		
			// Scanner sc = new Scanner(System.in);
	        String[] wordss=null;  
	     
	        System.out.println("Enter the number of words:");
	        Integer n1 = sc.nextInt();
	        
	        List<String> wordssList=new ArrayList<>();
	        String wordssArray[] = new String[n1];
	        System.out.println("Enter words:");
	       
	        
	        for(int i=0; i<n1; i++)  
	        { 
	            String wordss1=sc.next();
	           wordssList.add(wordss1); 
	        }

	         System.out.println( wordssList);
	      for(String list:  wordssList) {
	    	   FileReader fileread = new FileReader("C:\\Users\\user017\\Desktop\\newevaluationfile1.pdf");  
	           BufferedReader bufferread = new BufferedReader(fileread );
	           
	           String s;     
	           int count=0;   //Intialize the word to zero
	            while((s=bufferread.readLine())!=null){
	            	
	           words=s.split(" ");  //Split the word using space
	           
	            for (String word : words) 
	            {
	                   if (word.contains(list))   //Search for the given word
	                   {
	                     count++;    //If Present increase the count by one
	                   }
	            }
	            
	        if(count == 1)
	        {
	        	System.out.println(list + " is unique in file ");
	        	
	        }
	        
	        else if (count == 0)
	        {
	           System.out.println(list+ "  " + "The word is not present in the file");
	          
	        }
	        else
	        {
	           System.out.println(list +"  "+"The word is present in the file "+ count +" times");
	           Path p= Files.copy(Paths.get("C:\\Users\\user017\\Desktop\\newevaluationfile1.pdf"),Paths.get("C:\\Users\\user011\\Desktop\\newfile\\newevaluationfile2.pdf"));
               if(p !=null) {
              System.out.println("File is transfer Successfuly");
             }
	        }
	        }  
	            fileread .close();
		}
		
		break;
		
		
		case 3 :
			//Back To The Main Menue 
		
			isExitSmallMenue = false;
			
			break;
		}
		
		} while (isExitSmallMenue);
		
	//	Integer n=sc.nextInt();
//		if(n==1) {
//			isExit2=true;
//		}

//			isExit2=false;
		
	//	isExit2 = false;
		
		}}
	
	





//		 String str = "https://official-joke-api.appspot.com/jokes/ten";
//         
//	        String[] words = str.split(" ");
//	         
//	        HashSet<String> uniqueWords = new HashSet<String>(Arrays.asList(words));
//	        
//	        
//	        
//	        
//		//Reading the word to be found from the user
//	      Scanner sc1 = new Scanner(System.in);
//	      System.out.println("Enter the word to be found");
//	      String word = sc1.next();
//	      boolean flag = false;
//	      int count = 0;
//	      System.out.println("Contents of the line");
//	      //Reading the contents of the file
//	      Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\user017\\Desktop\\evaluationtask\\evaluationfile.txt"));
//	      while(sc2.hasNextLine()) {
//	         String line = sc2.nextLine();
//	         System.out.println(line);
//	         if(line.indexOf(word)>=1) {
//	            flag = true;
//	            count = count+1;
//	            
//	           
//	                    }
//	                }
//	     
//	               
//	        
//	      if(flag) {
//	   
//	         System.out.println("File contains the specified word");
//	       System.out.println("Number of occurrences is: "+count);
//	       
//	       
//	       
//	      } else {
//	         System.out.println("File does not contain the specified word");
//	      }
//	      
	       
	      
	

		

//		
//		try {
//		Scanner sc1 = new Scanner(System.in);
//	      System.out.println("Enter the word to be found");
//	      String word = sc1.next();
//	      boolean flag = false;
//	      int count = word.split("\\s").length;
//	      System.out.println("Contents of the line");
//	      //Reading the contents of the file
//	      Scanner sc2 = new Scanner(new FileInputStream("C:\\Users\\user017\\Desktop\\evaluationtask\\evaluationfile.txt"));
//	      while(sc2.hasNextLine()) {
//	         String line = sc2.nextLine();
//	         System.out.println(line);
//	         if(line.indexOf(word)!=-1) {
//	            flag = true;
//	       
//	         }
//	      }
//	      
//	      if(flag) {
//	         System.out.println("File contains the specified word: " + word);
//	         System.out.println("Number of occurrences is: "+count);
//	         System.out.println("the word is dupplicate: "+ word);
//	      } else {
//	         System.out.println("File does not contain the specified word");
//	      }
//		}
//		catch (IOException e) {
//			e.printStackTrace();
//		}	
	
  //*************************************************************
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
	   
	

