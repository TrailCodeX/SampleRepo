class Parent {
    synchronized void print() {
        for(int i=1;i<=5;i++){
            System.out.print(i+" ");
        }
    }
}

class Child extends Parent {
    @Override
    synchronized void print() {
        for(int i=1;i<=5;i++){
            System.out.println(i+" * ");
        }
    }
}


public class SynchronizedThreadTest {
    public static void main(String[] args){
        Parent obj = new Child();

        Thread t1 = new Thread(() -> obj.print());
        Thread t2 = new Thread(() -> obj.print());

        t1.start();
        t2.start();



    }
}
