package Interface;

public class CloneEmployee implements Cloneable {
    String date_of_birth;
    public CloneEmployee(String date_of_birth)
    {
        this.date_of_birth=date_of_birth;
    }
    protected Object clone() throws CloneNotSupportedException
    {
       return super.clone();
    }

    public static void main(String args[]) throws CloneNotSupportedException
    {
        CloneEmployee shallowCopy=new CloneEmployee("29-12-1998");
        CloneEmployee deepCopy=(CloneEmployee)shallowCopy.clone();
        System.out.print(deepCopy.date_of_birth);
    }
}
