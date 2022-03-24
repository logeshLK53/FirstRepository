package Interface;

public class Employee3 implements Cloneable {
    String date_of_birth;
    public Employee3(String date_of_birth)
    {
        this.date_of_birth=date_of_birth;
    }
    protected Object clone() throws CloneNotSupportedException
    {
       return super.clone();
    }

    public static void main(String args[]) throws CloneNotSupportedException
    {
        Employee3 shallowCopy=new Employee3("29-12-1998");
        Employee3 deepCopy=(Employee3)shallowCopy.clone();
        System.out.print(deepCopy.date_of_birth);
    }
}
