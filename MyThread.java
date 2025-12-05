public class MyThread  extends  Thread{
    @Override
    public void run(){
        System.out.println("Thread 1 is running :"+Thread.currentThread().getName());
    }
}


