import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ThrowsFromMethod {
    public static void main(String[] args) {

        String filename = "not_exists.txt";

        try {

            List<String> data = readFromFile(filename);
            System.out.println(data);
        }
        catch (FileNotFoundException fnfe) {
            System.out.println(filename + " was not found. Fix and try again");
        }
        catch (IOException e) {
            System.out.println("Could not read from file "+ filename);
        }
    }

    private static List<String> readFromFile(String filename) throws IOException {

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {

            //BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

            List<String> lines = new ArrayList<>();
            String line = bufferedReader.readLine();
            while (line != null) {
                lines.add(line);
                line = bufferedReader.readLine();
            }

            //bufferedReader.close();

            return lines;
        } catch (IOException e) {
            System.out.println("sorry, error or file not found. " + e);
        }
        return null;
    }
}
