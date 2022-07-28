import java.util.Arrays;

public class ReverseString {

//    input "caterpillar"
    public String reverseString(String s) {
        char [] reversed = new char[s.length()];

        for (int i = 0; i<s.length();i++) {
           reversed[reversed.length - 1-i] = s.charAt(i);
        }

        return String.valueOf(reversed);
    }

    public String reverseString2(String s) {

        StringBuilder reversed = new StringBuilder(s);

        for (int i = 0; i< s.length()/2; i++) {
            char charToMove = s.charAt(i);
            reversed.setCharAt(i,reversed.charAt(reversed.length()-1-i));
            reversed.setCharAt(reversed.length()-1-i,charToMove);
        }

        return reversed.toString();
    }

}

//        String reversedString = new StringBuilder(s).reverse().toString();
