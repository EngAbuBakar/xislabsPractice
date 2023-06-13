package Threads;

public class ThreadByExtendThreadClass extends Thread {
    public void run()
    {
        for (int i=1;i<=10;i++)
        {
            int num=2;
            System.out.println(num+"*"+i+"="+i*num);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    public static void main(String[] args) {
      ThreadByExtendThreadClass threadByExtendThreadClass=new ThreadByExtendThreadClass();
      Thread thread=new Thread(threadByExtendThreadClass);

       thread.start();



    }

}
