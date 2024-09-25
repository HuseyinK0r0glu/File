import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("code.txt");
        if(!file.exists()){
            file.createNewFile();
        }

        String val = "time for coding";
        FileWriter fWriter = new FileWriter(file,false);
        BufferedWriter bWriter = new BufferedWriter(fWriter);
        bWriter.write(val);
        bWriter.close();

        String line;
        FileReader fReader = new FileReader(file);
        BufferedReader bReader = new BufferedReader(fReader);
        while ((line = bReader.readLine()) != null){
            System.out.println(line);
        }

    }
}