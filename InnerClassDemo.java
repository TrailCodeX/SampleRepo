public class InnerClassDemo {
    public static void main(String[] args){

        Outer outer=new Outer();
        outer.process();
        Outer.Inner inner=outer.new Inner();
        inner.show();

        Outer.Helper helper=new Outer.Helper();
        helper.show();

        Thread t=new Thread(outer.r);
        t.start();


    }
}
