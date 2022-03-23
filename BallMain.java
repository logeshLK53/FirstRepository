import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BallMain {
    public static void main(String[] args) {
        try{
        Ball b = new Ball("Red", 80, "Leather", "Cricket");
            FileOutputStream fos = new FileOutputStream("welcome.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(b);
            oos.flush();
            oos.close();
            fos.close();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
