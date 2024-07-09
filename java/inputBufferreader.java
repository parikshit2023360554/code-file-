import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class inputBufferreader {
    public static void main(String arg[]) throws IOException{
        System.out.println("enter the numner");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int sum =  Integer.parseInt(bf.readLine( ));
        System.out.println(sum);

    }
}
