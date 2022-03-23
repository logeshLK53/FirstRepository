package FileHandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;

public class PipesAndSequence {
   public static void main(String[] args) {
       //pipes
       try{
           PipedInputStream pi = new PipedInputStream();
           PipedOutputStream po = new PipedOutputStream();
           pi.connect(po);
           po.write(76);
           po.write(75);
           System.err.print((char)pi.read());
           System.err.println((char)pi.read());

           pi.close();
           po.close();
       }
       catch(IOException e)
       {
           System.out.println(e.getMessage());
       }

       //sequence
       try{
        FileInputStream f1 = new FileInputStream("FileHandling/demo.txt");
        FileInputStream f2 = new FileInputStream("FileHandling/demo.txt");
        
        SequenceInputStream si = new SequenceInputStream(f1,f2);
        int val;
            while((val=si.read()) != -1) {
                System.out.print((char) val);
            }
        si.close();
        f1.close();
        f2.close();
    }
    catch(IOException e)
    {
        System.out.println(e.getMessage());
    }
   } 
}
