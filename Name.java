import java.io.*;

public class Name {
    public static void main(String[] args) throws IOException {

        String name = "Reyna";
        String favColor = "Purple";
        String classCode = "2545";

        FileWriter writer = new FileWriter("name.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write(name + "\n");
        bufferedWriter.write(favColor +"\n");
        bufferedWriter.write(classCode + "\n");

        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("name.txt"));

        String line = bufferedReader.readLine();

        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();


    }
}
