package FileHandling;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccess {
    public static void main(String[] args) {
        try{
            RandomAccessFile raf=new RandomAccessFile("FileHandling/demo.txt","rw");
            raf.seek(3);
            //System.out.println((char)raf.read());
            System.out.println(raf.readLine());
            //raf.write(76);
            //raf.writeDouble(53.53);
            //raf.writeFloat((float)53.5);
            System.out.println(raf.length());
           
            raf.close();
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
     }
}
