// You can experiment here, it won’t be checked

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String str = reader.readLine();
    String a;
    String b;

    if (str.contains("a")) {
      System.out.println(str.replace('a', 'b'));
    } else if (!str.contains("a")) {
      System.out.println(str);
    }
  }
}
