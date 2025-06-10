import java.io.*;

public class CharacterFile {
    public static void main(String args[]) {
        File inFile = new File("Input.dat");
        File outFile = new File("Output.dat");
        FileReader ins = null;
        FileWriter outs = null;
        try {
            ins = new FileReader(inFile);
            outs = new FileWriter(outFile);
            int ch;
            while ((ch = ins.read()) != -1)
                outs.write(ch);
        } catch (IOException e) {
            System.out.println(e);
            System.exit(-1);
        } finally {
            try {
                ins.close();
                outs.close();
            } catch (IOException e) {
            }
        }
    }
}