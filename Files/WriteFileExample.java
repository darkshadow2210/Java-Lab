import java.io.*;

public class WriteFileExample {
    public static void main(String[] args) {
        // File path
        String filePath = "output.txt";
        
        // Create FileWriter for writing to the file
        try (FileWriter fw = new FileWriter(filePath)) {
            fw.write("Hello, World!\n");
            fw.write("This is a simple file handling example in Java.");
            
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}
