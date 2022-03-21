package Interface;

public class Employee implements Printable {
    public static void main(String args[])
    {
        Circle c=new Circle();
        c.print();
    }
    @Override
    public void print() {
        System.out.println("Implementing in Employee class...");
    }
}
