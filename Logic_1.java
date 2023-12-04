import java.util.*;
import java.lang.Math.*;

public class Logic_1 {
  public static void main(String[] args) {
    // make test calls to your methods here

    System.out.println(in1To10(21, true));
    System.out.println(lessBy10(1231, 121, 11));
  }

  public static int sortaSum(int a, int b) {
    int x = a + b;
    if (x >= 10 && x <= 19)
      return 20;
    else
      return x;
  }

  // define your methods here
  public static boolean in1To10(int n, boolean outsideMode) {
    if (outsideMode) {
      return (n <= 1 || n >= 10);
    } else {
      return (n >= 1 && n <= 10);
    }
  }

  public boolean old35(int n) {
    // exclusive or
    return n % 5 == 0 ^ n % 3 == 0;
  }

  public static boolean inOrder(int a, int b, int c, boolean bOk) {
    if (bOk) {
      return c > b;
    } else {
      return b > a && c > b;
    }
  }

  public static boolean lessBy10(int a, int b, int c) {
    return (Math.abs(a - b) >= 10 || Math.abs(c - b) >= 10 || Math.abs(a - c) >= 10);
  }

  public static int redTicket(int a, int b, int c) {
    if (a == 2 && b == 2 && c == 2)
      return 10;
    if (a == b && b == c)
      return 5;
    if (b != a && c != a)
      return 1;
    return 0;
  }

  public static boolean shareDigit(int a, int b) {

    if (a / 10 == b / 10 || a / 10 == b % 10)
      return true;
    if (a % 10 == b / 10 || a % 10 == b % 10)
      return true;
    return false;
  }

  public static String alarmClock(int day, boolean vacation) {
    if (day == 6 || day == 0) {
      if (vacation)
        return "off";
      else
        return "10:00";
    } else {
      if (vacation)
        return "10:00";
      else
        return "7:00";
    }
  }

}
