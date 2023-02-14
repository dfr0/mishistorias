
public class MyChar {
	private char ch;

	public MyChar(char ch) {
			this.ch = ch;
	}
	public boolean isVowel() {
		if(Character.toUpperCase(ch) == 'a' || Character.toUpperCase(ch) == 'e' || Character.toUpperCase(ch) == 'i' || Character.toUpperCase(ch) == 'o' || Character.toUpperCase(ch) == 'u')
		  return true;
		//else
	    return false;
	}
	
	public boolean isDigit() {
		if(ch >= 48 && ch <= 57) //On Unicode from '0' to '9'
		  return true;
		return false;
	}
	public boolean isAlphabet() {
		if(ch >= 97 && ch <= 122) //Between 'a' and 'z'
		  return true;
		if(ch >= 65 && ch <= 90) //Between 'A' and 'Z'
		  return true;
		return false;
	}
	
	public boolean isConsonant() {
		if(isAlphabet() && isVowel())
			return false;
		return true;
	}
	public static void printLowerCaseAlphabets() {
		for(char ch = 'a'; ch <= 'z'; ch ++)
		System.out.println(ch);
	}
	public static void printUpperCaseAlphabets() {
		for(char ch = 'A'; ch <= 'Z'; ch ++)
		System.out.println(ch);
		
	}
}
