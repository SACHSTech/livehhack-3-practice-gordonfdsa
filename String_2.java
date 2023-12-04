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

  public static int countCode(String str) {
    int ans = 0;
    for (int i = 0; i < str.length() - 3; i++) {
      if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e')
        ans += 1;
    }
    return ans;
  }

  public boolean bobThere(String str) {
    for (int i = 0; i < str.length() - 2; i++) {
      if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b')
        return true;
    }
    return false;

  }

}
