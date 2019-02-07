import java.util.Arrays;

public class Anagram {


    public boolean ifAnagram (String string1, String string2) {

        if (string1.length() != string2.length()) {
            return false;
        }
        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();
        char[] c1 = string1.toCharArray();
        char[] c2 = string2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String sc1 = new String(c1);
        String sc2 = new String(c2);
        return sc1.equals(sc2);
    }
}
