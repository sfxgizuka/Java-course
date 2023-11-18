package advanced.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterApp {

    public static void main(String[] args) {
        String JULIUS_CESAR_FILE_PATH = "src/advanced/filehandling/JuliusCesar2.txt";

        try (PrintWriter bookWriter = new PrintWriter(new FileWriter(JULIUS_CESAR_FILE_PATH, true))) {
            bookWriter.println("Even you, Brutus?");
            //can directly print numbers too
            bookWriter.println(10000.9);
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}