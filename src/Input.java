/**
 * Created by user on 26.08.2015.
 */
import java.io.*;
import java.io.IOException;

public class Input {
    public static void main (String [] args) {
        BufferedReader str = new BufferedReader(new InputStreamReader(System.in));
        String buf;
        System.out.print("Please, input your name: ");
        try {
            buf = str.readLine();
            System.out.println ("Hi, " + buf + "!");
        } catch (IOException e){
            System.out.println ("ERROR");
        }
    }
}
