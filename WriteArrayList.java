import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {

        List<String> classNames = List.of("Java", "Web", "C#");
        List<Integer> classCodes = List.of(2545, 2560, 2505);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ITEC_Classes.txt"));
    }
}
