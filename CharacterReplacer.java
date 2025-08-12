/*Logic
Replace all occurrences of ch1 with ch2 and all ch2 with ch1.
Return the modified string.
If input string is null, return null.
If both characters are the same or neither character is present, return the string unchanged.
Assumption: String contains only lowercase letters.*/

import java.util.*;
public class CharacterReplacer {
    public static String replaceCharacter(String str, char ch1, char ch2) {
        if (str == null) {
            return null;
        }
        if (ch1 == ch2) {
            return str;  // No need for replacement if both characters are same
        }
        boolean foundCh1 = false, foundCh2 = false;
        char[] chars = str.toCharArray();
        for (char c : chars) {
            if (c == ch1) foundCh1 = true;
            if (c == ch2) foundCh2 = true;
        }
        if (!foundCh1 && !foundCh2) {
            return str;  // No character found
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ch1) {
                chars[i] = ch2;
            } else if (chars[i] == ch2) {
                chars[i] = ch1;
            }
        }
        return new String(chars);
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
        String input =sc.nextLine();
		System.out.println("Enter replacing characters:");
        char ch1 =sc.next().charAt(0);
        char ch2 =sc.next().charAt(0);
        String result = replaceCharacter(input, ch1, ch2);
        System.out.println("Modified string: " + result);  
    }
}