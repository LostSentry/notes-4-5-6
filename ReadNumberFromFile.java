import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNumberFromFile {
    public static void main(String[] args) throws IOException {

        List<Integer> numbers = new ArrayList<>();
        String filename = "numbers.txt";

        BufferedReader reader = new BufferedReader(new FileReader(filename));

        String line = reader.readLine();

        while (line != null) {
            // ignore non ints
            try {
                int number = Integer.parseInt(line);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println(line + " is not an int, ignoring");
            }
                line = reader.readLine();
        }
        System.out.println(numbers);
    }
}
