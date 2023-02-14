
public class MyCharRunner {

	public static void main(String[] args) {
		MyChar myChar = new  MyChar('A');
		System.out.println("is Vowel");
		System.out.println(myChar.isVowel());
		System.out.println("is Consonant"); 
		System.out.println(myChar.isConsonant()); 
		System.out.println("is Digit");
		System.out.println(myChar.isDigit());
		System.out.println("is Alphabet");
		System.out.println(myChar.isAlphabet());
		
		//We dont new create a new object, only need a static method
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
	}

}
