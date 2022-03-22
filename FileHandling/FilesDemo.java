package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesDemo {
    public static void main(String[] args) throws IOException {
        File file=new File("FileHandling/demo.txt");
        
        //Read the file
        FileReader fReader=new FileReader(file);
        while(true) {
            int val = fReader.read();
            if(val == -1) {
                break;
            }
            System.out.print((char) val);
        }
        fReader.close();

        //Write the File
        FileWriter fWriter=new FileWriter(file,true);
        fWriter.append(" the King");
        fWriter.close();

    }
}
