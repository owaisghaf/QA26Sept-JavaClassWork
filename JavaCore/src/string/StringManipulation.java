package string;

public class StringManipulation {
	public static void main(String[] args) {
		String name="owais"; // allocates memory to [a]
		name=name+" is the"; // takes a and adds on new value and allocates to [b]
		name=name+" best"; // takes v and adds on new value and allocates to [c]
		System.out.println(name);
		
		
		// Method 1 - creates a literal string which is interned (cached). saves memory     
        String str5 = "I like strings";
        String str6 = "I like strings";
        System.out.println(str5 == str6); // output will be: true

        // Method 2 - creates a new object which is a string. stores the string in memory.
        // Even though method 1 and 2 have the same output if you compare java will see as 2 different values
        String str3 = new String("I like strings");
        String str4 = new String("I like strings");
        System.out.println(str3 == str4); // output will be: false
		
		// convert array of characters into a string
        char[] helloArray = { 'H', 'e', 'l', 'l', 'o', '.' }; // an array of chars
        String helloString = new String(helloArray);  
        System.out.println(helloString); // prints out Hello.
        
        // finds out length of a string
        String myStr = "I like strings";
        int stringLength = myStr.length();
        System.out.println("String Length is " + stringLength);
        // output will be: String Length is 14
        
        //_____________________________________________________________________________________________________
        
        // comparing and manipulating strings
        String str1 = "ThIsIsSoMeTeXt";
        String str2 = "thisissometext";
        
        // Compares two strings ignoring case considerations:
        System.out.println(str1.equalsIgnoreCase(str2)); // output will be: true
        
        //Searches a string for a specified value and then replaces it with another value
        System.out.println(str1.replace("SoMe", "SOMEREALLYFUN"));  //output will be: ThIsIsSOMEREALLYFUNTeXt
        
        // Returns a new string that is a substring of this string.
        // start index is inclusive and endindex is exclusive
        System.out.println(str1.substring(1, 3)); // output will be: hIs
        
        // Returns true or false if the string contains the specified characters
        System.out.println(str1.contains("So")); // output will be: true
		
	}

}
