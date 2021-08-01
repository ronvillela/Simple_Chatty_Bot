
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);    
        String str = scanner.next();

        if (str.contains("a")) {
            System.out.println(str.replace('a', 'b'));
        } else if (!str.contains("a")) {
            System.out.println(str);
        }
    }
}
