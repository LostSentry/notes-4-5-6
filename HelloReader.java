import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class HelloReader {
    public static void main(String[] args) throws IOException {

        //FileReader reader = new FileReader("hello.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("hello.txt"));

        String line = bufferedReader.readLine();

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
            //line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}
