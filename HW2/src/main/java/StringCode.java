import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
        int maxLenght = 0;
        int index = 0;
        while (index < str.length()) {
            int cnt = 0;
            char last =  str.charAt(index);
            while (index < str.length() && str.charAt(index) == last) {
                cnt++;
                index++;
            }
            maxLenght = Math.max(maxLenght, cnt);
        }
		return maxLenght; // YOUR CODE HERE
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
        StringBuilder s = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                if (i == str.length()-1) {
                    break;
                }
                for (int j = 1; j <= (int) (str.charAt(i) - '0'); j++) {
                    s.append(str.charAt(i + 1));
                }
            } else {
                s.append(str.charAt(i));
            }
        }
        str = s.toString();
        return str; // YOUR CODE HERE
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < a.length(); i++) {
            set.add(a.substring(i, i + len - 1));
        }
        for (int i = 0 ; i < b.length(); i++) {
            if (set.contains(b.substring(i, i + len - 1))) {
                return true;
            }
        }
		return false; // YOUR CODE HERE
	}
}
