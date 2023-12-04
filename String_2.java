import java.util.*;
import java.lang.Math.*;

public class String_2 {

    public static void main(String[] args) {

    }

    public static String doubleChar(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            ans += str.charAt(i);
            ans += str.charAt(i);
        }
        return ans;
    }

}
