package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that
          is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given
          String is Palindrome or not.
         */
        String word1 = "MOM";
        String word2 = "DAD";
        String word3 = "MADAM";

        System.out.println(Pdrom(word1));
        System.out.println(Pdrom(word2));
        System.out.println(Pdrom(word3));
    }
    public static boolean Pdrom(String val) {
        String word1 = val.toUpperCase();
        String reverseWord = "";
        for (int i = word1.length()-1; i >= 0; i--) {
            reverseWord = reverseWord + word1.charAt(i);
        }
        return word1.equals(reverseWord);
    }
}
