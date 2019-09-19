import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AffineCipher {

	public static void main(String[] args) {
		
		//get arguments and enable file reader
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int m;
		File file = new File(args[2]);
		Reader fr = null;
		try {
			fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		//list to hold encoding text up to 1000 characters
		char encodingText[] = new char [1000];
		try {
			fr.read(encodingText);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//populate map with numbers indexed by letters
		//START ALPHABET MAP
		Map<Character, Integer> alphabets = new HashMap<Character, Integer>();
		Map<Integer, Character> returnAlpha = new HashMap<Integer, Character>();
		int i = 0;
		for(char c = 'a'; c <= 'z'; c++ ) {
			alphabets.put(c, i);
			returnAlpha.put(i, c);
			i++;
		}
		for(char c = 'A'; c <= 'Z'; c++ ) {
			alphabets.put(c, i);
			returnAlpha.put(i, c);
			i++;
		}
		alphabets.put(' ', i);
		returnAlpha.put(i, ' ');
		m = alphabets.size();
		//END ALPHABET MAP
		
		//create list to hold encrypted numbers. 
		List<String> baseNumCode = new ArrayList<String>();
		
		//for each character in the text file, encrypt the character and add it to the list
		for(char c: encodingText) {
			if(alphabets.containsKey(c)) {
				baseNumCode.add(Character.toString(returnAlpha.get(encryptNumber(a, b, m, alphabets.get(c)))));
			}
			else {
				baseNumCode.add(Character.toString(c));
			}
		}
		for(String n: baseNumCode) {
			System.out.print(n);
		}
		
		
	}
	//encrypt number code
	public static int encryptNumber(int a, int b, int m, int i) {
		int newNum;
		newNum = (a*i+b)%m;
		return newNum;
	}

}
