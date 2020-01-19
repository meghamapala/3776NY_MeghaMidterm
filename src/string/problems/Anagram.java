package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String
        // are Anagram. Two String are called Anagram when there is
        //same character but in different order.
        // For example,"CAT" and "ACT", "ARMY" and "MARY".
        System.out.println(aGram("CAT","ACT"));
        System.out.println(aGram("ARMY","MARY"));
    }
    public static boolean aGram(String agram1,String agram2) {
        if(agram1.length() != agram2.length()){
            return  false;
        }
        char[] agram1array = agram1.toUpperCase().toCharArray();
        char[] agram2array = agram2.toUpperCase().toCharArray();

        Arrays.sort(agram1array);
        Arrays.sort(agram2array);

        for (int i = 0; i < agram1array.length; i++) {
            if (agram1array[i] != agram2array[i] ){
                    return false;
            }
        }
        return true;
    }

}
