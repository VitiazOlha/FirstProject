/**
 * Created by user on 26.08.2015.
 */
import java.util.Scanner;

public class Input2 {

    public static void main(String[] args) {
        System.out.print("Please, input your name: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, " + scanner.nextLine() + "!");
    }
}