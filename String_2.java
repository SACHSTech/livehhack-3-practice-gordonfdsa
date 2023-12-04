import java.util.*;
import java.lang.Math.*;

public class String_2 {

  public static void main(String[] args) {

    System.out.println(prefixAgain("abXYabc", 2));
  }

  public static String doubleChar(String str) {
    String ans = "";
    for (int i = 0; i < str.length(); i++) {
      ans += str.charAt(i);
      ans += str.charAt(i);
    }
    return ans;
  }

  public static int countCode(String str) {
    int ans = 0;
    for (int i = 0; i < str.length() - 3; i++) {
      if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e')
        ans += 1;
    }
    return ans;
  }

  public static boolean bobThere(String str) {
    for (int i = 0; i < str.length() - 2; i++) {
      if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
        return true;
    }
    return false;
  }

  public static String repeatEnd(String str, int n) {
    String ans = "";
    for (int i = 0; i < n; i++) {
      ans += str.substring(str.length() - n, str.length());
    }
    return ans;
  }

  public static boolean prefixAgain(String str, int n) {
    String prefix = str.substring(0, n);
    str = str.substring(n, str.length());
    return str.contains(prefix);
  }

  public static boolean sameStarChar(String str) {
    // ignore first and last character as it doens't matter anyways if its a star
    for (int i = 1; i < str.length() - 1; i++) {
      if (str.charAt(i) == '*') {
        //if the 2 characters beside the star are not same, return false
        if (str.charAt(i - 1) != str.charAt(i + 1)) {
          return false;
        }
      }
    }
    return true;
  }

  public static String starOut(String str) {
    boolean[] arr = new boolean[str.length()];
    String ans = "";
    for (int i = 0; i < str.length(); i++) {
      // just to make sure arr doens't go out of bounds
      if (str.charAt(i) == '*') {
        arr[Math.min(i + 1, str.length() - 1)] = true;
        arr[Math.max(i - 1, 0)] = true;
        arr[i] = true;
      }
    }

    for (int i = 0; i < str.length(); i++) {
      // just to make sure arr doens't go out of bounds
      if (!arr[i]) {
        ans += str.charAt(i);
      }
    }
    return ans;
  }

}
