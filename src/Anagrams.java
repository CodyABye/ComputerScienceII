import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Anagrams {

	public static void main(String[] args) {
		//pulling arguments into variables.
		int n = Integer.parseInt(args[0]);
		String word = args[1];
		String line = " ";
		List<String> dict = new ArrayList<String>();
		List<String> lengthDict = new ArrayList<String>();
		char[] wordChars = word.toCharArray();
		List<String> finalList = new ArrayList<String>();	
		
		//pull words from dictionary file and put them into dict List
		try {
			BufferedReader br = new BufferedReader(new FileReader("src/dict.txt"));
			while(line != null) {
				String readLine = br.readLine();
				if(readLine != null) {
					line = readLine;
					dict.add(line.toLowerCase());
				}
				else {
					line = readLine;
				}
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//pull out strings of appropriate length
		for(String s: dict) {
			if(s.length() == n) {
				lengthDict.add(s);
			}
		}
		
		//for each word in the list of appropriate length words
		//go through an array of characters and check to see that they match
		//then remove the used characters from the base word so they can't
		//be used again. If the matching letters match the length of the 
		//word, add it to the list.
		for(String s: lengthDict) {
			char[] localc = s.toCharArray();
			List<Character> localWord = new ArrayList<Character>();
			for(char ch: wordChars) {
				localWord.add(ch);
			}
			int letterMatch = 0;
			for(char ch: localc) {
				for(char cha: localWord) {
					if(cha == ch) {
						letterMatch++;
						localWord.remove(localWord.indexOf(cha));
						break;
					}
				}
			}
			if(letterMatch == n) {
				finalList.add(s);
			}
		}
		
		//go through the final list and print the picked out words
		for(String s: finalList) {
			System.out.println(s);
		}
		
	}

}
