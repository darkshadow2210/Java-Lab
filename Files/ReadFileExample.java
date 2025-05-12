import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        // File path
        String filePath = "output.txt";

        // Read the content from the file
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);  // Print each line read from the file
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
