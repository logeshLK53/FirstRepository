package Threads;

public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(new Demo1()); 
        t1.start();
        //Thread t2=new Thread(new Demo2());
       // t2.start();
       /*try {
        t1.join();
    } catch (InterruptedException e) {
        e.printStackTrace();
    }*/
       for(int i=0;i<3;i++)
       {
           System.out.println("L");   
       }
       System.out.println(t1.isAlive());
    }
}
class Demo1 extends Thread
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("K");
        }
    }
}

/*class Demo2 implements Runnable
{
    public void run()
    {
        for(int i=0;i<3;i++)
        {
            System.out.println("L");
        }
    }
}*/
