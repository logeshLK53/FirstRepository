package Interface;
interface sortable
{
    void sortAll();
}
 class Employee2 implements sortable{
    public int[] arr;
    public Employee2(int []arr)
    {
        this.arr=arr;
    }
    public static void main(String[] args) {
        int[] arr ={3,8,1,9,4};
        Employee2 e=new Employee2(arr);
        e.sortAll();
    }
@Override
public void sortAll()
{
     for(int i=0;i<arr.length-1;i++)
     {
        int temp=0;
        for(int j=i+1;j<arr.length;j++)
        {
            if(arr[i]>arr[j])
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
     }
     for(int i:arr)
     {
         System.out.println(i+" ");
     }
}
}
