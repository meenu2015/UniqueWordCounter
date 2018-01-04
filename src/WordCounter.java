import java.util.HashMap;
import java.util.Scanner;

class WordCounter {
	public static void main(String[] args) {
		//Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to check for unique words");
        String inputString = scanner.nextLine();
        
        //Find and store words in lower case in an array.
        //To avoid splitting words like can't, don't, won't etc exclude apostrophe 
        String words[] = inputString.toLowerCase().split("[^\\w']+");
        
        //Create a Hashmap to store unique words and their occurrences  
        HashMap<String, Integer> uniqueWords = new HashMap<String , Integer>();
        
        for(int i = 0; i < words.length; i++)
        {
        	if(uniqueWords.containsKey(words[i]))
        	{
        		uniqueWords.put(words[i], uniqueWords.get(words[i])+1);		
        	}
        	else
        	{
        		uniqueWords.put(words[i], 1);
        	}
        }

        //Print the words from hashmap along with the count
        for(String word : uniqueWords.keySet())
        {
        	System.out.println(word + " - " + uniqueWords.get(word));
        }
        
        scanner.close();
	}

}
