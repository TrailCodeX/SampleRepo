public class ThreadDemo {
    public static void main(String[] args){
        MyThread t1=new MyThread();
        t1.start();

        RunnableDemo r=new RunnableDemo();
        Thread t2=new Thread(r);
        t2.start();

    }
}
