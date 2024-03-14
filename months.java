import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
public class months {
    public static void main(String[] args) throws IOException {

        String filename = "months.txt";
        List<String> months = List.of("Jan", "Feb", "Mar");

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

        for (int i = 0; i < months.size(); i++) {
            String month = months.get(i);
            bufferedWriter.write(String.format("%s \n", month));
        }
        bufferedWriter.close();
    }
}
