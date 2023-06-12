package LambdaPractice;

public class ThreadExample {
    public static void main(String[] args) {

        Runnable thread=()->
        {
          for(int i=0;i<=10;i++)
          {
              System.out.println(i);
              try {
                  Thread.sleep(1000);
              } catch (InterruptedException e) {
                  throw new RuntimeException(e);
              }
          }
        };
        Thread thread1=new Thread(thread);
        thread1.setName("Smart banking");
        thread1.start();


        // Creating another thread
          Runnable thread2=()->
          {
             for (int i=1;i<=10;i++)
             {
                 System.out.println("2 * "+i+"="+i*2);
                 try {
                     Thread.sleep(2000);
                 } catch (InterruptedException e) {
                     throw new RuntimeException(e);
                 }

             }
          };
          Thread t2=new Thread(thread2);
          t2.start();
    }
}
