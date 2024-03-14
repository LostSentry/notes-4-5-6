import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {

        String filename = "ITEC_Classes.txt";

        List<String> classNames = List.of("Java", "Web", "C#");
        List<Integer> classCodes = List.of(2545, 2560, 2505);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

        for (int i = 0; i < classNames.size(); i++) {
            String name = classNames.get(i);
            int code = classCodes.get(i);
            bufferedWriter.write(String.format("ITEC %d %s \n", code, name));
        }

        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        List<String> classDescriptions = new ArrayList<>();

        String line = bufferedReader.readLine();

        while (line != null) {
            classDescriptions.add(line);
            line = bufferedReader.readLine();
        }
        System.out.println("End of file reached");
        System.out.println(classDescriptions);
    }
}
