import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {
    public static void main(String[] args) throws IOException { // acknowledge an error might happen

        // file will be crated if it does not exist
        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("Hello!\n"); // \n or .newLine()
        bufferedWriter.write("More data here\n");
        bufferedWriter.write("Goodbye!\n");

        bufferedWriter.close(); // don't forget! if you do the written text will be thrown away
        // if run multiple times it will overwrite the text in the hello.txt file

        FileWriter writer2 = new FileWriter("hello.txt", true); //append flag - true = add to end
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

        bufferedWriter2.write("Other data!");
        bufferedWriter2.newLine();
        bufferedWriter2.write("Hello programmers");
        bufferedWriter2.newLine();
        bufferedWriter2.write("End of file!");
        bufferedWriter2.newLine();

        bufferedWriter2.close();
    }
}
